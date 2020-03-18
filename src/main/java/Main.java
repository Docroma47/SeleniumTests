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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");

        WebElement link = driver.findElement(By.xpath("//li[@id=\"n-aboutsite\"]/a"));
        System.out.println(link.getText());
        link.click();

//        driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys(new String[]{"Selenium Webdriver"});
//        driver.findElement(By.xpath("//*[@id='searchButton']")).click();
//        System.out.println(driver.findElement(By.xpath("//*[@id='ooui-php-1']")).getAttribute("Value"));
//        driver.findElement(By.xpath("//*[@id='ooui-php-1']")).clear();
//
        driver.get("https://github.com");
        driver.findElement(By.xpath("//li[@class='border-bottom border-lg-bottom-0 mr-0 mr-lg-3']/a")).click();

//        driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).sendKeys(new String[]{"testusername"});
//        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys(new String[]{"testpass"});
//        WebElement button = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div[2]/div[1]/form/button"));
//        button.submit();

//        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
//        if (button.getText().equals("Sign up for GitHub")) System.out.println("Success!");
//        else System.out.println("Fail!");
////        button.submit();
////        driver.quit();
//
//        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
//
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//td[@class=\"login_form_label_field\"]/div/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(new String[]{"testName"});
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(new String[]{"testPassword"});
//        WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
//        logInButton.submit();
//        System.out.println("Your eMail is: " + driver.findElement(By.xpath("//*[@autocomplete='username']")).getAttribute("Value"));
    }

}
