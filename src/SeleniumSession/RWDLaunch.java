package SeleniumSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class RWDLaunch {

	public static void main(String[] args) throws MalformedURLException 
	{
	//URl -- the hub connection URL
		
		URL url = new URL("http://192.168.1.10:4444/wd/hub");
		
		//capabilities -
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		
		WebDriver driver = new RemoteWebDriver(url,cap);
		
		  driver.get("https://wwww.facebook.com");
		  driver.findElement(By.name("firstname")).sendKeys("century");
		  driver.findElement(By.name("lastname")).sendKeys("services");
		  driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("lankesh");
		  WebElement day = driver.findElement(By.id("day"));
		  Select s = new Select(day);
		  s.selectByIndex(4);
		  
		  WebElement month = driver.findElement(By.name("birthday_month"));
		  Select s2 = new Select(month);
		  s2.selectByIndex(2);
		  
		  WebElement year = driver.findElement(By.id("year"));
		  Select s3 = new Select(year);
		  s3.selectByIndex(7);
		  
		  driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();
		
	}

}
