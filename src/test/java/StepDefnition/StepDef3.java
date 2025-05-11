package StepDefnition;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.Assert;

import PageObject.DashboardPage;
import io.cucumber.java.en.When;

public class StepDef3 extends BaseClass {

	@When("total no of webelement on the page")
	public void total_no_of_webelement_on_the_page() {
	    dashboardPg = new DashboardPage(driver);
	 int ttlElement =dashboardPg.getTtlWebElement();
	 logger.info("Validate total no of webelement on the page");
	 Assert.assertEquals(ttlElement,24);
	}	
	

@When("Validate total number of hyperlink on the page")
public void validate_total_number_of_hyperlink_on_the_page() {
  logger.info("Validate total no of hyperlinks");
  dashboardPg =new  DashboardPage(driver);
  int ttlHyperLinks = dashboardPg.getTtlHyperLink();
  Assert.assertEquals(ttlHyperLinks, 15);
}
@When("Validate the total number of imagelinks")
public void validate_the_total_number_of_imagelinks() {
   dashboardPg = new DashboardPage(driver);
   int ttlImageLink = dashboardPg.getTtlImageLink();
  logger.info("Validate the total no of imagelink");
   Assert.assertEquals(ttlImageLink,4);
}	

@When("User add a cookie")
public void user_add_a_cookie() {
    Cookie cookie =  new Cookie("OrangeHRM","12599989898ndjshudghugau");
    driver.manage().addCookie(cookie);
}



@When("Get total cookie and their  value")
public void get_total_cookie_and_their_value() {
   Set<Cookie> cookie = driver.manage().getCookies();
   for (Cookie cookieList : cookie)  {
	   System.out.println(cookieList);
   }	   
}   
	   
   
@When("when hover on help button then Help title should be shown")
   public void when_hover_on_help_button_then_help_title_should_be_shown() {
   String actualTitle =   dashboardPg.getButtonTitle();
   Assert.assertEquals(actualTitle,"Help");

}  
   }









	