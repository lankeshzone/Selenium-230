package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsExample {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		
	/*	driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		
		WebElement slider;
		slider = driver.findElement(By.xpath("//div[@class='layered_price']//a[1]"));
		
		//using javascript method to scroll down...
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		//Create object for actions and pass the browser to perform associated actions
		Actions act = new Actions(driver);
		
		//method chaining concept
		//act.dragAndDropBy(slider, 100, 0).build().perform();	
	
		Action a = act.dragAndDropBy(slider, 100,0).build();
		
		a.perform();*/
		
		driver.get("http://demo.automationtesting.in/Youtube.html");
		
		driver.findElement(By.xpath("//div[@class='col-xs-9 col-xs-offset-3']")).click();
		
	}

}
