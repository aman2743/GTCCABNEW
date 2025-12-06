package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertInSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        Thread.sleep(2000);
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        Thread.sleep(2000);
        driver.quit();

    }
}
