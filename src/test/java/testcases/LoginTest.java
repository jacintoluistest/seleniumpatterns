package testcases;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WebBass;




public class LoginTest {
    WebDriver testdriver;
    LoginPage lp;

    @BeforeTest
    public void setUp(){
        testdriver=WebBass.init();
        lp = new LoginPage(testdriver);
    }
    
    @Test (priority = 1)
    public void validLogin(){
        lp.login("test", "pass");   
    }

    @AfterTest
    public void tearDown(){
       testdriver.quit(); 
    }
}
