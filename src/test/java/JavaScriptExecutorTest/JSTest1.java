package JavaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTest1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("http://testfire.net/login.jsp");
        WebElement uname=driver.findElement(By.id("uid"));
        WebElement pwd=driver.findElement(By.id("passw"));
        WebElement button=driver.findElement(By.name("btnSubmit"));
        Thread.sleep(2000);
        js.executeScript("document.getElementById('uid').style.border='2px Solid Red';");
        Thread.sleep(3000);
        js.executeScript("arguments[0].value='jsmith';",uname );
        js.executeScript("document.getElementById('passw').style.border='2px Solid Yellow';");
        Thread.sleep(2000);
        js.executeScript("arguments[0].value='demo1234';",pwd );
        js.executeScript("arguments[0].style.color = 'Green';", button);
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",button);

    }
}
