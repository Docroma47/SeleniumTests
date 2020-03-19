import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "A:\\Proj\\TestSelenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru/catalog--posudomoechnye-mashiny/54956/list?hid=90584&local-offers-first=0&onstock=1");//ij_bmonth//ij_byear//ij_bday
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@class=\"search-layout\"]//div[@data-zone-name=\"search-filters-aside\"]//fieldset [@data-autotest-id=\"7893318\"]//span"));
//        checkBoxes.get(3).click();
//        System.out.println(checkBoxes.size());
        if (checkBoxes.size() == 12) System.out.println("It's okay!");
        else System.out.println("Fail!");

        for (WebElement checkBox: checkBoxes) checkBox.click();
    }

}
