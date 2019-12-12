package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsExample {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Hello');");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	
		
		
		FluentWait wait2 = new FluentWait(driver)
				.withTimeout(10,TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
		wait2.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		
		
		
	}

}
