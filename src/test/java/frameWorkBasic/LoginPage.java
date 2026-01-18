package frameWorkBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

   @FindBy(xpath="//input[@id='uid']")
    WebElement usernameField;
    @FindBy(xpath="//input[@id='passw']")
   WebElement passwordField;
    @FindBy(xpath="//input[@name='btnSubmit']")
   WebElement submitButton;

    public void enterUserName(String unameInput){
        usernameField.sendKeys(unameInput);
    }
    public void enterPassword(String passwordInput){
        passwordField.sendKeys(passwordInput);
    }

    public void click(){
        submitButton.click();
    }

}
