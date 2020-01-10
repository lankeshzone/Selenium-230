package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlight {
	
	public WebElement FirstName_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement firstName = driver.findElement(By.name("passFirst0"));
		return firstName;
	}
		
	public WebElement LastName_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement lastName = driver.findElement(By.name("passLast0"));
		return lastName;
	}

	public WebElement Meal_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement meal = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		return meal;
	}

	public WebElement CardType_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement cardType = driver.findElement(By.xpath("//select[@name='creditCard']"));
		return cardType;
	}

	public WebElement Number_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement number = driver.findElement(By.xpath("//input[@name='creditnumber']"));
		return number;
	}

	public WebElement ExpirationMonth_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement expirationmonth = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		return expirationmonth;
	}
	
	public WebElement ExpirationYear_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement expirationyear = driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		return expirationyear;
	}
	
	public WebElement CardFirstName_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement cardfirstname = driver.findElement(By.name("cc_frst_name"));
		return cardfirstname;
	}
	
	public WebElement CardMiddleName_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement cardmiddlename = driver.findElement(By.name("cc_mid_name"));
		return cardmiddlename;
	}
	
	public WebElement CardLastName_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement cardlastname = driver.findElement(By.name("cc_last_name"));
		return cardlastname;
	}
		
	public WebElement TicketlessTravel_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement ticketlesstravel = driver.findElement(By.xpath("//font[contains(text(),'Ticketless Travel')]"));
		return ticketlesstravel;
	}

	public WebElement Address1_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement address1 = driver.findElement(By.xpath("//input[@name='billAddress1']"));
		return address1;
	}

	public WebElement Address2_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement address2 = driver.findElement(By.xpath("//input[@name='billAddress2']"));
		return address2;
	}
	
	public WebElement City_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement city = driver.findElement(By.xpath("//input[@name='billCity']"));
		return city;
	}
	
	public WebElement State_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement state = driver.findElement(By.xpath("//input[@name='billState']"));
		return state;
	}

	public WebElement PostalCode_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement postalcode = driver.findElement(By.name("billZip"));
		return postalcode;
	}
	
	public WebElement Country_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement country = driver.findElement(By.xpath("//select[@name='billCountry']"));
		return country;
	}
	
	public WebElement Sba_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement sba = driver.findElement(By.xpath("//font[contains(text(),'Same as Billing Address')]"));
		return sba;
	}

	public WebElement DeliveryAddress1_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement deliveryaddress1 = driver.findElement(By.xpath("//input[@name='delAddress1']"));
		return deliveryaddress1;
	}

	public WebElement DeliveryAddress2_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement deliveryaddress2 = driver.findElement(By.xpath("//input[@name='delAddress2']"));
		return deliveryaddress2;
	}

	public WebElement DeliveryCity_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement deliverycity = driver.findElement(By.xpath("//input[@name='delCity']"));
		return deliverycity;
	}

	public WebElement DeliveryState_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement deliverystate = driver.findElement(By.xpath("//input[@name='delState']"));
		return deliverystate;
	}
	
	public WebElement DeliveryPostalCode_sendkeys(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement deliverypostal = driver.findElement(By.name("delZip"));
		return deliverypostal;
	}
	
	public WebElement DeliveryCountry_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement deliverycountry = driver.findElement(By.xpath("//select[@name='delCountry']"));
		return deliverycountry;
	}
	
	public WebElement Secure_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement secure = driver.findElement(By.xpath("//input[@name='buyFlights']"));
		return secure;
	}
}
