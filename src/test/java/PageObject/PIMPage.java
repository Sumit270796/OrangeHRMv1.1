package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

WebDriver ldriver;
	
public PIMPage(WebDriver rdriver) {
	this.ldriver =rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath = "//a[normalize-space()='Add Employee']")
WebElement addEmployee;

@FindBy(xpath = "//input[@placeholder='First Name']" )
WebElement firstName;

@FindBy(xpath = "//input[@placeholder='Middle Name']")
WebElement middleName;

@FindBy(xpath = "//input[@placeholder='Last Name']")
WebElement lastName;

@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement employeeId;

@FindBy(xpath = "//button[normalize-space()='Save']")
WebElement saveBtn;

@FindBy(xpath = "//*[contains(@class, 'oxd-text') and contains(@class, 'oxd-toast-content-text')]")
WebElement toastMsg;

public void clickAddEmployee() {     
	addEmployee.click();
}

public void enterFirstNaame(String fName) {
	firstName.sendKeys(fName);
}
public void enterMiddleName(String mName) {
	middleName.sendKeys(mName);
}
public void enterLastName(String lName) {
	lastName.sendKeys(lName);
}

public void enterEmpId(String empId) {
employeeId.sendKeys(empId);	
}
public void clickSaveBtn() {
	saveBtn.click();
}

public String getToastMsg() {
String actualMsg = toastMsg.getText();
return actualMsg;

}


}



