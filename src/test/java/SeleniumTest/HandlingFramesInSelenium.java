package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFramesInSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page");
        WebElement we=driver.findElement(By.xpath("//iframe[@id='frm1']"));
        driver.switchTo().frame(we);
        Thread.sleep(1000);
        WebElement we1=driver.findElement(By.xpath("//select[@id='course']"));
        Select sl=new Select(we1);
        sl.selectByIndex(2);
        Thread.sleep(3000);
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input[@id='name']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page after Frame1");
        Thread.sleep(1000);
        driver.quit();

    }
}
