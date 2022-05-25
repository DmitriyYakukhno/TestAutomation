package ZakazTestPop.PagesZakaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPageElements extends BasePageElements {

    public AddressPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement chooseRegionField() {
        return driver.findElement(By.xpath("//div[@class='RegionSelect__indicator RegionSelect__dropdown-indicator css-tlfecz-indicatorContainer']"));
    }

    public WebElement chooseCityDrop() {
        return driver.findElement(By.xpath("//div[contains(@class, 'RegionSelect__option')] [contains(text(), 'Київ')]"));
    }

    public WebElement chooseStreetField() {
        return driver.findElement(By.xpath("//input[@data-marker='Delivery address']"));
    }

    public WebElement confirmStreetDrop() {
        return driver.findElement(By.xpath("//div[@id = 'react-select-3-option-0']"));
    }

    public WebElement confirmAddressBtn() {
        return driver.findElement(By.xpath("//button[@data-testid = 'To shopping']"));
    }
}
