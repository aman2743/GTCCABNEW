package ExceptionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeOutException {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn1")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        we.sendKeys("2425642");

    }
}
