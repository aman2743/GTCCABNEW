package exceptionInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("Test123");
//      driver.switchTo().window("2352654abcd");
//        driver.switchTo().frame("test123");
        Alert al=driver.switchTo().alert();
        al.accept();
        Thread.sleep(10000);
     driver.quit();
    }
}
