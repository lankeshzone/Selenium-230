package SeleniumSession;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchEx {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	
	/*	String beforeTab= driver.getWindowHandle();
		
		
		System.out.println("Before value" + beforeTab + "Title " +driver.getTitle());
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		String AfterTab = driver.getWindowHandle();
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> i = s.iterator();
		
		System.out.println("No. of windows " + s.size());
		while(i.hasNext())
			driver.switchTo().window(i.next());
	*/
		
		//Thread.sleep(5000);
		
		/*WebDriverWait wt = new WebDriverWait(driver, 10);
		
		wt.until(ExpectedConditions..alertIsPresent());
		
		driver.switchTo().alert().accept();	
		
		driver.findElement(By.xpath("//li[@class='drop']//a[contains(text(),'Documentation')]")).click();
		
		*/
		driver.findElement(By.id("cookie_action_close_header")).click();;
	
		String beforeTab= driver.getWindowHandle();
		
		
		System.out.println("Before value" + beforeTab + "Title " +driver.getTitle());
	
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("button1")));
	
		driver.findElement(By.id("button1")).click();
		
		String AfterTab = driver.getWindowHandle();
		
		System.out.println("After value" + AfterTab + "Title " +driver.getTitle());
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> i = s.iterator();
		
		System.out.println("No. of windows " + s.size());
		while(i.hasNext())
			driver.switchTo().window(i.next());
		
	
	
	}

}
