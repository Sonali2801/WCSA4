package mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.navigate().to("file:///C:/Users/Dell/Desktop/WCSA4/MultiSelectDropdown.html");
		WebElement DropDownElement = driver.findElement(By.name("menu"));
		Select sel = new Select(DropDownElement);
		for(int i=0; i<5; i++)
		{
		sel.selectByIndex(i);
		}
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for(WebElement Opts:allOptions)
		{
			String Values = Opts.getText();
			Thread.sleep(2000);
			System.out.println(Values);
		}
	}

}
