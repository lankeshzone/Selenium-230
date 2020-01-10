package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.HomePage;
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
  
  
}
