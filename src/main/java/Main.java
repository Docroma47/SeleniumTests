import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
//    static WebDriver driver;
    static WebDriver driverChrome;
//    static WebDriverWait wait;
//    static WebDriverWait wait2;

    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "A:\\Proj\\TestSelenium\\drivers\\chromedriver.exe");

//        driver = new FirefoxDriver();
        driverChrome = new ChromeDriver();
//        wait  = (new WebDriverWait(driver, 5));
//        wait2  = (new WebDriverWait(driver, 10));

        driverChrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driverChrome.manage().window().maximize();
        driverChrome.get("https://en.wikipedia.org");

        JavascriptExecutor jse = (JavascriptExecutor)driverChrome;
//        jse.executeScript("alert('Hello World!');");
        jse.executeScript("window.scrollBy(0, 1000)", "");
        jse.executeScript("window.scrollBy(0, -500)", "");

//        driverChrome.quit();
    }

}
