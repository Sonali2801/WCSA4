package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();
	}
}
