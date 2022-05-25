package ZakazTestPop.PagesZakaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovusHomePageElements extends BasePageElements {

    public NovusHomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getHomeAddressBtn() {
        return driver.findElement(By.xpath("//span[@class='jsx-2440653761 AddressButton__label']"));
    }

    public WebElement chosenHomeAddress() {
        return driver.findElement(By.xpath("//span[@class = 'jsx-2440653761 AddressButton__label'] [contains(text(), 'Доставка: Київ, проспект Перемоги, 82А')]"));
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@data-testid = 'searchBoxInput']"));
    }

    public WebElement getSearchBtn() {
        return driver.findElement(By.xpath("//div[@data-testid= 'loupe']"));
    }

}

