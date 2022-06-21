package ZakazTestPop.TestsZakaz;

import ZakazTestPop.PagesZakaz.AddressPageElements;
import ZakazTestPop.PagesZakaz.HomePageElements;
import ZakazTestPop.PagesZakaz.NovusHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckHomeAddress extends TestInit {

    @Test
    public void checkHomeAddress() {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.navigate();
        sleep(2);
        homePageElements.getStoreNovus().click();

        NovusHomePageElements novusHomePageElements = new NovusHomePageElements(driver);
        sleep(2);
        novusHomePageElements.getHomeAddressBtn().click();

        AddressPageElements addressPageElements = new AddressPageElements(driver);
        sleep(2);
        addressPageElements.chooseRegionField().click();
        sleep(2);
        addressPageElements.chooseCityDrop().click();
        sleep(2);
        addressPageElements.chooseStreetField().sendKeys("Київ, проспект Перемоги, 82А\n");
        sleep(2);
        addressPageElements.confirmStreetDrop().click();
        sleep(2);
//        addressPageElements.confirmAddressBtn().click();
//        sleep(3);

//        Assert.assertTrue(novusHomePageElements.chosenHomeAddress().isDisplayed());

    }
}
