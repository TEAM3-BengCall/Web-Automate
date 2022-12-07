package admin.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageLocator {
    public final String URL_LOGIN = "https://bengcall.vercel.app/";
    public final String URL_DASHBOARD = "https://bengcall.vercel.app/dashboard";
    public final String URL_TRANSACTION = "https://bengcall.vercel.app/detailadmin/230";
    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//button[@id='button-submit']")
    public static WebElement loginButton;
    @FindBy(xpath = "//div[@class='swal-text']")
    public static WebElement successLogin;
    @FindBy(css = ".swal-button")
    public static WebElement clickOkLogin;
    @FindBy(xpath = "//div[@class='w-full h-full flex flex-col items-center my-5']/div[1]//button[@id='btn-detail']")
    public static WebElement getDetailTransaction;
    @FindBy(xpath = "//p[.='Address']")
    public static WebElement addressText;
    @FindBy(xpath = "//p[.='Service Type']")
    public static WebElement serviceTypeText;
    @FindBy(xpath = "//p[.='Total Price']")
    public static WebElement totalPriceText;
    @FindBy(xpath = "//input[@id='service-type']")
    public static WebElement inputServiceType;
    @FindBy(xpath = "//input[@id='add-price']")
    public static WebElement inputAddPrice;
    @FindBy(xpath = "//button[@id='button-submit']")
    public static WebElement sumbitUpdate;
    @FindBy(xpath = "//p[@class='text-base lg:text-2xl text-SecondaryBlue italic']")
    public static WebElement noteTransaction;
    @FindBy(xpath = "//div[@class='w-full h-full flex flex-col items-center my-5']/div[1]//select[@class='w-full h-10 border bg-white border-Line rounded-md']")
    public static WebElement listUpdate;
    @FindBy(id = "btn-changeStatus")
    public static WebElement btnChangeStatus;
    @FindBy(xpath = "//div[@class='swal-text']")
    public static WebElement messageUpdateStatus;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public static WebElement messageOk;
}
