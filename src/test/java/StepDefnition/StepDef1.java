package StepDefnition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import PageObject.DashboardPage;
import PageObject.LoginPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class StepDef1 extends BaseClass {
	@BeforeAll
	public static void launchBrowser() throws Exception {
		readConfig = new ReadConfig();
		String browser = readConfig.getBrowser();
		switch (browser) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox" : {
			driver = new FirefoxDriver();
			break;
		}
		default:
			throw new Exception("Browser not found");
		}}
	@When("enter url as {string}")
	public void enter_url_as(String url) {
		driver.get(url);
		logger.info("launch Browser");

	}
	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginPg = new LoginPage(driver);
		logger.info("Enter username and password");
		loginPg.enterUserName(username);
		loginPg.enterPassword(password);

	}
	@When("Click on Login button")
	public void click_on_login_button() {
		logger.info("Click on login button");
		loginPg.clickLoginBtn(); 
	}
	@Then("User navigated page pageTitle should be {string}")
	public void user_navigated_page_page_title_should_be(String expectedPageTitle) {
		logger.info("Validate pageTitle");
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		String title =  js.executeScript("return document.title;").toString();
		Assert.assertEquals(title,expectedPageTitle);
	}
	@Then("User click on userdropdown tab")
	public void user_click_on_userdropdown_tab() {
		logger.info("Click on userdropDown");
		dashboardPg  = new DashboardPage(driver);
		dashboardPg.clickDropDown();

	}
	@Then("Click on LogOut link")
	public void click_on_log_out_link() {
		logger.info("Click on logOutLink");
		dashboardPg.clickLogOutLink();
	}

	@When("User enter username as {string} and Passwors as {string}")
	public void user_enter_username_as_and_passwors_as(String uname, String pwd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginPg = new LoginPage(driver);
		logger.info("Enter username");
		loginPg.enterUserName(uname);
		logger.info("Enter password");

		loginPg.enterPassword(pwd);

	}
	@Then("User should see an {string}")
	public void user_should_see_an(String expectedErrorMsg) {
		logger.info("Get error msg");
		String actualErrorMsg=	  loginPg.getErrorMsg();
		Assert.assertEquals(actualErrorMsg,expectedErrorMsg);

	}
	@Then("User refresh the page")
	public void user_refresh_the_page() {
		logger.info("Refresh the page");
		driver.navigate().refresh();	

	}
	@Then("Open page title should be {string}")
	public void open_page_title_should_be(String expectedTitle) {
		logger.info("Validate the pageTitle");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String actualTitle=	 js.executeScript("return document.title;").toString();
		Assert.assertEquals(actualTitle,expectedTitle);
	}

	@Then("Open new tab and enter url {string} and PageTitle should be {string}")
	public void open_new_tab_and_enter_url_and_page_title_should_be(String url, String expectedPageTitle) {
		List<String> handleWindow = new ArrayList<String>(driver.getWindowHandles());
		logger.info("Switch to another tab");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String actualTitle =js.executeScript("return document.title;").toString();
		Assert.assertEquals(actualTitle,expectedPageTitle);
		logger.info("Close the current window");
		driver.close();
		driver.switchTo().window(handleWindow.get(0));
	}

	@When("Calculate total number of webelement on the page")
	public void calculate_total_number_of_webelement_on_the_page() {
		loginPg = new LoginPage(driver);
		logger.info("Calculate total number of element");
		int ttlWebElement = loginPg.totalElement();
		Assert.assertEquals(ttlWebElement,23);
	}

	@When("User zoom the page {int}%")
	public void user_zoom_the_page(Integer int1) {
		logger.info("Zoom the page 300%");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='300%'");

	}
	@When("User press backward and then again press forward")
	public void user_press_backward_and_then_again_press_forward() {
		logger.info("After login navigate backward and forawrd");
		driver.navigate().back();
		driver.navigate().forward();
	}
	@Then("Open page header should be {string}")
	public void open_page_header_should_be(String expectedTitle) {
		logger.info("Validate the header of dashbaord page");
		dashboardPg = new DashboardPage(driver);
		String actualHeader  =	dashboardPg.getHeader();
		Assert.assertEquals(actualHeader, expectedTitle);
	}

	@When("Get innerHeight and width of webpage")
	public void get_inner_height_and_width_of_webpage() {
		logger.info("Validate the page innerheight and innerWidth" );
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int expectedHeight  = 643;
		int expectedWidth =1366;


		Long actualInnerHeight = (Long) (js.executeScript("return window.innerHeight;"));
		Assert.assertEquals(actualInnerHeight.intValue(),643);

		Long actualInnerWidth =(Long)(js.executeScript("return window.innerWidth;"));
		Assert.assertEquals(actualInnerWidth.intValue(),1366);



	}
	@When("User mouseHover on the OrangeHRM, Inc. and user should see an href attribute should be {string}")
	public void user_mouse_hover_on_the_orange_hrm_inc_and_user_should_see_an_href_attribute_should_be(String expectedAttribute) {
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		loginPg = new LoginPage(driver);
	    loginPg.attributeOrangeHRM_Inc();
		logger.info("Validate the attribute of OrangeHrm_Inc");
	    String  actualAttribute =    loginPg.attributeOrangeHRM_Inc();
		Assert.assertEquals(actualAttribute,expectedAttribute);
	
	}

	@After
	  public void takeScreenShot(Scenario scenario) throws IOException {
	
	
		if(scenario.isFailed()) {	  
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
	  String filePath = "C:\\Users\\HP\\Desktop\\New Maven Project\\OrangeHRM\\Screenshot\\image.png";
		  File  src=  srcShot.getScreenshotAs(OutputType.FILE);
		  File  dest = new File(filePath);
		  FileUtils.copyFile(src, dest);
		
	

}}
	
	@AfterAll
	public static void tearDown() {
		driver.quit();
	}


}
