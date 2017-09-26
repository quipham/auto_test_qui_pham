package hellopay.test.pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import hellopay.test.common.Constants;
import hellopay.test.common.PageUtils;
import hellopay.test.model.CustomerInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    private static final String REGISTER_PAGE_TITLE = "Lazada - Create new customer account";

    // id constants
    private static final String ID_CHECKBOX_MALE = "RegistrationForm_gender_0";

    private static final String ID_CHECKBOX_FEMALE = "RegistrationForm_gender_1";

    private static final String ID_INPUT_EMAIL = "RegistrationForm_email";

    private static final String ID_INPUT_FULLNAME = "RegistrationForm_first_name";

    private static final String ID_INPUT_DATE = "RegistrationForm_day";

    private static final String ID_INPUT_MONTH = "RegistrationForm_month";

    private static final String ID_INPUT_YEAR = "RegistrationForm_year";

    private static final String ID_INPUT_PASSWORD = "RegistrationForm_password";

    private static final String ID_INPUT_CONFIRM_PASSWORD = "RegistrationForm_password2";

    private static final String ID_BTN_SEND = "send";

    private static final String XPATH_ERROR_MESSAEG = "//div[@class = 's-error']";


    // id variables
    @FindBy(id = ID_CHECKBOX_MALE)
    public WebElement checkboxMale;

    @FindBy(id = ID_CHECKBOX_FEMALE)
    public WebElement checkboxFemale;

    @FindBy(id = ID_INPUT_EMAIL)
    public WebElement inputEmail;

    @FindBy(id = ID_INPUT_FULLNAME)
    public WebElement inputFullName;

    @FindBy(id = ID_INPUT_DATE)
    public WebElement inputDate;

    @FindBy(id = ID_INPUT_MONTH)
    public WebElement inputMonth;

    @FindBy(id = ID_INPUT_YEAR)
    public WebElement inputYear;

    @FindBy(id = ID_INPUT_PASSWORD)
    public WebElement inputPassword;

    @FindBy(id = ID_INPUT_CONFIRM_PASSWORD)
    public WebElement inputConfirmPassword;

    @FindBy(id = ID_BTN_SEND)
    public WebElement btnSend;

    @FindBy(xpath = XPATH_ERROR_MESSAEG)
    public WebElement errorMessage;

    public String getExceptionMessage() {
        return errorMessage.getText();
    }

    public void goToHere() {
        driver.get(Constants.REGISTER_URL);
        assertThat(driver.getTitle(), is(REGISTER_PAGE_TITLE));
    }

    public void createNewCustomer(CustomerInfo customerInfo) {
        if (customerInfo.getGender().equals(Constants.MALE))
            checkboxMale.click();
        else checkboxFemale.click();

        PageUtils.enterText(inputEmail, customerInfo.getEmail());
        PageUtils.enterText(inputFullName, customerInfo.getName());

        PageUtils.selectDropBoxValue(inputDate, customerInfo.getDateOfBirth());
        PageUtils.selectDropBoxValue(inputMonth, customerInfo.getMonthOfBirth());
        PageUtils.selectDropBoxValue(inputYear, customerInfo.getYearOfBirth());

        PageUtils.enterText(inputPassword, customerInfo.getPassword());
        PageUtils.enterText(inputConfirmPassword, customerInfo.getPassword());

        btnSend.click();
    }

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
}
