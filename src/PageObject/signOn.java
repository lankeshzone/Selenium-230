package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signOn {
	
	static WebElement user, pass, submit;

	public WebElement Regisform_click(WebDriver driver,String locatorType,String locatorValue)
	{
		WebElement regisform=driver.findElement(By.linkText("registration form"));
		return regisform;
	}
	
	static public WebElement User_sendkeys(WebDriver driver,String locatorType,String locatorValue)
	{
		user=driver.findElement(By.name("userName"));
		return user;
	}
	
	public void userID_EnterText(WebDriver driver)
	{
		User_sendkeys(driver, "test","test");
		user.sendKeys("Lankesh123");
	}
	
	public WebElement pass_sendkeys(WebDriver driver,String locatorType,String locatorValue)
	{
		 pass=driver.findElement(By.name("password"));
		return pass;
	}
	
	public void password_EnterText(WebDriver driver)
	{	
		pass_sendkeys(driver,"test","test");

		pass.sendKeys("lankesh123");
	}
	
	public WebElement submit_click(WebDriver driver,String locatorType,String locatorValue)
	{
		submit=driver.findElement(By.xpath("//input[@name='login']"));
		return submit;
	}
	
	public void signON(WebDriver driver)
	{
		submit_click(driver,"test","test");
		submit.click();
	}
	
	
	//grouping of actions
	public void signIN_valid(WebDriver driver)
	{
		 signOn spo = new signOn(); //object of the page
		  
		  spo.userID_EnterText(driver);
		  spo.password_EnterText(driver);
		  spo.signON(driver);
	  
	}
}
