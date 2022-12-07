package admin;

import admin.page.dashboardPage;
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

    @Given("User already on login user.page")
    public void userAlreadyOnLoginPage(){
        loginPage ad = new loginPage(webDriver);
        String currentUrl = webDriver.getCurrentUrl();
        assertEquals(ad.URL_LOGIN,currentUrl);
    }

    @When("User input {string} as email and {string} as password")
    public void userInputAsEmailAndAsPassword(String arg0, String arg1) {
        loginPage loginPage = new loginPage(webDriver);
        loginPage.setEmail(arg0);
        loginPage.setPassword(arg1);
    }

    @Then("User click login button")
    public void userClickLoginButton() {
        loginPage loginPage = new loginPage(webDriver);
        loginPage.clickLoginButton();
    }

    @And("User redirect to dashboard and show message {string}")
    public void userRedirectToDashboard(String message) throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        loginPage loginPage = new loginPage(webDriver);
        String currentUrl = webDriver.getCurrentUrl();
        assertEquals(dashboardPage.onDashboardPage(),currentUrl);
        assertEquals(loginPage.successLogin(),message);
        loginPage.clickOkLogin();
    }

    @And("user will see pop up message {string}")
    public void userWillSeePopUpMessage(String arg0) throws InterruptedException {
        Thread.sleep(5000);
        loginPage loginPage = new loginPage(webDriver);
        assertEquals(arg0, loginPage.successLogin());
    }
}
