import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simplified {

    WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterTest(){
        driver.close();
    }

    @Test
    public void searchNewYork(){

        doMyTest("New York");

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("New York"));
    }

    @Test
    public void searchBoston(){

        doMyTest("Boston");

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Boston"));

    }

    @Test
    public void doMyTest(String searchCity){

        driver.get("https://qa2.eatstreet.com/");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys(searchCity + "\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

