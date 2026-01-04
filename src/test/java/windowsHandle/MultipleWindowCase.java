package windowsHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindowCase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String XPathWin=null, BasicWin=null,PwinID=null;
        driver.manage().window().maximize();
        driver.findElement(By.id("newWindowsBtn")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String winID : handles) {
                driver.switchTo().window(winID);
                String title=driver.getTitle();
                if(title.contains("XPath Practice")){
                    XPathWin=winID;
                } else
                    if(title.contains("Basic Controls")){
                        BasicWin=winID;
                    } else if(title.contains("Window Handles Practice")){
                        PwinID=winID;
                    }
           }
//        working on - Basic Controls - H Y R Tutorials page
        driver.switchTo().window(BasicWin);
        System.out.println(driver.getCurrentUrl());
//        working on Window Handles Practice - H Y R Tutorials
        driver.switchTo().window(PwinID);
        System.out.println(driver.getCurrentUrl());
        driver.close();
//        working on XPath Practice - H Y R Tutorials
        driver.switchTo().window(XPathWin);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //        working on - Basic Controls - H Y R Tutorials page
        driver.switchTo().window(BasicWin);
        System.out.println(driver.getPageSource());
        driver.close();
    }
}