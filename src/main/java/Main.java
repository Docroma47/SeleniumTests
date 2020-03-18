import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://github.com");
    }

}
