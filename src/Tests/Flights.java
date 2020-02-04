package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import PageObject.signOn;

public class Flights {
	
  @Test
  public void flight_Reservation() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://newtours.demoaut.com/");
	  
	  String locatorType ="ll";
	  String locatorValue = "test";
	  
	//  HomePage hpo = new HomePage();
	  
	  signOn spo = new signOn(); //object of the page
	
	  //spo.signIN_valid(driver);
	 spo.userID_EnterText(driver);
	  spo.password_EnterText(driver);
	  spo.signON(driver);
  
  }
  
  @Test
  public void Linkedin_Search() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.linkedin.com/home");
	  
	  WebElement search = driver.findElement(By.xpath("//form[@id='JOBS']//input[@placeholder='Search job titles or companies']"));
	  
	  Actions a = new Actions(driver);
	  
	  a.moveToElement(search).sendKeys("test").build().perform();
	  
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //if(search.isEnabled())
		//  search.sendKeys("Test");
		  
  
  }
  
}
