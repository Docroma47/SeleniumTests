import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://vk.com/");//ij_bmonth//ij_byear//ij_bday
        selectCheckBox("bday", "2");
        selectCheckBox("bmonth", "3");
        selectCheckBox("byear", "4");


    }

    public static void selectCheckBox(String name, String option) {
        String t = null;
        switch (name) {
            case "bday":
                t = "1";
                break;
            case "bmonth":
                t = "2";
                break;
            case "byear":
                t = "3";
                break;
        }

        String rbXpath = String.format("//div [@class=\"ij_%s\"]", name);
        String inputXpath = String.format("//li[@id=\"option_list_options_container_" + t + "_%s\"]", option);

        driver.findElement(By.xpath(rbXpath)).click();
        driver.findElement(By.xpath(inputXpath)).click();
    }

}
