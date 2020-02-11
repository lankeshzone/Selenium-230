package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverLaunch
{
	
	WebDriver driver;

	public void launchBrowser(String browser, String url)
	{
		
		// 1) ceating an object of type WebDriver but targeted from chromeBrowser
		// 2) browser instance itself can be treated as idealised browser...
		
		switch (browser)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
		 	break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		
		
		//launching the url
		driver.get(url);
	
	
	
	}
	
	
	
	public static void main(String[] args)
	{
		driverLaunch d = new driverLaunch();
		
		
		String browser ="chrome"; // or bring it from test data source (excel/config/db etc.,)
		String url = "https://www.facebook.com";
		
		d.launchBrowser(browser, url);
		
	}
	
}
