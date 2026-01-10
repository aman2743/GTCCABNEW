package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderScenarioArray {
    WebDriver driver;

    @Test(dataProvider ="LoginTestData" )
    public void userLogin(String uname,String pwd) throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfire.net/login.jsp");
        driver.findElement(By.id("uid")).sendKeys(uname);
        driver.findElement(By.id("passw")).sendKeys(pwd);
        driver.findElement(By.name("btnSubmit")).click();
        Thread.sleep(1000);
        String eurl="http://testfire.net/bank/main.jsp";
        String curl=driver.getCurrentUrl();
        Assert.assertEquals(curl,eurl,"User not logged in");
        Thread.sleep(2000);
        driver.quit();
  }
        @DataProvider(name="LoginTestData")
        public String[][] LoginTestData(){
            String[][] data=new String[2][2];
            data[0][0]="jsmith";
            data[0][1]="demo1234";
            data[1][0]="admin";
            data[1][1]="admin123";
            return data;
        }
}