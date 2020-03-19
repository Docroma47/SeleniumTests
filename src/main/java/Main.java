import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;
    static WebDriverWait wait;
    static WebDriverWait wait2;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        wait  = (new WebDriverWait(driver, 5));
        wait2  = (new WebDriverWait(driver, 10));

//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");//ij_bmonth//ij_byear//ij_bday
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(),'HTML Table Example')]")));

        WebElement tableElement = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
        Table table = new Table(tableElement, driver);
        System.out.println("Rows number is: " + table.getRows().size());
        System.out.println(table.getValueFromCell(2, 3));
        System.out.println(table.getValueFromCell(4, 1));

        System.out.println(table.getValueFromCell(4,"Company"));
        System.out.println(table.getValueFromCell(1,"Country"));
        System.out.println(table.getValueFromCell(2,"Contact"));

        driver.findElement(By.xpath("//*[@id=\"topnavbtn_references\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'JavaScript Reference')]")));
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Reference')]")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[contains(text(),'JavaScript')]")));

        driver.quit();
    }

}
