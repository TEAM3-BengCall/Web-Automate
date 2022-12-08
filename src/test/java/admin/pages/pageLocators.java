package admin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageLocators {
    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//button[@id='button-submit']")
    public static WebElement loginButton;
    @FindBy(xpath = "//div[@class='swal-text']")
    public static WebElement successLogin;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public static WebElement clickOk;


}
