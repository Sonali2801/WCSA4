package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=pp64q478ogu0");
		WebElement checkbox = driver.findElement(By.name("remember"));
		boolean Status = checkbox.isSelected();
		System.out.println(Status);
		checkbox.click();
		Thread.sleep(4000);
		boolean Status2 = checkbox.isSelected();
		System.out.println(Status2);
		
	}
}
