package SeleniumSession;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchEx {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	
		String beforeTab= driver.getWindowHandle();
		
		
		System.out.println("Before value" + beforeTab + "Title " +driver.getTitle());
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		String AfterTab = driver.getWindowHandle();
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> i = s.iterator();
		
		System.out.println("No. of windows " + s.size());
		while(i.hasNext())
			driver.switchTo().window(i.next());
	
		driver.findElement(By.xpath("//li[@class='drop']//a[contains(text(),'Documentation')]")).click();
		
		driver.switchTo().window(beforeTab);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).getLocation());

		System.out.println("AfterValue " + AfterTab + "Title " + driver.getTitle());
	
		
	
	
	}

}
