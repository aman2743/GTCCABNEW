package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrameInSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test123");
        Thread.sleep(2000);
//       Action inside frame1
        WebElement we=driver.findElement(By.id("frm1"));
        driver.switchTo().frame(we);
        WebElement we1=driver.findElement(By.id("course"));
        Select sl=new Select(we1);
        sl.selectByIndex(1);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='name']")).clear();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test123334");
        driver.quit();

    }
}
