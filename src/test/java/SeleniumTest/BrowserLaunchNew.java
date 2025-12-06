package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchNew {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://testfire.net/login.jsp");
        driver.manage().window().maximize();
        driver.findElement(By.id("uid")).sendKeys("Jsmith");
        driver.findElement(By.name("passw")).sendKeys("demo1234");
        driver.findElement(By.name("btnSubmit")).click();
        driver.findElement(By.linkText("Transfer Funds")).click();
        driver.findElement(By.partialLinkText("View Account")).click();
        driver.findElement(By.linkText("SMALL BUSINESS")).click();
        driver.findElement(By.className("subheader")).click();
        driver.findElement(By.tagName("img")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
