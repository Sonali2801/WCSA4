package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectSelectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("file:///C:/Users/Dell/Desktop/WCSA4/MultiSelectDropdown.html");
		 WebElement DropDownElement = driver.findElement(By.id("menu"));
		 Select sel = new Select(DropDownElement);
		 Thread.sleep(5000);
		 sel.selectByValue("v6");
}
}
