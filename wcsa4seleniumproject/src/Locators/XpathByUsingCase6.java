package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingCase6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("samsung mobile");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	Thread.sleep(4000);
   String priceOFMobile=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
   System.out.println(priceOFMobile+" : is the price of mobile");
        
}
}