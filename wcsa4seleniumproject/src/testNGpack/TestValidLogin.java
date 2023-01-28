package testNGpack;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest{
  @Test
  @Parameters({"usn","pass"})
  public void validLogin(String username, String password) {
	  
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
  }
  

}
