package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

Properties properties;

public ReadConfig() throws IOException {
	properties = new Properties();
	FileInputStream fis = new FileInputStream("src/main/resources/Config.properties");
	properties.load(fis);

}



public String getBrowser() {
String browser =	properties.getProperty("browser");
	return browser;
}}