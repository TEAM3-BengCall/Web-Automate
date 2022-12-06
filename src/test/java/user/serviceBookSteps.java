package user;

import driverSetup.driverSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import user.page.homePage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class serviceBookSteps {
    private WebDriver webDriver;

    public serviceBookSteps() {
        super();
        this.webDriver = driverSetup.webDriver;
    }

    @Given("User already open the web page")
    public void userAlreadyOpenTheWebPage() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.isDisplayed();
        Thread.sleep(3000);
    }

    @When("User input {string} as Username and {string} as Password")
    public void userInputAsUsernameAndAsPassword(String username, String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.getUsername(username);
        homePage.getPassword(password);
        homePage.buttonLogin();
        Thread.sleep(3000);
    }

    @Then("User already on homepage")
    public void userAlreadyOnHomepage() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.textLogin();
        Thread.sleep(3000);
    }

    @When("User click on Service Now button")
    public void userClickOnServiceNowButton() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.getServiceNow();
        Thread.sleep(3000);
    }

    @And("Booking Service form will appear")
    public void bookingServiceFormWillAppear() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.getFormService();
        Thread.sleep(1000);
    }

    @When("User input {string} on phone field")
    public void userInputOnPhoneField(String phone){
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.inputPhone(phone);
    }

    @When("User input {string} on address field")
    public void userInputOnAddressField(String address){
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.inputAddress(address);
    }

    @When("User input date {string} on booking date")
    public void userInputDateDateOnBookingDate(String date) {
        homePage homePage = new homePage(webDriver);
        homePage.inputDate(date);
    }

    @When("User input month {string} on booking date")
    public void userInputMonthMonthOnBookingDate(String month) {
        homePage homePage = new homePage(webDriver);
        homePage.inputMonth(month);
    }


    @When("User input year {string} on booking date")
    public void userInputYearYearOnBookingDate(String year) {
        homePage homePage = new homePage(webDriver);
        homePage.inputYear(year);
    }

    @When("User select {string} on service location field")
    public void userSelectOnServiceLocationField(String location) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.inputLocation(location);
        Thread.sleep(1000);
    }

    @When("User select {string} on vehicle type")
    public void userSelectOnVehicleType(String vehicleType) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.inputVehicleType(vehicleType);
        Thread.sleep(1000);
    }

    @When("User select first service {string} on service type field")
    public void userSelectFirstServiceOnServiceTypeField(String serviceType) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.inputServiceType(serviceType);
        Thread.sleep(1000);
    }

    @When("User input {string} on other request field")
    public void userInputOnOtherRequestField(String otherRequest) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage homePage = new homePage(webDriver);
        homePage.inputOtherRequest(otherRequest);
        Thread.sleep(1000);
    }

    @Then("User click Submit button")
    public void userClickSubmitButton() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.buttonSubmit();
    }

    @Then("a message will appear {string}")
    public void aMessageWillAppear(String message) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        homePage homePage = new homePage(webDriver);
        homePage.messageBooked();
        assertEquals(message, homePage.messageBooked());
    }

    @Then("User click OK button and refresh homepage")
    public void userClickOKButtonAndDetailButtonOnHomepage() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.okBooked();
        Thread.sleep(2000);
    }

    @And("User click Detail button and get detail service booked")
    public void userRefreshHomepageAndClickDetailButton() throws InterruptedException {
        homePage homePage = new homePage(webDriver);
        homePage.buttonDetail();
        Thread.sleep(2000);
    }

}
