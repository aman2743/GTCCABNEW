package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicFluentWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchFieldException.class)
                .withMessage("Using Fluent wait");

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        we.sendKeys("4545454=5");

    }
}
