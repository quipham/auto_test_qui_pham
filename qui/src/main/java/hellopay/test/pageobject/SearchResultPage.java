package hellopay.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

    private static final String XPATH_LIST_RESULT_ITEMS = "//div[@class = 'c-product-card__description']/a";

    @FindBy(xpath = XPATH_LIST_RESULT_ITEMS)
    public List<WebElement> resultItemList;

    public void scrollToResultList() {
        Actions actions = new Actions(driver);
        actions.moveToElement(resultItemList.get(0));
        actions.perform();
    }

    public boolean isCorrectResult(String searchKeyword) {
        boolean isResult = true;

        for (WebElement resultItem : resultItemList) {
            if (!resultItem.getText().toLowerCase().contains(searchKeyword)) {
                isResult = false;
                break;
            }
        }

        return isResult;
    }

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
}
