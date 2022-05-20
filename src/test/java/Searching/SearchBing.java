package Searching;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBing extends SearchInit{

    String searchEngine = "https://www.bing.com";

    @Test
    public void searchCats(){
        String searchWord = "Cats";
        searchIt(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void searchDogs() {
        String searchWord = "Dogs";
        searchIt(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void searchHorses(){
        String searchWord = "Horses";
        searchIt(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    public void searchIt(String searchWord){
        searchEngine(searchEngine);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchWord + "\n");
    }
}


