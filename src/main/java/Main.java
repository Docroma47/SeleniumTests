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
        driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();

        driver.get("https://github.com");
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        if (button.getText().equals("Sign up for GitHub")) System.out.println("Success!");
        else System.out.println("Fail!");
//        button.submit();
//        driver.quit();

        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@type='submit']")).click();//submit not a worked
    }

}
