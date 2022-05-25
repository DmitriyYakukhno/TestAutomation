package ZakazTestPop.PagesZakaz;

import org.openqa.selenium.WebDriver;

public class BasePageElements {

    WebDriver driver;

    public BasePageElements(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get("https://zakaz.ua/uk");
    }

}
