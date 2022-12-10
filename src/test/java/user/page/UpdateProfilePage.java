package user.page;

import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateProfilePage {
    public static WebDriver driver;

    public UpdateProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Locator
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailfield;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordfield;

    @FindBy(xpath = "//button[@id='button-submit']")
    private WebElement buttonsubmit;

    @FindBy(xpath = "//div[@class='swal-text']")
    private WebElement logged;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement OKbutton;


    @FindBy(css = ".rounded-btn > .w-8")
    private WebElement clickIconProfile;

    @FindBy(xpath = "//ul[@class='menu dropdown-content p-2 bg-white rounded-box w-44 border shadow-md']//a[@id='btn-profile']")
    private WebElement clickmyprofile;

    @FindBy(xpath = "//input[@id='change-photo']")
    private WebElement clickChoosing;

    @FindBy(xpath = "//button[@id='deactivate']")
    private WebElement deleteaccount;

    //Class
    public void setEmailfield(String email){
        emailfield.sendKeys(email);
    }

    public void setPasswordfield(String password){
        passwordfield.sendKeys(password);
    }

    public void setButtonsubmit(){
        buttonsubmit.click();
    }

    public String SetLogged(){
        driver.switchTo().alert().accept();
        return logged.getText();
    }

    public void setOKbutton(){
        OKbutton.click();
    }

    public void homeDisplayed(){
        clickmyprofile.isDisplayed();
    }

    public void setClickIconProfile(){
        clickIconProfile.click();
    }

    public void setClickmyprofile(){
        clickmyprofile.click();
    }

    private JFileChooser fc = new JFileChooser();
    public void setClickChoosing(){
        clickChoosing.sendKeys("C:/Users/syawa/Web-Automate/src/Minionman.jpg");
    }
    public void updateProfileDisplayed(){
        clickChoosing.isDisplayed();
    }

    public void setDeleteaccount(){
        deleteaccount.click();
    }

    public void alert(){
        driver.switchTo().alert().accept();
    }
}
