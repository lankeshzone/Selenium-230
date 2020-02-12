package SeleniumSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEample 
{
	
	public static void main(String[] args) throws MalformedURLException
	{
		//create an instance of the browser that script needs to be executed...
		WebDriver driver = new ChromeDriver();
		// when to use local browser and when to use remote driver...
		
		
		
		//get method will launch the particular url
		driver.get("https://www.hdfcbank.com/?_ga=2.216172755.454579452.1581400029-139579225.1565164349");
		//TimeOuts Interface
		//elements wait
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.NANOSECONDS);
		WebElement e = driver.findElement(By.className("btn"));
		
		
		//difference between Get/to method...
		// Selenium will wait for the method complete the process
		
		//takes string as parameter and launces the url
	/*	driver.navigate().to("https://www.google.co.in");
		// selenium doesn't wait to complete the launch
		
		//takes URL as the parameter and launches the url
		URL u = new URL("https://www.facebook.com");
		driver.navigate().to(u);
		*/
		
		System.out.println("URL " + driver.getCurrentUrl());
		System.out.println("Title " + driver.getTitle());
		//System.out.println("PageSource " +  driver.getPageSource());
		System.out.println("WindowHandle " + driver.getWindowHandle());
		
		//return all the window id that are open on the browser
		Set<String> s = driver.getWindowHandles();
		
		System.out.println("Windowhandles "  + s);
		
		
		driver.get("https://www.linkedin.com");
		
		
		//Navigation Interface...
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		
	
		
		
		
		//wait for asynchronous command to finish execution
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		driver.navigate().to("https://www.skilon.com");
		
		
		//waits for page to load
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.get("https://www.skilon.com");
		
		
		
		//shut the current window tab...
		//driver.close();
		
		//shut your browser it will kill the object as well
		driver.quit();
		
	}
	
}
