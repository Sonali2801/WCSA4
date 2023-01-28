package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		Thread.sleep(2000);
		//driver.findElement(By.id("952cdebe-f0aa-4d7d-8088-0d5b8c13a783")).sendKeys("abcd@123");
		driver.findElement(By.cssSelector("input[id='d0f32a11-f52e-4d95-a23e-5301cb9dfeda']")).sendKeys("pqrs@123");	
		//driver.findElement(By.id("bcb7afe5-a7df-42c6-8ee4-6af1059bedc2")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[id='f7fc1275-ff3e-4244-94f7-2c3f622c9257']")).sendKeys("pqrs");
		
		driver.findElement(By.cssSelector("input[id='adfcafdc-66be-47c3-ab55-d9fa5238f841'"));
	}
}
