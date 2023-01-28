package assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///C:/Users/Dell/Desktop/WCSA4/MultiSelectDropdown.html");
	WebElement dropDownElement = driver.findElement(By.id("menu"));
	Select sel = new Select(dropDownElement);
	List<WebElement> allOptions = sel.getOptions();
	
	HashSet<String> s =new HashSet<String>();
	for (int i=0; i<allOptions.size(); i++)
	{
		WebElement opts = allOptions.get(i);
		String values = opts.getText();
		
		s.add(values);
	}
	for(String Options:s)
	{
		System.out.println(Options);
	}
	}

}
