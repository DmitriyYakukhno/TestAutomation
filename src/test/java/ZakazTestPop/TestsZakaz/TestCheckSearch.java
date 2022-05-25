package ZakazTestPop.TestsZakaz;

import ZakazTestPop.PagesZakaz.HomePageElements;
import ZakazTestPop.PagesZakaz.NovusHomePageElements;
import ZakazTestPop.PagesZakaz.NovusHomePageHelper;
import ZakazTestPop.PagesZakaz.SearchResultPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckSearch extends TestInit {

    @Test
    public void checkOrderDrink() {

        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.navigate();
        sleep(3);
        homePageElements.getStoreNovus().click();
        sleep(2);

        NovusHomePageElements novusHomePageElements = new NovusHomePageElements(driver);
        novusHomePageElements.getSearchField().sendKeys("Молоко");
        novusHomePageElements.getSearchBtn().click();
        sleep(3);

        SearchResultPageElements searchResultPageElements = new SearchResultPageElements(driver);

        Assert.assertTrue(searchResultPageElements.getElementsWithTextWord().size() > 15);
    }
}
