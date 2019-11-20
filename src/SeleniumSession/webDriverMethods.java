package SeleniumSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webDriverMethods
{
	public static void main(String[] a) throws MalformedURLException
	{
		//System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Different URL Launches
		// get method will take you to the required URL
		driver.get("https://www.google.co.in"); //launches URL and waits for browser to load
		
		//launches the URL but does not wait for loading
		driver.navigate().to("https://www.facebook.com"); 

		//launches the URL but does not wait for loading
		URL url = new URL("https://www.linkedin.com");
		driver.navigate().to(url);
		
		
		String ExpectedTitle = "Linkedin Home";
		// basic driver methods..
		
		System.out.println(driver.getTitle()); // returns current page title
		
		if (ExpectedTitle.equals(driver.getTitle()))
			System.out.println("Title matches");
		else
			System.out.println("Title does not match");
			
		
		//different get attributes of webdriver
		System.out.println(driver.getCurrentUrl()); // returns current page url
	
		System.out.println(driver.getWindowHandle()); // handle ID of the current window
		
		System.out.println(driver.getWindowHandles()); // handleID's of all the window
		
		//System.out.print(driver.getPageSource()); // give page source of the active window
		
		
		//Navigation Interface methods
		driver.navigate().back(); // will go back to the previous page
		
		driver.navigate().forward(); // will go to forward page
		
		driver.navigate().refresh(); // will refresh the page
		
		Set<Cookie> s = driver.manage().getCookies();
		
		System.out.println("cookies " + s);
		
		//driver.close(); // will close the active window
		
		//driver.quit(); // close the entire browser
		
		
	}
}
