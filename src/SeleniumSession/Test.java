package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/CITS-demo");
		
		driver.findElement(By.linkText("About Us")).click();
	
	}

}
