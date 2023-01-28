package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		driver.switchTo().activeElement().sendKeys("YouTube Shorts");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='style-scope ytd-searchbox']"));
		
		for(int i=0;i<suggestions.size();i++)
		{
			WebElement suggestion = suggestions.get(i);
			String textOfTheWebElement = suggestion.getText();
			System.out.println(textOfTheWebElement);
		}
		
		
		
	}

}
