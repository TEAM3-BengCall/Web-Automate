package user.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.Element;

public class RegisterPage {
    public static WebDriver driver;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Locator
    @FindBy(xpath = "//a[@id='register']")
    private WebElement ClickSignUp;

    @FindBy(xpath = "//h1[@class='font-bold text-5xl text-center text-PrimaryBlue my-14']")
    private WebElement textsignup;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement fullnamefield;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailfield;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordfield;

    @FindBy(xpath = "//button[@id='button-submit']")
    private WebElement buttonsignup;

    @FindBy(xpath = "//div[@class='swal-text']")
    private WebElement textpopup;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement buttonOk;

    //Class
    public void mainpage(){
        ClickSignUp.isDisplayed();
    }
    public void setClickSignUp(){
        ClickSignUp.click();
    }

    public String setTextsignup(){
        return textsignup.getText();
    }

    public void setFullnamefield(String fullname){
        fullnamefield.sendKeys(fullname);
    }

    public void setEmailfield(String email){
        emailfield.sendKeys(email);
    }

    public void setPasswordfield(String password){
        passwordfield.sendKeys(password);
    }

    public void setButtonsignup(){
        buttonsignup.click();
    }

    public String setTextPopup(){
        return textpopup.getText();
    }

    public void setButtonOk(){
        buttonOk.click();
    }
}
