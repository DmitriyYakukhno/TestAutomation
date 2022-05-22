package TestPopEatstreet.TestEatstreet;

import TestPopEatstreet.PageEatstreet.HomePageESElements;
import TestPopEatstreet.PageEatstreet.HomePageESHelper;
import org.testng.annotations.Test;

public class TestSearchCityES extends TestInitES {

@Test
    public void searchCity(){
    HomePageESElements homePageESElements = new HomePageESElements(driver);
    HomePageESHelper homePageESHelper = new HomePageESHelper(driver);
    homePageESHelper.navigate();
    homePageESElements.getSearchField().sendKeys("New York\n");
    homePageESElements.getLocateMe().click();
    sleep(3);

}


}
