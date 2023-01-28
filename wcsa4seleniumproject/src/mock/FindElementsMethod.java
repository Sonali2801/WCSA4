package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Poha");
	Thread.sleep(2000);
	 List<WebElement> suggesstions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	 System.out.println(suggesstions.size());
	 for(WebElement s:suggesstions)
	 {
		 System.out.println(s.getText());
	 }
}
}
