package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator2Insta {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);	
	driver.findElement(By.name("username")).sendKeys("sonali_9826");
	
	driver.findElement(By.name("password")).sendKeys("Sonali@123");

	driver.findElement(By.cssSelector("button[class='_acan _acap _acas']")).click();
}
}
