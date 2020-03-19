import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main {
    static WebDriver driver;
//    static WebDriver driverChrome;
    static WebDriverWait wait;
    static WebDriverWait wait2;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "A:\\Proj\\TestSelenium\\drivers\\chromedriver.exe");

        driver = new FirefoxDriver();
//        driverChrome = new ChromeDriver();
        wait  = (new WebDriverWait(driver, 5));
        wait2  = (new WebDriverWait(driver, 10));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org");

        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));

        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");
        Thread.sleep(2000);
        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "test"));
        Thread.sleep(2000);
        searchInput.sendKeys(select);
        Thread.sleep(2000);
        searchInput.sendKeys(cut);
        Thread.sleep(2000);
        searchInput.sendKeys(paste);
    }

}
