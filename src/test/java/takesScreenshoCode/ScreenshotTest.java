package takesScreenshoCode;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotTest {
    public static void main(String[] args) throws IOException {
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        String expectedFormat=ldt.format(myFormat);

        System.out.println(expectedFormat);

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
//        String path="C:\\Users\\HP\\Desktop\\Screenshot\\"+expectedFormat+".jpg";

        File destFile=new File("C:\\Users\\HP\\Desktop\\Screenshot\\"+expectedFormat+".jpg");
        FileUtils.copyFile(srcFile,destFile);
        driver.quit();
    }
}
