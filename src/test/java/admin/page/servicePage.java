package admin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class servicePage {
    public static WebDriver driver;
    public servicePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='btn-service-type']")
    public static WebElement serviceTypeButton;
    @FindBy(xpath = "//button[.='Add Vehicle']")
    public  static WebElement addVehicleButton;
    @FindBy(xpath = "//input[@id='input-vehicle-type']")
    public static WebElement inputVehicle;
    @FindBy(xpath = "//button[@class='border-2 border-PrimaryRed rounded-lg font-semibold text-lg text-PrimaryRed m-auto px-5 py-1 max-w-xs hover:bg-PrimaryRed hover:text-white cursor-pointer']")
    public static WebElement submittButton;
    @FindBy(xpath = "//button[@class='border-2 border-PrimaryBlue rounded-lg font-semibold text-lg text-PrimaryBlue m-auto px-5 py-1 max-w-xs hover:bg-PrimaryBlue hover:text-white cursor-pointer']")
    public static WebElement cancelButton;
    @FindBy(xpath = "//div[@class='w-full h-full flex flex-col items-center  ']")
    public static WebElement vehivleMenu;
    @FindBy(xpath = "//button[.='Edit Service']")
    public  static WebElement editService;
    @FindBy(xpath = "//div[@class='w-3/4 flex justify-end gap-4 ']//select[@id='select-vehicle']")
    public static WebElement vehicleType;
    @FindBy(xpath = "//div[@class='w-3/4 flex justify-end gap-4 ']//option[26]")
    public static WebElement typeMotor;
    @FindBy(xpath = "//div[@class='w-3/4 flex justify-end gap-4 ']//input[@id='input-service-type']")
    public static WebElement serviceType;
    @FindBy(xpath = "//div[@class='w-3/4 flex justify-end gap-4 ']//input[@id='input-price']")
    public static WebElement price;
    @FindBy(xpath = "//div[@class='w-3/4 flex justify-end gap-4 ']//button[@id='btn-submit']")
    public static WebElement submitButtonEditService;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public static WebElement okButtonEditService;
    @FindBy(xpath = "//div[@class='w-3/4 flex justify-end gap-4 ']//button[@id='btn-cancel']")
    public static WebElement cancelButtonEditService;
    @FindBy(css = "div:nth-of-type(2) #btn-trash")
    public static WebElement trashButton;
    @FindBy(xpath = "//div[@class='swal-text']")
    public static WebElement failedMassage;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public static WebElement okButtonClick;



    public void clickServiceType(){serviceTypeButton.click();}
    public void clickAddVehicle(){addVehicleButton.click();}
    public void inputNameVehicle(String inputAdminVehicle){inputVehicle.sendKeys(inputAdminVehicle);}
    public void clickSubmitButton(){submittButton.click();}
    public void clickCancel(){cancelButton.click();}
    public void displayVehicle(){vehivleMenu.isDisplayed();}
    public void clickEditService(){editService.click();}
    public void clickVehicleType(){vehicleType.click();}
    public void clickTypeMotor(){typeMotor.click();}
    public void inputServiceType(String inputAdminService){serviceType.sendKeys(inputAdminService);}
    public void inputPrice(String inputAdminPrice){price.sendKeys(inputAdminPrice);}
    public void clickSubmitButtonEditService(){submitButtonEditService.click();}
    public void clickOkButtonEditService(){okButtonEditService.click();}
    public void clickCancelButtonEditService(){cancelButtonEditService.click();}
    public void clickTrashButton(){trashButton.click();}
    public String failedToAddService(){return failedMassage.getText();}
    public void clickOkButton(){okButtonClick.click();}
}
