package classFile;

import org.testng.annotations.Test;

public class Report 
{
  @Test(groups= {"Regression"}, priority=1)
  public void TC06() 
  {
	  System.out.println("6");
  }

  @Test(groups= {"Smoke"})
  public void TC07() 
  {
	  System.out.println("7");
  }
  
  @Test(groups= {"Regression"}, priority=0)
  public void TC08() 
  {
	  System.out.println("8");
  }


}
