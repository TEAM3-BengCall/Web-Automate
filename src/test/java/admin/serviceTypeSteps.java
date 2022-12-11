package admin;

import admin.page.servicePage;
import driverSetup.driverSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class serviceTypeSteps {
    private WebDriver webDriver;
    public serviceTypeSteps(){
        super();
        this.webDriver = driverSetup.webDriver;
    }

    @Then("Admin Click Service Type Button")
    public void adminClickServiceTypeButton() {
        servicePage serviceTypeSteps = new servicePage(webDriver);
        serviceTypeSteps.clickServiceType();
    }
    @Then("Admin Click Add Vehicle Button")
    public void adminClickAddVehicleButton() throws InterruptedException {
        servicePage serviceTypeSteps = new servicePage(webDriver);
        Thread.sleep(2000);
        serviceTypeSteps.clickAddVehicle();

    }

    @And("Admin Input Vehicle type {string}")
    public void adminInputVehicleType(String arg0) {
        servicePage serviceTypeSteps = new servicePage(webDriver);
        serviceTypeSteps.inputNameVehicle(arg0);
    }

    @And("Admin Click Submit Button")
    public void adminClickSubmitButton() {
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickSubmitButton();
    }
    @And("Admin Succsessfully Add New Service Type Created")
    public void adminSuccsessfullyAddNewServiceTypeCreated() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.switchTo().alert().accept();
    }

    @And("Admin Click Cancel Button")
    public void adminClickCancelButton() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickCancel();
    }

    @And("Admin Go Back to Vehicle Menu")
    public void adminGoBackToVehicleMenu() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.displayVehicle();
    }

    @Then("Admin Click Edit Service Button")
    public void adminClickEditServiceButton() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickEditService();
    }
    @And("Admin Click Vehicle Type Button")
    public void adminClickVehicleTypeButton() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickVehicleType();
    }

    @And("Admin Choose One Type of Vehicle")
    public void adminChooseOneTypeOfVehicle() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickTypeMotor();
    }

    @Then("Admin Input Service Type {string}")
    public void adminInputServiceType(String arg0) {
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.inputServiceType(arg0);
    }

    @Then("Admin Input Price {string}")
    public void adminInputPrice(String arg0) {
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.inputPrice(arg0);
    }
    @And("Admin click Submit Button")
    public void adminclickSubmitButton() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickSubmitButtonEditService();
    }
    @And("Admin Click OK Button")
    public void adminClickOKButton() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickOkButtonEditService();
    }
    @And("Admin Click Cancel Button On Edit Service Menu")
    public void adminClickCancelButtonOnEditServiceMenu() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickCancelButtonEditService();
    }

    @And("Admin Click Bean Icon Button")
    public void adminClickBeanIconButton() throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.clickTrashButton();
    }
    @Then("Vehicle clear")
    public void vehicleClear() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.switchTo().alert().accept();
    }

    @And("Failed Massage Will be Showed {string}")
    public void failedMassageWillBeShowed(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        servicePage serviceTypeStep = new servicePage(webDriver);
        serviceTypeStep.failedToAddService();
        Assert.assertEquals(arg0,serviceTypeStep.failedToAddService());

    }

    @And("Admin click OK")
    public void adminClickOK() {
        servicePage serviveTypeStep = new servicePage(webDriver);
        serviveTypeStep.clickOkButton();
    }

    @And("Failed Massage Will be Showed")
    public void failedMassageWillBeShowed() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.switchTo().alert().accept();
    }
}
