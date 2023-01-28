package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=pp64q478ogu0");
	WebElement UsernameTextBox = driver.findElement(By.name("username"));
	UsernameTextBox.sendKeys("Admin");
	WebElement PasswardTextBox = driver.findElement(By.name("pwd"));
	PasswardTextBox.sendKeys("manager");
	
	Thread.sleep(4000);
	UsernameTextBox.clear();
	PasswardTextBox.clear();
}
}