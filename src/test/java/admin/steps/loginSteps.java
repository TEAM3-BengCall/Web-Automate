package admin.steps;

import admin.page.loginPage;
import driverSetup.driverSetup;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;;

public class loginSteps{
    private WebDriver webDriver;
    public loginSteps(){
        super();
        this.webDriver = driverSetup.webDriver;
    }
    loginPage loginPage = new loginPage(webDriver);
    @Given("User already on login page")
    public void userAlreadyOnLoginPage(){
        loginPage.loginButtonIsDisplayed();
    }

    @When("User input {string} as email and {string} as password")
    public void userInputAsEmailAndAsPassword(String arg0, String arg1) {
        loginPage.setEmail(arg0);
        loginPage.setPassword(arg1);
    }

    @Then("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("User redirect to dashboard and show message {string}")
    public void userRedirectToDashboard(String message) throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(message, loginPage.successLogin());
        loginPage.clickOkLogin();
    }
}
