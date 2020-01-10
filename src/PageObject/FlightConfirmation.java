package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightConfirmation {

	
	 public WebElement Back2flights_click(WebDriver driver,String locatorType,String locatorValue)
	   {
		   WebElement back2flights=driver.findElement(By.xpath("//td//td//td//td//td[1]//a[1]//img[1]\r\n"));
		   return back2flights;
	   }
	   
	   public WebElement Back2home_click(WebDriver driver,String locatorType,String locatorValue)
	   {
		   WebElement back2home=driver.findElement(By.xpath("//td//td//td//td[2]//a[1]//img[1]"));
		   return back2home;
	   }
	   
	   public WebElement Logout_click(WebDriver driver,String locatorType,String locatorValue)
	   {
		   WebElement logout=driver.findElement(By.xpath("//td[3]//a[1]//img[1]"));
		   return logout;
	   }

}
