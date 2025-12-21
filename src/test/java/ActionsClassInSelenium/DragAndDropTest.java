package ActionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        Actions act=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        js.executeScript("document.getElementById('draggable').scrollIntoView()");
        WebElement srcElement=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement destElement=driver.findElement(By.xpath("//div[@id='droppable']"));
//        act.dragAndDrop(srcElement,destElement).release().perform();
//        act.clickAndHold(srcElement).moveToElement(destElement).release().build().perform();
        act.dragAndDropBy(srcElement,100,0).release().build().perform();



    }
}
