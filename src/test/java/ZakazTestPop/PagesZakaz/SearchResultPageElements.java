package ZakazTestPop.PagesZakaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPageElements extends BasePageElements {

    public SearchResultPageElements(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getElementsWithTextWord() {
        return driver.findElements(By.xpath("//*[contains(text(), 'Молоко')]"));
    }
}
