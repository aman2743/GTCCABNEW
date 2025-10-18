package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//        driver.findElement(By.xpath("//a[text()='Sign in into account']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign in into account')]")).click();
    }
}
