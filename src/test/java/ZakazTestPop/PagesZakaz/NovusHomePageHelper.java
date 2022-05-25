package ZakazTestPop.PagesZakaz;

import org.openqa.selenium.WebDriver;

public class NovusHomePageHelper extends NovusHomePageElements {

    public NovusHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public SearchResultPageElements search(String searchWord) {
        getSearchField().sendKeys(searchWord);
        getSearchBtn().click();

        return new SearchResultPageElements(driver);

    }
}
