package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public LoginPage(WebDriver driver){
      PageFactory.initElements(driver, this);
   }

WebDriver testDriver;

 //WebElement creation

 // Username text field by Id
 @FindBy(id="username")
 private WebElement userNameField;

 // password text field by Id
 @FindBy(id="password")
 private WebElement passwordField;

 // User text field by Id
 @FindBy(id="submit")
 private WebElement submitButton;

 public void login (String user, String password){
    userNameField.sendKeys(user);
    passwordField.sendKeys(password);
    submitButton.click();
 }

    
 

    
}
