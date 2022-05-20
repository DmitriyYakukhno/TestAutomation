import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserThings {

  @Test
  public void browserTesting(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://qa2.eatstreet.com");
    driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
    driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]")).click();

    String user = "Dmitro" + System.currentTimeMillis();

    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user + "@email.ua");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dfgnyh123");
    driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("dfgnyh123");
    driver.findElement(By.xpath("//button[@id='signup']")).click();

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e){
      e.printStackTrace();
    }

    driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed();
    Assert.assertTrue(driver.findElement(By.xpath("//a[@id='menu-my-account']")).isDisplayed());

    driver.quit();

  }
}
