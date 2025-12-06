package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchNewOne {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://testfire.net/login.jsp");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr/td[2]/input")).sendKeys("jsmith");
        driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("Jsmith");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("demo1234");

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
