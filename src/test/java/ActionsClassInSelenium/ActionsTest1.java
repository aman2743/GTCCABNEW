package ActionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest1 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        Actions act=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        js.executeScript("document.getElementById('PopUp').scrollIntoView()");
        WebElement pointMe= driver.findElement(By.xpath("//button[text()='Point Me']"));
        act.moveToElement(pointMe).build().perform();

    }
}
