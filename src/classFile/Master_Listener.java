package classFile;



	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	import classFile.Login;

	public class Master_Listener implements ITestListener
	{
		static WebDriver driver;
		/*public Master_Listener(WebDriver driver)
		{
			driver = this.driver;
		}*/

		 public void onTestFailure(ITestResult result) 
	     {
	            
	     }

	     @Override
	     public void onTestSkipped(ITestResult result) 
	     {
	           
	     }

	  

	     private String getMethodContext(ITestResult result) 
	     {
	            //String browser = result.getTestContext().getCurrentXmlTest()
	            //.getParameter("browser");
	            String testClasss = result.getTestClass().getName();
	            String name = result.getName();
	            String rs = testClasss + " | " + name;
	            return rs;
	     }
		
		
		public void onTestSuccess(ITestResult result)
		{
			System.out.println(result.getMethod());
			
			Login l = new Login();
			try
			{
			l.screenshot(result);
			}
			catch(IOException e)
			{
				
			}
		}
		
		
		
		
	}


