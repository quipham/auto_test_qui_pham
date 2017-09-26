package stepdefination;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellopay.test.common.AutomationConfig;
import hellopay.test.manage.DriverFactory;
import hellopay.test.model.CustomerInfo;
import hellopay.test.pageobject.LazadaHomePage;
import hellopay.test.pageobject.RegisterPage;
import hellopay.test.pageobject.SearchResultPage;
import org.openqa.selenium.WebDriver;

public class SampleSteps {

    private WebDriver driver = DriverFactory.getDriver(AutomationConfig.BROWSER_TYPE);

    private LazadaHomePage lazadaHomePage = new LazadaHomePage(driver);

    private SearchResultPage searchResultPage = new SearchResultPage(driver);

    private RegisterPage registerPage = new RegisterPage(driver);

    private CustomerInfo customerInfo = new CustomerInfo().setName("Qui Pham")
            .setDateOfBirth("14")
            .setMonthOfBirth("08")
            .setYearOfBirth("1990")
            .setEmail("qui.phamnhu@gmail.com")
            .setGender("male")
            .setPassword("SomeRandomPWD@123");

    private final String ERROR_MSG_EXISTED_CUSTOMER = "'" + customerInfo.getEmail() + "'" + " đã tồn tại trong hệ thống";

    @Given("^I am at Lazada Register Page$")
    public void i_am_at_Lazada_Register_Page() {
        registerPage.goToHere();
    }

    @When("^I register with the info of existed customer$")
    public void i_register_with_the_info_of_existed_customer() {
        registerPage.createNewCustomer(customerInfo);
    }

    @Then("^I saw the error message for existed customer exception$")
    public void i_saw_the_error_message_for_existed_customer_exception() {
        assertThat(registerPage.getExceptionMessage(), is(ERROR_MSG_EXISTED_CUSTOMER));
    }

    @Given("^I am at Lazada Search Page$")
    public void i_am_at_Lazada_Search_Page() {
        lazadaHomePage.goToHere();
    }

    @When("^I search with keyword \"([^\"]*)\"$")
    public void i_search_with_keyword(String keyword) {
        lazadaHomePage.searchKeyword(keyword);
        assertThat(searchResultPage.isCorrectResult(keyword), is(true));
    }

    @Then("^I saw list of correct result$")
    public void i_saw_list_of_correct_result() {
        searchResultPage.scrollToResultList();
    }

}
