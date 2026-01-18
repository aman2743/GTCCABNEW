package frameWorkBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginTest{
    FileInputStream fis;
    WebDriver driver;
    String username;
    String password;

    @BeforeTest
    public void init() throws IOException {
        driver=new ChromeDriver();
        Properties prop=new Properties();
        File f=new File("D:\\SeleniumTestData\\config.properties.txt");
        System.out.println(f.exists());
        try {
            fis=new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        prop.load(fis);
        String url=prop.getProperty("url");
        username=prop.getProperty("uname");
        System.out.println(username);
        password=prop.getProperty("password");
        System.out.println(password);
        driver.get(url);
        driver.manage().window().maximize();
    }
    @Test
    public void loginTestMethod() throws IOException {

        LoginPage lp = new LoginPage(driver);
        lp.enterUserName(username);
        lp.enterPassword(password);
        lp.click();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
