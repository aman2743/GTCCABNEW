package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class DynamicExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
        WebElement we= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        we.sendKeys("555555");

    }
}
