package testNGPKG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
     @Test
        public void TestLoginPage(){
            WebDriver driver = new ChromeDriver();
            driver.get("http://testfire.net/login.jsp");
            driver.manage().window().maximize();
            driver.findElement(By.id("uid")).sendKeys("Jsmith");
            driver.findElement(By.name("passw")).sendKeys("demo1234");
            driver.findElement(By.name("btnSubmit")).click();
            String expectedTitle="Altoro Mutual";
            String actualTitle=driver.getTitle();
            Assert.assertEquals(actualTitle,expectedTitle,"Assertion failed in my custom test");
            driver.quit();
    }

}
