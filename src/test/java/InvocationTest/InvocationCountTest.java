package InvocationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountTest {
@Test(threadPoolSize =4 )
    public void RandomUser() throws InterruptedException {
    System.out.println(Thread.currentThread().getName());
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://randomuser.me/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-label='name']")).click();
        System.out.println(driver.findElement(By.xpath("//p[@id='user_value']")).getText());
        driver.findElement(By.xpath("//li[@data-label='email']")).click();
        System.out.println(driver.findElement(By.xpath("//p[@id='user_value']")).getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
