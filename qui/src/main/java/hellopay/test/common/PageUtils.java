package hellopay.test.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtils {

    public static void enterText(WebElement element, String strData) {
        element.sendKeys(strData);
    }

    public static void selectDropBoxValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    private PageUtils() {
    }
}
