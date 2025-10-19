package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement we=driver.findElement(By.xpath("//select[@id='course']"));
        Select sl= new Select(we);
        sl.selectByIndex(1);
        Thread.sleep(1000);
        sl.selectByVisibleText("Python");
        Thread.sleep(1000);
        sl.selectByValue("js");
        Thread.sleep(3000);
        driver.quit();

    }
}
