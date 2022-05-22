package TestPopEatstreet.PageEatstreet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageESElements extends BasePageES {

    public HomePageESElements (WebDriver driver){
        super(driver);
    }



    public WebElement getSearchField (){
        return driver.findElement(By.xpath("//input[@placeholder='Enter Your Address']"));
    }

    public WebElement getLocateMe (){
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }


}
