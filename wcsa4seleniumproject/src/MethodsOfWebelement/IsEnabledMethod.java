package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.instagram.com/");
	 driver.findElement(By.name("username")).sendKeys("sonali98");
	 driver.findElement(By.name("password")).sendKeys("asdf12");
	 WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'_acap _aijb _acas _aj1-')]"));
	 boolean Status = loginButton.isEnabled();
	 System.out.println(Status);
}
}
