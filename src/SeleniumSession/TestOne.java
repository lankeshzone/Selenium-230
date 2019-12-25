package SeleniumSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne 
{
	
	@BeforeTest
	public void beforetest()
	{
		
		System.out.println("Iam executed once for all tests before executing test ");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Iam executed once for each class ");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will get executed before eact test method");
	}
  
	//this will be used to write automated scripts
		@Test (groups="Regression", priority=4, dependsOnMethods="TC05", enabled=false)
		  public void TC01() 
		  {
				System.out.println("This is the first automated test in TestNG");
		  
		  }
		
		
		@Test(groups= {"Smoke","Regression"},priority=2)
		public void TC02() 
		{
				System.out.println("This is the second automated test in TestNG");
		
		}
		
		
		@Test(priority=3)
				
				
		public void TC03() 
		{
				System.out.println("This is the third automated test in TestNG");
		
		}
		
		
		@Test(priority=1)
		public void TC04() 
		{
				System.out.println("This is the fourth automated test in TestNG");
		
		}
		

		@AfterMethod
		public void aftermethod()
		{
			System.out.println("I will get executed after each test method");
		}

		@AfterClass
		public void afterclass()
		{
			System.out.println("Iam executed after the testngclass file has executed ");
		}

		@AfterTest
		public void aftertest()
		{
			
			System.out.println("Iam executed once for all tests after executig tests");
		}
		
}
