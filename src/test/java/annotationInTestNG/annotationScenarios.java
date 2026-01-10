package annotationInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class annotationScenarios {
    JavascriptExecutor js;
    WebDriver driver;

    @BeforeTest
    public void initialization(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        js=(JavascriptExecutor) driver;
    }
    @Test
    public void userLogin(){
        driver.get("http://testfire.net/login.jsp");
        js.executeScript("document.getElementById('uid').value='jsmith';");
        js.executeScript("document.getElementById('passw').value='demo1334';");
        js.executeScript("document.getElementsByName('btnSubmit')[0].style.backgroundColor='Red';");
        js.executeScript("document.getElementsByName('btnSubmit')[0].click();");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
   @Test
    public void verifyLogin() throws InterruptedException {
        String eurl="http://testfire.net/bank/main.jsp";
        String curl=driver.getCurrentUrl();
        Assert.assertEquals(curl,eurl,"User not logged in");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"verifyLogin"})
    public void fundTransfer(){
        driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();
        driver.findElement(By.name("fromAccount")).sendKeys("800002 Savings");
        driver.findElement(By.name("toAccount")).sendKeys("800003 Checking");
        driver.findElement(By.name("transferAmount")).sendKeys("200");
        driver.findElement(By.id("transfer")).click();
        String eurl="http://testfire.net/bank/doTransfer";
        String curl= driver.getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(curl,eurl,"Fund not transfer");
        softAssert.assertAll();
    }

  @AfterTest
  public void tearDown(){
        driver.quit();
  }

}
