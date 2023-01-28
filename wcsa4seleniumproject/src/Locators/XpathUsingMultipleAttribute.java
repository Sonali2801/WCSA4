package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingMultipleAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.puma.com/in/");
	driver.findElement(By.xpath("//h3[@class='tw-8216tu'and(contains(text(),'Softride Pro Coast'))]")).click();
	Thread.sleep(4000);
	driver.close();
	
}
}
