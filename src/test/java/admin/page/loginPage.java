package admin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends pageLocator {
    public static WebDriver driver;
    public loginPage(WebDriver driver){
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
    public static void clickOkLogin(){
        clickOkLogin.click();
    }
}
