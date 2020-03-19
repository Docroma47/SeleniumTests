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
    static WebDriver driver;
    static WebDriver driverChrome;
//    static WebDriverWait wait;
//    static WebDriverWait wait2;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "A:\\Proj\\TestSelenium\\drivers\\chromedriver.exe");

//        driver = new FirefoxDriver();
        driverChrome = new ChromeDriver();
//        wait  = (new WebDriverWait(driver, 5));
//        wait2  = (new WebDriverWait(driver, 10));

        driverChrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driverChrome.manage().window().maximize();
//        driverChrome.get("https://basicweb.ru/html/primer/41a.php");
//        WebElement buttom1 = driverChrome.findElement(By.xpath("//button[text()='Элемент отключен']"));
//        WebElement buttom2 = driverChrome.findElement(By.xpath("//button[text()='Элемент активен']"));
//
//        System.out.println(buttom1.isEnabled());
//        System.out.println(buttom2.isEnabled());
//
//        if (buttom1.isEnabled()) driverChrome.get("https://mail.ru");
//        if (buttom2.isEnabled()) driverChrome.get("https://account.mail.ru/signup?from=main&rf=auth.mail.ru");
//        WebElement radioBut = driverChrome.findElement(By.xpath("//label[@data-test-id=\"gender-male\"]//input"));
//        WebElement radioBut2 = driverChrome.findElement(By.xpath("//label[@data-test-id=\"gender-female\"]//input"));
//
//        if (!(radioBut.isSelected())) {
//            driverChrome.findElement(By.xpath("//label[@data-test-id=\"gender-male\"]//span")).click();
//        }
//
//        if (radioBut2.isSelected()) {
//            System.out.println("WAAAT?!");
//        }
        driverChrome.get("http://ebay.com");

        WebElement link1 = driverChrome.findElement(By.xpath("//a[text()='Samsung']"));
        WebElement link2 = driverChrome.findElement(By.xpath("//li[@class=\"hl-cat-nav__js-tab\"]//a[text()='Мода']"));

        System.out.println(link1.isDisplayed());
        System.out.println(link2.isDisplayed());

        if (link1.isDisplayed()) link1.click();
        else link2.click();

    }

}
