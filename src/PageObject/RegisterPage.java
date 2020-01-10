package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	
	public WebElement Firstname_sendkeys(WebDriver driver,String locatorType,String locatorValue)
    {
     WebElement firstname=driver.findElement(By.name("Firstname"));
     return firstname;
    }
    
    public WebElement Lastname_sendkeys(WebDriver driver,String locatorType,String locatorValue)
    {
    	WebElement lastname=driver.findElement(By.linkText("lastName"));
    	return lastname;
    }
    
    public WebElement Phone_sendkeys(WebDriver driver,String locatorType,String locatorValue)
    {
    	WebElement phone=driver.findElement(By.name("phone"));
		return phone;
    }
    
    public WebElement Address1_sendkeys(WebDriver driver,String locatorType, String locatorValue)
    {
    	WebElement address1=driver.findElement(By.name("address1"));
    	return address1;
    }
    
    public WebElement Address2_sendkeys(WebDriver driver,String locatorType, String locatorValue)
    {
    	WebElement address2=driver.findElement(By.name("address2"));
    	return address2;
    }
    
    public WebElement City_sendkeys(WebDriver driver, String locatorType, String locatorValue)
    {
    	WebElement city=driver.findElement(By.name("city"));
    	return city;		
    }
    
    public WebElement State_sendkeys(WebDriver driver, String locatorType, String locatorValue)
    {
    	WebElement state=driver.findElement(By.name("state"));
    	return state;
    }
    
    public WebElement Postalcode_sendkeys(WebDriver driver, String locatorType, String locatorValue)
    {
    	WebElement postalcode=driver.findElement(By.name("postalCode"));
    	return postalcode;
    }
    
    public WebElement Country_select(WebDriver driver, String locatorType, String locatorValue)
    {
    	WebElement country=driver.findElement(By.name("country"));
    	return country;
    }
    
    public WebElement Username_sendkeys(WebDriver driver, String locatorType, String locatorValue)
    {
    	WebElement username=driver.findElement(By.id("email"));
    	return username;
    }
    	
    public WebElement Password_sendkeys(WebDriver driver, String loactorTyper, String locatorValue)
    {
    	WebElement password=driver.findElement(By.name("password"));
    	return password;
    }
    
    public WebElement Confirmpass_sendkeys(WebDriver driver, String loactorTyper, String locatorValue)
    {
    	WebElement confirmpass=driver.findElement(By.name("confirmPassword"));
    	return confirmpass;
    }
    
    public WebElement Submit_click(WebDriver driver,String locatorType,String locatorValue)
    {
    	WebElement submit=driver.findElement(By.name("register"));
    	return submit;
    }
}
