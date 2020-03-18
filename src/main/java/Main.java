import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");
        WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
        WebElement serchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement searchId = driver.findElement(By.id("ca-viewsource"));
        WebElement searchInput = driver.findElement(By.tagName("input"));
        WebElement searcCSS = driver.findElement(By.cssSelector("div#p-search"));
        WebElement logo = driver.findElement(By.xpath("//div[@id='p-logo']/a"));

        driver.quit();
    }

}
