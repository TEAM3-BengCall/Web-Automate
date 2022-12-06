package driverSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {
    public static WebDriver webDriver;
    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        webDriver = new ChromeDriver();
        String URL = "https://bengcall.vercel.app/";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
