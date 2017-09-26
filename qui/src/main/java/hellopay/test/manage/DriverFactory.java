package hellopay.test.manage;

import hellopay.test.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;

        if (browserType.equals(Constants.CHROME)) {
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        }

        return driver;
    }

}
