package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.linkedin.com/home");
		  
		  WebElement search = driver.findElement(By.xpath("//form[@id='JOBS']//input[@placeholder='Search job titles or companies']"));
		  
		  
		  
		  Actions a = new Actions(driver);
		  
		 Action at =  a.sendKeys(search,"test").build();
		 at.perform();
		  
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  //if(search.isEnabled())
			//  search.sendKeys("Test");
		  	System.out.println("Done");
	}

}
