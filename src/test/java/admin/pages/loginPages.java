package admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPages extends pageLocators {
    public static WebDriver driver;
    public loginPages(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static void setEmail(String inputEmail){
        email.sendKeys(inputEmail);
    }

    public static void setPassword(String inputPassword){
        password.sendKeys(inputPassword);
    }
    public static void clickLoginButton(){
        loginButton.click();
    }
    
    public static void loginButtonIsDisplayed(){
        loginButton.isDisplayed();
    }

    public String successLogin(){
        return successLogin.getText();
    }
    public void canClick(){clickOk.click();}



}
