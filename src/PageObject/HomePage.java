package PageObject;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class HomePage {
		
		static WebDriver driver; //class homepage driver
		
		public HomePage(WebDriver driver) //testcase
		{
		this.driver = driver;	
		}
		
		//Top Menu//
	    public WebElement Signon_click(String locatorType,String locatorValue)
	    {
	     WebElement signon=driver.findElement(By.linkText("SIGN-ON"));
	     return signon;
	    }
	    
	    public WebElement Register_click(String locatorType,String locatorValue)
	    {
	    	WebElement register=driver.findElement(By.linkText("REGISTER"));
	    	return register;
	    }
	    
	    public WebElement Support_click(String locatorType,String locatorValue)
	    {
	    	WebElement support=driver.findElement(By.linkText("SUPPORT"));
	    	return support;
	    }
	    
	    public WebElement Contact_click(String locatorType,String locatorValue)
	    {
	    	WebElement contact=driver.findElement(By.linkText("CONTACT"));
	    	return contact;
	    }
	    
	    //Side Menu//
	    public WebElement Home_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement home=driver.findElement(By.linkText("Home"));
	    	return home;
	    }
	    
	    public WebElement Flights_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement flights=driver.findElement(By.linkText("Flights"));
	    	return flights;
	    }
	    
	    public WebElement Hotels_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement hotels=driver.findElement(By.linkText("Hotels"));
	    	return hotels;
	    }
	    
	    public WebElement Carrent_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement carrent=driver.findElement(By.linkText("Car Rentals"));
	    	return carrent;
	    }
	    
	    public WebElement Cruise_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement cruise=driver.findElement(By.linkText("Cruises"));
	    	return cruise;
	    }
	    
	    public WebElement Destination_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement destination=driver.findElement(By.linkText("Destinations"));
	    	return destination;
	    }
	    
	    public WebElement Vacation_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement vacation=driver.findElement(By.linkText("Vacations"));
	    	return vacation;
	    }
	    
	    //Sign-in//
	    public WebElement Username_sendkeys(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement username=driver.findElement(By.name("userName"));
	    	return username;   	
	    }
	    
	    public WebElement Password_sendkeys(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement password=driver.findElement(By.name("password"));
	    	return password;
	    }
	    
	    public WebElement Signin_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement signin=driver.findElement(By.name("login"));
	    	return signin;
	    }
	    
	    public WebElement Yourdest_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement yourdest=driver.findElement(By.linkText("your destination"));
	    	return yourdest;
	    }
	    
	    public WebElement Vacadest_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement vacadest=driver.findElement(By.linkText("featured vacation destinations"));
	    	return vacadest;
	    }
	    
	    public WebElement Regis_click(WebDriver driver,String locatorType,String locatorValue)
	    {
	    	WebElement regis=driver.findElement(By.linkText("Register here"));
	    	return regis;
	    }
	    
	}


