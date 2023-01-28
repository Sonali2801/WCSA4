package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));
	 String cssProperty = loginButton.getCssValue("color");
	 System.out.println(cssProperty);
}
}
