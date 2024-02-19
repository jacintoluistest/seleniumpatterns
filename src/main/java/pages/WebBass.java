package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebBass {
static WebDriver baseWebDriver;
static String browseName="chrome";
static String url ="https://practicetestautomation.com/practice-test-login/";


public static WebDriver init(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    baseWebDriver = new ChromeDriver(options);
    baseWebDriver.manage().deleteAllCookies();
    baseWebDriver.manage().window().maximize();
   



    baseWebDriver.get(url);
    return baseWebDriver;
}

}
