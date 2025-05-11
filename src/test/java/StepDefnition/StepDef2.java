package StepDefnition;

import java.time.Duration;

import org.testng.Assert;

import PageObject.DashboardPage;
import PageObject.PIMPage;
import io.cucumber.java.en.*;

public class StepDef2 extends BaseClass {

		@When("User click on PIM link")
		public void user_click_on_pim_link() {
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			logger.info("Click on PIM");
		    dashboardPg = new DashboardPage(driver);
		   dashboardPg.clickPIM();
		}
		@When("User click on AddEmployee link")
		public void user_click_on_add_employee_link() {
		    logger.info("Click on Add Employee Link");
		   PIMPg = new PIMPage(driver);
		   PIMPg.clickAddEmployee();
		}
		@When("User enter firstName as {string} MiddleName as {string} and lastName as {string} and Employee id as {string}")
		public void user_enter_first_name_as_middle_name_as_and_last_name_as_and_employee_id_as(String fName, String mName, String lName, String empId) {
	    logger.info("Enter firstName");
		PIMPg.enterFirstNaame(fName);
	    logger.info("Enter middleName");
		PIMPg.enterMiddleName(mName);
	     logger.info("Enter lastName");
		PIMPg.enterLastName(lName);
	     logger.info("Enter EmpId");
		PIMPg.enterEmpId(empId);
	     
		}
		@When("User click on save button")
		public void user_click_on_save_button() {
		logger.info("Click on save Button");
			PIMPg.clickSaveBtn();    
		}
		@When("User should see an toastMsg Success")
		public void user_should_see_an_toast_msg_success() {
		 logger.info("Display toast Message");
		String toastMsg = PIMPg.getToastMsg();
		  Assert.assertEquals(toastMsg,"Success");
		
		
		}

}
