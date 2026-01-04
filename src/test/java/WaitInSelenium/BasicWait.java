package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//button[@id='btn1']")).click();
//        Thread.sleep(3000);

        driver.findElement(By.id("txt1")).sendKeys("Test123");

    }
}
