package user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jnr.ffi.annotations.In;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import user.page.RegisterPage;

import static driverSetup.driverSetup.webDriver;

public class RegisterSteps {

    //Scenario 1
    @Given("User already on main page")
    public void userAlreadyOnMainPage() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.mainpage();
    }
    @And("User click signup button")
    public void userClickSignupButton() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setClickSignUp();
    }

    @When("User already on {string} page")
    public void userAlreadyOnSignupPage(String text) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        String textsignup = registerPage.setTextsignup();
        Assert.assertEquals(textsignup, text);
    }

    @And("User click on field full name for input {string}")
    public void userClickOnFieldFullNameForInputFullName(String fullname) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setFullnamefield(fullname);
    }

    @And("User click on field email for input email {string}")
    public void userClickOnFieldEmailForInputEmailEmail(String email) {
        RegisterPage registerPage= new RegisterPage(webDriver);
        registerPage.setEmailfield(email);
    }

    @And("User click on field password for input password {string}")
    public void userClickOnFieldPasswordForInputPasswordPassword(String password) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setPasswordfield(password);
    }

    @And("user click signup button for end registeration")
    public void userClickSignupButtonForEndRegisteration() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setButtonsignup();
        Thread.sleep(3000);
    }

    //Scenario 2
    @And("User click on field invalid email for input email {string}")
    public void userClickOnFieldInvalidEmailForInputEmailEmail(String email) {
        RegisterPage registerPage= new RegisterPage(webDriver);
        registerPage.setEmailfield(email);
    }

    @And("User click on field invalid password for input password {string}")
    public void userClickOnFieldInvalidPasswordForInputPasswordPassword(String password) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setPasswordfield(password);
    }

    @And("User click signup")
    public void userClickSignup() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setButtonsignup();
        Thread.sleep(5000);
    }

    @Then("User seeing popup {string}")
    public void userSeeingPopup(String alreadyExist) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        String textpopup = registerPage.setTextPopup();
        Assert.assertEquals(textpopup, alreadyExist);
    }

    @And("click ok for re-registration")
    public void clickOkForReRegistration() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setButtonOk();
        Thread.sleep(3000);
    }
}
