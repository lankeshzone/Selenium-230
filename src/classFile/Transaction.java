package classFile;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Transaction {
  
	@Test(groups= {"Regression"}, dependsOnMethods = {"TC04","TC05"})
  public void TC03() 
  {
		System.out.println("3");
  }
  
  
  @Test(groups= {"Smoke"})
  public void TC04() 
  {
	  System.out.println("4");
	  Assert.fail();
  }

  @Test(groups= {"Regression"})
  public void TC05() 
  {
	  System.out.println("5"); 
  }

}
