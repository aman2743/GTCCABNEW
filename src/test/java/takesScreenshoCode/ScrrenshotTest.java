package takesScreenshoCode;

import com.google.common.io.FileWriteMode;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v138.page.model.Screenshot;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

public class ScrrenshotTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        String path="C:\\Users\\HP\\Desktop\\Screenshot\\image.jpg";

        File destFile=new File("C:\\Users\\HP\\Desktop\\Screenshot\\image4.jpg");
        FileUtils.copyFile(srcFile,destFile);
        driver.quit();
    }
}
