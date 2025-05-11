package StepDefnition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObject.DashboardPage;

import PageObject.LoginPage;
import PageObject.PIMPage;
import Utilities.ReadConfig;
import io.cucumber.java.Scenario;

public class BaseClass {
public static WebDriver driver;
public LoginPage loginPg;
public DashboardPage dashboardPg;
public static ReadConfig readConfig;
public PIMPage PIMPg;
public Logger logger = LogManager.getLogger(getClass());





		
}

