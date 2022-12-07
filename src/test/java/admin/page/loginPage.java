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

    public String onLoginPage(){
        return URL_LOGIN;
    }
    public String successLogin(){
        return successLogin.getText();
    }
    public void clickOkLogin(){
        clickOkLogin.click();
    }
}
