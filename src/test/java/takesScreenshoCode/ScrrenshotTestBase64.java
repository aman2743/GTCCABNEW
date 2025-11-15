package takesScreenshoCode;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ScrrenshotTestBase64 {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");

        TakesScreenshot ts=(TakesScreenshot) driver;
        String base64= ts.getScreenshotAs(OutputType.BASE64);
         byte[] arrayByte=Base64.getDecoder().decode(base64);
        File destFile=new File("C:\\Users\\HP\\Desktop\\Screenshot\\image3.jpg");
        try (FileOutputStream fos = new FileOutputStream(destFile)) {
            fos.write(arrayByte);
        }catch(FileNotFoundException fe){
            System.out.println("File Not found");
        }

    }
}
