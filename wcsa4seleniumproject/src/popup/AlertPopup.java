package popup;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	driver.get("file:///C:/Users/Dell/Desktop/WCSA4/Popup.html");
	WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
	button.click();
	
	//now switch ur control to Alert popup
	
	Alert a1 = driver.switchTo().alert();
	
	//accept the alert popup
	Thread.sleep(2000);
	//a1.accept();
	
	//dismiss the alert popup
	//a1.dismiss();
	
	//text of alert popup
	String textOfAlert = a1.getText();
	System.out.println(textOfAlert);
	
	//a1.sendKeys("admin");
}
}
