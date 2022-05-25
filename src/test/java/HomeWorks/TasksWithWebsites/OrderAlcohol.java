package HomeWorks.TasksWithWebsites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderAlcohol {

    @Test
    public void waitSec(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void canIOrderAlcohol() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zakaz.ua/uk/");
        waitSec();
//        driver.findElement(By.xpath("//a[@href='/uk/categories/eighteen-plus/']")).click();
//        waitSec();
//        driver.findElement(By.xpath("//button[@data-testid='buttonYes']")).click();
//        driver.findElement(By.xpath("//span[contains(text(), 'Пиво')]")).click();
//        waitSec();
//        driver.findElement(By.xpath("//span[contains(text(), 'Пиво Corona Extra світле 4,5% 0,33л')]")).click();
//        waitSec();
//        driver.findElement(By.xpath("//button[@class='jsx-44091497 btn btn-default AddButton AddButton_fullWidth'] [@data-marker='Add to cart']")).click();
//        waitSec();
//        driver.findElement(By.xpath("//li[@id='react-tabs-4']")).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Ми не відправляємо Новою Поштою швидкопсувні продукти, алкоголь і тютюн')] [@role='alert']")).isDisplayed());
//        driver.close();

    }

}

