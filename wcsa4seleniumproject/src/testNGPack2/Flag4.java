package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logInMethod() {
	  
	  Reporter.log("LogIn is Done!!",true);
  }
  @Test(dependsOnMethods = "logInMethod")
  public void createUser()
  {
	  Reporter.log("User Created!!",true);
  }
  @Test(dependsOnMethods = "createUser")
  public void logOutMethod()
  {
	  Reporter.log("LogOut is Done!!",true);
  }
}
