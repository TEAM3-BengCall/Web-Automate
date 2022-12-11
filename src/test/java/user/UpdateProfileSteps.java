package user;

import admin.page.loginPage;
import driverSetup.driverSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import user.page.RegisterPage;
import user.page.UpdateProfilePage;

import static driverSetup.driverSetup.webDriver;
import static org.junit.Assert.assertEquals;

public class UpdateProfileSteps {

    private WebDriver webDriver;

    public UpdateProfileSteps() {
        super();
        this.webDriver = driverSetup.webDriver;
    }
    //Login
    @When("User input email {string} and password {string}")
    public void userInputEmailAndPassword(String email, String password) throws InterruptedException {
        Thread.sleep(3000);
        loginPage loginPage = new loginPage(webDriver);
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }

    @And("User click signin button for login")
    public void userClickSigninButtonForLogin() throws InterruptedException{
        loginPage loginPage = new loginPage(webDriver);
        loginPage.clickLoginButton();
    }

    @Then("Seeing text {string}")
    public void seeingText(String yourelogged) throws InterruptedException {
        Thread.sleep(6000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        String textlogged = updateProfilePage.SetLogged();
        assertEquals(textlogged, yourelogged);
    }

    @And("User click OK")
    public void userClickOK() {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setOKbutton();
    }

    //Update Profile
    @Given("User already on home page")
    public void userAlreadyOnHomePage() {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.homeDisplayed();
    }

    @And("User click icon profile")
    public void userClickIconProfile() throws InterruptedException{
        Thread.sleep(3000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setClickIconProfile();
    }

    @And("User click my profile")
    public void userClickMyProfile() throws InterruptedException{
        Thread.sleep(3000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setClickmyprofile();
    }

    @When("User already on update profile")
    public void userAlreadyOnUpdateProfile() throws InterruptedException{
        Thread.sleep(3000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.updateProfileDisplayed();
    }

    @And("User click button submit for update profile")
    public void userClickButtonSubmitForUpdateProfile() throws InterruptedException{
        Thread.sleep(3000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setButtonsubmit();
    }

    //Upload file
    @And("User click button Choose file for upload file")
    public void userClickButtonChooseFileForUploadFile() throws InterruptedException{
        Thread.sleep(3000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setClickChoosing();
    }

    //Delete account
    @And("click Dectivate")
    public void clickDectivate() throws InterruptedException{
        Thread.sleep(3000);
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setDeleteaccount();
    }

    @Then("alert massage")
    public void alertMassage() {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.alert();
    }
}
