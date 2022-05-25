package ZakazTestPop.TestsZakaz;

import ZakazTestPop.PagesZakaz.HomePageElements;
import ZakazTestPop.PagesZakaz.NovusHomePageElements;
import ZakazTestPop.PagesZakaz.SearchResultPageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckScroll extends TestInit {

    @Test
    public void checkScroll() {

        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.navigate();
        sleep(3);
        homePageElements.getStoreNovus().click();
        sleep(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,2050)");
        sleep(2);

        NovusHomePageElements novusHomePageElements = new NovusHomePageElements(driver);
        Assert.assertTrue(novusHomePageElements.getQuestionsAnswers().isDisplayed());

    }
}
