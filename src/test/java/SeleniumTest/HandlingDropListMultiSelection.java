package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropListMultiSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
     WebElement we=driver.findElement(By.xpath("//select[@id='ide']"));
     Select sl=new Select(we);
     List <WebElement> lst=sl.getOptions();
     for(WebElement we1:lst){
         String str=we1.getText();
         if(str.equalsIgnoreCase("IntelliJ IDEA")||str.equals("NetBeans")){
             sl.selectByVisibleText(str);
         }
     }
     Thread.sleep(2000);
    sl.deselectByVisibleText("IntelliJ IDEA");
    }
}
