package ActionsClassInSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        Actions act=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
//        driver.get("http://testfire.net/login.jsp");
//        WebElement we=driver.findElement(By.name("btnSubmit"));
        driver.get("https://testautomationpractice.blogspot.com/");
       WebElement pointMe= driver.findElement(By.xpath("//button[text()='Point Me']"));

        js.executeScript("document.getElementById('field1').scrollIntoView()");
        WebElement we=driver.findElement(By.xpath("//button[text()='Copy Text']"));

//        act.click(we).build().perform();
//        act.contextClick(we).build().perform();
        act.doubleClick(we).build().perform();

    }
}
