package ActionsClassInSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        Actions act=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       act.sendKeys(Keys.ENTER).build().perform();
        act.sendKeys(Keys.SPACE).build().perform();
        act.sendKeys(Keys.UP).build().perform();
        act.sendKeys(Keys.DOWN).build().perform();
        act.sendKeys(Keys.TAB).build().perform();



    }
}
