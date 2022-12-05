package admin.steps;

import admin.page.dashboardPage;
import admin.page.transactionDetailPage;
import driverSetup.driverSetup;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;;

public class updateTransactionSteps {
    private WebDriver webDriver;
    public updateTransactionSteps(){
        super();
        this.webDriver = driverSetup.webDriver;
    }

    @Given("user already on detail transaction page")
    public void userAlreadyonDetailTransactionPage(){
        transactionDetailPage transactionDetailPage = new transactionDetailPage(webDriver);
        transactionDetailPage.onTransactionPage();
    }

    @When("user input {string} in service type and {int} in Add priece field")
    public void userInputInServiceTypeAndInAddPrieceField(String arg0, int arg1) {
        transactionDetailPage transactionDetailPage = new transactionDetailPage(webDriver);
        transactionDetailPage.inServiceType(arg0).inAddPrice(String.valueOf(arg1));
    }

    @Then("user click submit update transaction")
    public void userClickSubmitUpdateTransaction() {
        transactionDetailPage transactionDetailPage = new transactionDetailPage(webDriver);
        transactionDetailPage.updateDetailTransaction();
    }

    @And("pop up message will showed and click OK")
    public void popUpMessageWillShowedAndClickOK() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        webDriver.navigate().refresh();
    }

    @And("user will see note under detail transaction contain {string}")
    public void userWillSeeNoteUnderDetailTransactionContain(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        transactionDetailPage transactionDetailPage = new transactionDetailPage(webDriver);
        assertEquals(arg0,transactionDetailPage.noteTrans());
    }

    @When("user choose status {string}")
    public void userChooseStatus(String arg0) {
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        dashboardPage.updateStatusTransaction(arg0);
        dashboardPage.btnChangeUpdate();
    }

    @Then("message {string} will showed")
    public void messageWillShowed(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage dashboardPage = new dashboardPage(webDriver);
        assertEquals(arg0,dashboardPage.messageUpdate());
        dashboardPage.okMessage();
    }
}
