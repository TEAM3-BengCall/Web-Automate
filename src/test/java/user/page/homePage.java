package user.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    public static WebDriver driver;

    public homePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // locator login user
    @FindBy(id = "email")
    private WebElement username;
    public boolean isDisplayed(){
        username.isDisplayed();
        return true;
    }
    public void getUsername(String username){
        String id = "email";
        driver.findElement(By.id(id)).sendKeys(username);
    }

    public void getPassword(String password){
        String id = "password";
        driver.findElement(By.id(id)).sendKeys(password);
    }

    public void buttonLogin(){
        String id = "button-submit";
        driver.findElement(By.id(id)).click();
    }

    public void textLogin(){
        String xpath = "//button[@class='swal-button swal-button--confirm']";
        driver.findElement(By.xpath(xpath)).click();
    }

    //locator homepage
    public void getServiceNow(){
        String id = "button-book-service";
        driver.findElement(By.id(id)).click();
    }

    //locator create book service
    public void getFormService(){
        String css = ".w-fit";
        driver.findElement(By.cssSelector(css)).isDisplayed();
    }

    public void inputPhone(String phone){
        String id = "input-phone";
        driver.findElement(By.id(id)).sendKeys(phone);
    }

    public void inputAddress(String address){
        String id = "input-address";
        driver.findElement(By.id(id)).sendKeys(address);
    }

    public void inputDate(String date){
        String id = "input-date";
        driver.findElement(By.id(id)).sendKeys(date);
    }

    public void inputMonth(String month){
        String id = "input-date";
        driver.findElement(By.id(id)).sendKeys(month);
    }

    public void inputYear(String year){
        String id = "input-date";
        driver.findElement(By.id(id)).sendKeys(year);
    }

    public void inputLocation(String location){
        String xpath = "//*[@id=\"modal-booking\"]/div/div[1]/div[2]/div[1]/select";
        driver.findElement(By.xpath(xpath)).sendKeys(location);
    }

    public void inputVehicleType(String vehicleType){
        String id = "select-vehicle";
        driver.findElement(By.id(id)).sendKeys(vehicleType);
    }

    public void inputServiceType(String serviceType){
        String xpath = "//*[@id=\"modal-booking\"]/div/div[1]/div[2]/div[3]/span/select";
        driver.findElement(By.xpath(xpath)).sendKeys(serviceType);
    }

    public void inputOtherRequest(String otherRequest){
        String id = "input-request";
        driver.findElement(By.id(id)).sendKeys(otherRequest);
    }

    public void buttonSubmit(){
        String id = "button-submit";
        driver.findElement(By.id(id)).click();
    }

    public String messageBooked(){
        String css = ".swal-text";
        driver.findElement(By.cssSelector(css)).isDisplayed();
        return driver.findElement(By.cssSelector(css)).getText();
    }

    public void okBooked(){
        String xpath = "//button[@class='swal-button swal-button--confirm']";
        driver.findElement(By.xpath(xpath)).click();
        driver.navigate().refresh();
    }

    public void buttonDetail(){
        String xpath = "//button[@id='btn-detail']";
        driver.findElement(By.xpath(xpath)).click();
    }

}
