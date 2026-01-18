package workingWithExcel;

import dataProvider.DataSupplierClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLoginNew {
    WebDriver driver = new ChromeDriver();
        SoftAssert softAssert=new SoftAssert();
    @Test (threadPoolSize = 2, dataProvider = "DataSupplierNew", dataProviderClass = DataFromExcelSheetToApplicaion.class)
    public void TestLoginPage   (String str1,String str2) throws InterruptedException {
        driver.get("http://testfire.net/login.jsp");
        driver.manage().window().maximize();
        driver.findElement(By.id("uid")).sendKeys(str1);
        driver.findElement(By.name("passw")).sendKeys(str2);
        driver.findElement(By.name("btnSubmit")).click();
        Thread.sleep(1000);
        String expectedURL="http://testfire.net/bank/main.jsp";
        String currentURL=driver.getCurrentUrl();
        Assert.assertEquals(currentURL,expectedURL,"User Not login Successfully");
//        String actualText=driver.findElement(By.xpath("//h1[normalize-space(text()='Hello John Smith')]")).getText();
//        String expectedText="Hello John";
//        softAssert.assertEquals(actualText,expectedText,"Text Mismatched");
//        String actualCongratulationText=driver.findElement(By.xpath("//h2[normalize-space(text()='Congratulations! ')]")).getText();
//        String expectedCongratulationText="Congratulations!";
//        softAssert.assertEquals(actualCongratulationText,expectedCongratulationText,"Congratulations Text Mismatched");
//        softAssert.assertAll();
            Thread.sleep(2000);

    }

}
