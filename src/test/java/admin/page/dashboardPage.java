package admin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class dashboardPage extends pageLocator{
    public static WebDriver driver;
    public dashboardPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public static void getTransaction(){
        getDetailTransaction.click();
    }
    public static void onDetailTransaction(){
        addressText.isDisplayed();
    }
    public String address(){
        return addressText.getText();
    }
    public String serviceType(){
        return serviceTypeText.getText();
    }
    public String priceText(){
        return totalPriceText.getText();
    }
    public String onDashboardPage(){
        return URL_DASHBOARD;
    }
    public static void updateStatusTransaction(String arg0){
        Select listUpdateTransaction = new Select(listUpdate);
        listUpdateTransaction.selectByVisibleText(arg0);
    }
    public static void btnChangeUpdate(){
        btnChangeStatus.click();
    }
    public String messageUpdate(){
        return messageUpdateStatus.getText();
    }
    public static void okMessage(){
        messageOk.click();
    }
}
