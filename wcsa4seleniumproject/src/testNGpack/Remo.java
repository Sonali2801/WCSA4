package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void remo() {
	  Reporter.log("this is remo method",true);
  }
  
  @Test
  public void remo1()
  {
	  Reporter.log("this is remo1 method",true);  
  }
  @Test
  public void remo2()
  {
	  Reporter.log("this is remo2 method",true);  
  }
}
