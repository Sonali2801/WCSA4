package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String browserValue = sc.next();
		System.out.println("which browser u want to open!!!");
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromebrowser.exe");
			driver = new ChromeDriver(); // to launch chrome browser
			Options manage = driver.manage();
			Window window = manage.window();
			window.maximize(); // maximize the window
			driver.get("https://www.Instagram.com"); // to launch web application
			Thread.sleep(4000); // to provide delay for 4 sec script
			driver.close(); // to close parent window
		} else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			Thread.sleep(4000);
			driver.close();
		} else {
			System.out.println("enter valid browser name!1");
		}

	}
}
