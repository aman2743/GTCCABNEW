package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://testfire.net/login.jsp");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@id=\"uid\"]")).sendKeys("jsmith");
//        driver.findElement(By.xpath("//*[@id=\"passw\"]")).sendKeys("demo1234");
//        driver.findElement(By.xpath("//*[@id=\"login\"]/table/tbody/tr[3]/td[2]/input")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"LoginLink\"]/font")).click();
         WebElement we= driver.findElement(By.id("uid"));
//         we.sendKeys("jsmith");
        driver.findElement(By.id("uid")).sendKeys("jsmith");
  }
}
