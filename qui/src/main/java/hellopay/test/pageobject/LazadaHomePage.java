package hellopay.test.pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import hellopay.test.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LazadaHomePage extends BasePage {

    private static final String HOMEPAGE_TITLE = "LAZADA Vietnam™ - Mua Hàng Trực Tuyến Giá Tốt";

    private static final String XPATH_SEARCH_BOX = "//input[@type = 'search']";

    private static final String XPATH_SEARCH_BTN = "//button[@class = 'c-header-search__input-group-button c-header-search__input-group-button_type_search']";

    @FindBy(xpath = XPATH_SEARCH_BOX)
    private WebElement searchBox;

    @FindBy(xpath = XPATH_SEARCH_BTN)
    private WebElement searchBtn;

    public void goToHere() {
        driver.get(Constants.BASE_URL);
        assertThat(driver.getTitle(), is(HOMEPAGE_TITLE));
    }

    public void searchKeyword(String keyword) {
        searchBox.sendKeys(keyword);
        searchBtn.click();
    }

    public LazadaHomePage(WebDriver driver) {
        super(driver);
    }
}
