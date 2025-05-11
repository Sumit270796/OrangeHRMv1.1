package PageObject;


import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

  WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
	ldriver =rdriver;
	PageFactory.initElements(rdriver, this);
 	
	}
	
@FindBy(xpath = "//input[@name='username']")
WebElement  username;

@FindBy(xpath = "//input[@name='password']")
WebElement password;

@FindBy(xpath = "//button[@type='submit']")
WebElement button;

@FindBy(xpath ="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
WebElement errorMsg;

@FindBy(xpath = "//*")
public List<WebElement> ttlElement;

@FindBy(xpath = "//a[normalize-space()='OrangeHRM, Inc']")
WebElement OrangeHrm_Inc;

public void enterUserName(String uname) {
 username.sendKeys(uname);
}

public void enterPassword(String pwd) {
 password.sendKeys(pwd);
	
}

public void clickLoginBtn() {
	button.click();
}

public String getErrorMsg() {
	String errorMessage = errorMsg.getText();
	return errorMessage;
}
public int totalElement() {
return ttlElement.size();
}

public String attributeOrangeHRM_Inc() {
  new Actions(ldriver).moveToElement(OrangeHrm_Inc).build().perform();
   return OrangeHrm_Inc.getAttribute("href");
	

}


}







