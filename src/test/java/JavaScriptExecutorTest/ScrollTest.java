package JavaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.amazon.in/");
//        driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        js.executeScript("window.scroll(500,3000)");
//        js.executeScript("window.scrollTo(0,5000)");
//        js.executeScript("window.scroll(0,document.body.scrollHeight)");
        js.executeScript("document.getElementById('comments').scrollIntoView()");
        driver.findElement(By.xpath("//i[@class='fa fa-hand-o-up']")).click();

    }
}
