package admin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class transactionDetailPage extends pageLocator{
    public static WebDriver driver;
    public transactionDetailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public transactionDetailPage inServiceType(String serviceType){
        inputServiceType.sendKeys(serviceType);
        return this;
    }
    public transactionDetailPage inAddPrice(String addPrice){
        inputAddPrice.sendKeys(addPrice);
        return this;
    }
    public static void updateDetailTransaction(){
        sumbitUpdate.click();
    }
    public String noteTrans(){
        return noteTransaction.getText();
    }
    public String onTransactionPage(){
        return URL_TRANSACTION;
    }
}
