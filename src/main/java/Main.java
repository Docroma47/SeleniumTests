import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        driver.get("https://images.google.com/");
        ////input[@type='file'] ////div[@aria-label="Поиск по картинке"]/span
        driver.findElement(By.xpath("//div[@aria-label=\"Поиск по картинке\"]/span")).click();
        driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("A:\\Proj\\User\\screenShots\\screen.png");
//        driver.quit();
    }

}
