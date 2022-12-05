package admin.steps;

import admin.page.dashboardPage;
import driverSetup.driverSetup;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;;

public class transactionSteps {
    private WebDriver webDriver;
    public transactionSteps(){
        super();
        this.webDriver = driverSetup.webDriver;
    }
    @Given("user already on dashboard page")
    public void userAlreadyOnDashboardPage() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        dashboardPage.onDashboardPage();
    }

    @When("user click on detail transaction button")
    public void userClickOnDetailTransactionButton() {
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        dashboardPage.getTransaction();
    }

    @Then("user redirect to detail transaction page")
    public void userRedirectToDetailTransactionPage() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        dashboardPage.onDetailTransaction();
    }

    @And("user see form transaction with {string}  {string} and {string}")
    public void userSeeFormTransactionWithAnd(String arg0, String arg1, String arg2) {
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        assertEquals(arg0,dashboardPage.address());
        assertEquals(arg1,dashboardPage.serviceType());
        assertEquals(arg2,dashboardPage.priceText());
    }
}
