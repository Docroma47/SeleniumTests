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

        driver.get("https://market.yandex.ru/catalog");
        driver.findElement(By.xpath("//span[text()=\"Бытовая техника\"]")).click();
        driver.findElement(By.xpath("//a [@href=\"/catalog--posudomoechnye-mashiny/54956/list?hid=90584\"]")).click();

        selectCheckBox("promo-type_discount");
        selectCheckBox("promo-type_promo-code");
        selectCheckBox("good-state_cutprice");
        selectCheckBox("credit-type_installment");

        deselectCheckBox("promo-type_promo-code");


    }

    public static void selectCheckBox(String name) {
        String rbXpath = "//label[@for='%s']//span";
        String inputXpath = "//input[@id='%s']";

        if (!driver.findElement(By.xpath(String.format(inputXpath, name))).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
    }

    public static void deselectCheckBox(String name){
        String rbXpath = "//label[@for='%s']//span";
        String inputXpath = "//input[@id='%s']";

        if (driver.findElement(By.xpath(String.format(inputXpath, name))).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
    }

}
