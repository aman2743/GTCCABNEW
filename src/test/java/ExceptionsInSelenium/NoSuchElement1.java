package ExceptionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElement1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"uid\"]")).sendKeys("jsmith");
        driver.findElement(By.xpath("//*[@id=\"passw\"]")).sendKeys("demo1234");
        driver.findElement(By.name("btnSubmit")).click();
        driver.findElement(By.id("txt1")).sendKeys("3534534");
    }
}
