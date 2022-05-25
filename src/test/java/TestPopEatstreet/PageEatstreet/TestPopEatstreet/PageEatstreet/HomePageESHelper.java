package TestPopEatstreet.PageEatstreet.TestPopEatstreet.PageEatstreet;

import org.openqa.selenium.WebDriver;

public class HomePageESHelper extends HomePageESElements {

    public HomePageESHelper(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        driver.get("https://qa2.eatstreet.com/");
    }
}
