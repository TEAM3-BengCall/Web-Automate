package admin;

import admin.page.dashboardPage;
import admin.page.loginPage;
import admin.pages.loginPages;
import driverSetup.driverSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

;

public class loginStepss {
    private WebDriver webDriver;
    public loginStepss(){
        super();
        this.webDriver = driverSetup.webDriver;
    }

//    @Given("User already on login page")
//    public void userAlreadyOnLoginPage(){
//        loginPages ad = new loginPages(webDriver);
//        ad.loginButtonIsDisplayed();
//    }
//
//    @When("User input {string} as email and {string} as password")
//    public void userInputAsEmailAndAsPassword(String arg0, String arg1) {
//        loginPages loginPage = new loginPages(webDriver);
//        loginPage.setEmail(arg0);
//        loginPage.setPassword(arg1);
//    }
//
//    @Then("User click login button")
//    public void userClickLoginButton() {
//        loginPages loginPage = new loginPages(webDriver);
//        loginPage.clickLoginButton();
//    }
//
//    @And("User redirect to dashboard and show message {string}")
//    public void userRedirectToDashboard(String message) throws InterruptedException {
//        Thread.sleep(3000);
//        loginPages loginPage = new loginPages(webDriver);
//        assertEquals(message, loginPage.successLogin());
//    }

    @And("User Click Ok")
    public void userClickOk() {
        loginPages loginPage = new loginPages(webDriver);
        loginPage.canClick();
    }


}
