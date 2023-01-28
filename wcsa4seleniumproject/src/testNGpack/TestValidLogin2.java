package testNGpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	static WebDriver driver;
  @Test
  @Parameters({"browser","Url","usn","pass"})
  public void method1(String browserValue, String url, String Username, String Password) {
	  if(browserValue.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  
		  driver.findElement(By.name("username")).sendKeys(Username);
		  driver.findElement(By.name("pwd")).sendKeys("Password");
		  driver.findElement(By.id("loginButton")).click();
		  
	  }
	  
	  else if (browserValue.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);  
	  }
	  
	  else 
	  {
		  Reporter.log("use current browser!!",true);
	  }
  }
}
