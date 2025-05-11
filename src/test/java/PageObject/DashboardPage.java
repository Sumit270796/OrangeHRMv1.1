package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

WebDriver ldriver;
public DashboardPage(WebDriver rdriver) {
	ldriver=rdriver;
   PageFactory.initElements(rdriver,this);
}

@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
WebElement userDropDown;

@FindBy(xpath = "//a[normalize-space()='Logout']")
WebElement logOutLink;

@FindBy(xpath = "//span[text()='PIM']")
WebElement pim;

@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
WebElement headerDashboard;

@FindBy(xpath = "//*")
List<WebElement> ttlWebElements;

@FindBy(tagName = "a")
List<WebElement> ttlHyperlink;

@FindBy(tagName = "img")
List<WebElement> ttlImageLink;

@FindBy(xpath = "//button[@title='Help']")
WebElement helpButton;


public String pageTitle() {
return	ldriver.getTitle();

}

public void clickDropDown() {
	userDropDown.click();
}

public void clickLogOutLink() {
	logOutLink.click();
}
public void clickPIM() {
	pim.click();
}

public String getHeader() {
	return headerDashboard.getText();
}

public int getTtlWebElement() {
return	ttlWebElements.size();
}

public int getTtlHyperLink() {
	return ttlHyperlink.size();		}


public int getTtlImageLink() {
	return ttlImageLink.size();
}

public String getButtonTitle() {
	new Actions(ldriver).moveToElement(helpButton).build().perform();
	return helpButton.getAttribute("title");
}


}
	
	
