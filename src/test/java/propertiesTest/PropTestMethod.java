package propertiesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropTestMethod {
    FileInputStream fis;

    @Test
    public void TestData() throws IOException {
        WebDriver driver=new ChromeDriver();
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
        String username=prop.getProperty("uname");
        String password=prop.getProperty("password");
        driver.get(url);
        driver.findElement(By.id("uid")).sendKeys(username);
        driver.findElement(By.id("passw")).sendKeys(password);
        driver.findElement(By.name("btnSubmit")).click();
        double d= Double.parseDouble(prop.getProperty("wait"));
        System.out.println(d);
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}