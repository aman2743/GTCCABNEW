package ExceptionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.get("http://testfire.net/login.jsp");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"uid\"]")).sendKeys("jsmith");
            driver.findElement(By.xpath("//*[@id=\"passw\"]")).sendKeys("demo1234");
            WebElement we=driver.findElement(By.name("btnSubmit"));
            driver.navigate().refresh();
            we.click();
        }
    }
