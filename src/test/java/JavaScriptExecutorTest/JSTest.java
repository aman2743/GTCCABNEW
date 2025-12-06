package JavaScriptExecutorTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("http://testfire.net/login.jsp");
        js.executeScript("document.getElementById('uid').value='jsmith';");
        js.executeScript("document.getElementById('passw').value='demo1234';");
        js.executeScript("document.getElementsByName('btnSubmit')[0].style.backgroundColor='Red';");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        js.executeScript("document.getElementsByName('btnSubmit')[0].click();");

    }
}
