package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("");
		WebElement username = driver.findElement(By.id(null));
		WebElement password = driver.findElement(By.id(null));
		
		if (username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("if block is executed");
		}
		else
		{
		
		}
	}

}
