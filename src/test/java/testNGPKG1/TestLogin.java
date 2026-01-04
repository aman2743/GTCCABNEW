package testNGPKG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLogin {
    WebDriver driver = new ChromeDriver();

        SoftAssert softAssert=new SoftAssert();
    @Test
    public void TestLoginPage() {
        driver.get("http://testfire.net/login.jsp");
        driver.manage().window().maximize();
        driver.findElement(By.id("uid")).sendKeys("Jsmith");
        driver.findElement(By.name("passw")).sendKeys("demo1244");
        driver.findElement(By.name("btnSubmit")).click();
        String currentURL=driver.getCurrentUrl();
        String expectedURL="http://testfire.net/bank/main.jsp";
        Assert.assertEquals(currentURL,expectedURL,"User Not login Successfully");
        String actualText=driver.findElement(By.xpath("//h1[normalize-space(text()='Hello John Smith')]")).getText();
        String expectedText="Hello John";
        softAssert.assertEquals(actualText,expectedText,"Text Mismatched");
        String actualCongratulationText=driver.findElement(By.xpath("//h2[normalize-space(text()='Congratulations! ')]")).getText();
        String expectedCongratulationText="Congratulations!";
        softAssert.assertEquals(actualCongratulationText,expectedCongratulationText,"Congratulations Text Mismatched");
        softAssert.assertAll();

    }
}
