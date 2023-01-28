package mock;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class EliminateDuplicate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Dell/Desktop/WCSA4/MultiSelectDropdown.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDownElement);
		List<WebElement> allOptions = sel.getOptions();
		
		TreeSet<String> s = new TreeSet<String>();
		for(int i=0; i<allOptions.size(); i++)
		{
			WebElement Opts = allOptions.get(i);
			String Values = Opts.getText();
			
			s.add(Values);
		}
		for(String Options:s)
		{
			System.out.println(Options);
		}
		
				
		
	}

}
