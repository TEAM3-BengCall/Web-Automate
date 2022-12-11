package user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import user.page.RegisterPage;
import user.page.UpdateProfilePage;

import static driverSetup.driverSetup.webDriver;

public class UpdateProfileSteps {

    //Login
    @When("User input email {string} and password {string}")
    public void userInputEmailAndPassword(String email, String password) {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setEmailfield(email);
        updateProfilePage.setPasswordfield(password);
    }

    @And("User click signin button for login")
    public void userClickSigninButtonForLogin() throws InterruptedException{
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setButtonsubmit();
        Thread.sleep(9000);
    }

    @Then("Seeing text {string}")
    public void seeingText(String yourelogged) {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        String textlogged = updateProfilePage.SetLogged();
        Assert.assertEquals(textlogged, yourelogged);
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
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setClickIconProfile();
        Thread.sleep(3000);
    }

    @And("User click my profile")
    public void userClickMyProfile() throws InterruptedException{
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setClickmyprofile();
        Thread.sleep(3000);
    }

    @When("User already on update profile")
    public void userAlreadyOnUpdateProfile() throws InterruptedException{
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.updateProfileDisplayed();
        Thread.sleep(3000);
    }

    @And("User click button submit for update profile")
    public void userClickButtonSubmitForUpdateProfile() throws InterruptedException{
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setButtonsubmit();
        Thread.sleep(3000);
    }

    //Upload file
    @And("User click button Choose file for upload file")
    public void userClickButtonChooseFileForUploadFile() throws InterruptedException{
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setClickChoosing();
        Thread.sleep(3000);
    }

    //Delete account
    @And("click Dectivate")
    public void clickDectivate() throws InterruptedException{
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.setDeleteaccount();
        Thread.sleep(3000);
    }

    @Then("alert massage")
    public void alertMassage() {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(webDriver);
        updateProfilePage.alert();
    }
}
