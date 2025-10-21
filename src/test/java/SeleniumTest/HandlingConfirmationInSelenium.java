package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationInSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Thread.sleep(2000);
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
//        al.accept();
        al.dismiss();
        String str=driver.findElement(By.xpath("//div[@id='output']")).getText();
        System.out.println(str);
        Thread.sleep(2000);
        driver.quit();

    }
}
