package ActionsClassInSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteUsingShortcut {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        Actions act=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      driver.findElement(By.id("inputText1")).sendKeys("This is my text");
        WebElement inputField2=driver.findElement(By.id("inputText2"));
//        Select Operation
//        act.keyDown(Keys.CONTROL);
//       act.sendKeys("a");
//       act.keyUp(Keys.CONTROL);
//       act.perform();
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

//       Copy Operation
//        act.keyDown(Keys.CONTROL);
//        act.sendKeys("c");
//        act.keyUp(Keys.CONTROL);
//        act.perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

//       Press Tab Key
        act.sendKeys(Keys.TAB);
    //       Paste Operation
//        act.keyDown(Keys.CONTROL);
//        act.sendKeys("v");
//        act.keyUp(Keys.CONTROL);
//        act.perform();
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

    }
}
