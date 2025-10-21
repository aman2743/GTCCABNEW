package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingCheckBoxInSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.xpath("//input[@id='femalerb']")).click();
        driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
        driver.findElement(By.xpath("//input[@id='latinchbx']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
