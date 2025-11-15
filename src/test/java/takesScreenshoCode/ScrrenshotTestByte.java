package takesScreenshoCode;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScrrenshotTestByte {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");

        TakesScreenshot ts=(TakesScreenshot) driver;
        byte[] byteArray= ts.getScreenshotAs(OutputType.BYTES);
        File f=new File("C:\\Users\\HP\\Desktop\\Screenshot\\image2.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(byteArray);

    }
}
