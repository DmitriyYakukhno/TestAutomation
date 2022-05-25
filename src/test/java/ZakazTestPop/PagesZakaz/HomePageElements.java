package ZakazTestPop.PagesZakaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePageElements {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getStoreNovus() {
        return driver.findElement(By.xpath("//a[@href='https://novus.zakaz.ua/uk/']"));
    }


}
