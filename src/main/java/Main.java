import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().setSize(new Dimension(900, 500));

        driver.get("https://github.com");
        driver.navigate().to("http://seleniumhq.org");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}
