package windowsHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowIterator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        String pWindow = driver.getWindowHandle();
        System.out.println(pWindow);
        driver.findElement(By.id("newWindowsBtn")).click();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr=handles.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            if (!str.equals(pWindow)) {
                driver.switchTo().window(str);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(pWindow);
        System.out.println(driver.getTitle());
        driver.close();
    }
}