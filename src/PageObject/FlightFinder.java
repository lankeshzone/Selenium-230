package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightFinder
{
	static WebElement RoundTrip;
	
	public static WebElement RoundTrip_click(WebDriver driver, String locatorType, String locatorValue)
	{
		RoundTrip = driver.findElement(By.xpath("//body//b//input[1]"));
		return RoundTrip;
	}
	
	public void RoundTrip_ClickAction(WebDriver driver)
	{
		RoundTrip_click(driver, "test1","test1");
		RoundTrip.click();	
	}
	
	public WebElement OneWay_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement oneWay = driver.findElement(By.xpath("//body//b//input[2]"));
		return oneWay;
	}
	
	public WebElement Passengers_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement passengers = driver.findElement(By.xpath("//select[@name='passCount']"));
		return passengers;
	}
	
	public WebElement Departing_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement departing = driver.findElement(By.xpath("//select[@name='fromPort']"));
		return departing;
	}
	
	public WebElement Onmonth_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement onmonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		return onmonth;
	}
	
	public WebElement Ondate_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement ondate = driver.findElement(By.xpath("//select[@name='fromDay']"));
		return ondate;
	}
	
	public WebElement Arriving_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement arriving = driver.findElement(By.xpath("//select[@name='toPort']"));
		return arriving;
	}
	
	public WebElement Returningmonth_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement returningmonth = driver.findElement(By.xpath("//select[@name='toMonth']"));
		return returningmonth;
	}
	
	public WebElement Returningday_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement returningday = driver.findElement(By.xpath("//select[@name='toDay']"));
		return returningday;
	}
	
	public WebElement Economy_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement economy = driver.findElement(By.xpath("//font[contains(text(),'Economy class')]"));
		return economy;
	}
	
	public WebElement Business_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement business = driver.findElement(By.xpath("//font[contains(text(),'Business class')]"));
		return business;
	}
	
	public WebElement Firstclass_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement firstclass = driver.findElement(By.xpath("//font[contains(text(),'First class')]"));
		return firstclass;
	}
		
	public WebElement Airline_select(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement airline=driver.findElement(By.xpath("//select[@name='airline']"));
		return airline;
    }
	
	public WebElement Continue_click(WebDriver driver, String locatorType, String locatorValue)
	{
		WebElement cont = driver.findElement(By.name("findFlights"));
		return cont;
	}

}
