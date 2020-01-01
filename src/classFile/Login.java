package classFile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Login 
{
	
	static WebDriver driver;
  @Test (groups= {"Regression"} ,priority =3)
  public void TC01() 
  {
	  driver = new FirefoxDriver();
	  driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	  driver.findElement(By.id("username")).sendKeys("lankeshzone@gmail.com");
	  driver.findElement(By.name("session_password")).sendKeys("lankesh123");
	  driver.findElement(By.className("btn__primary--large")).click();
	    
  }

  @Test(groups= {"Smoke"})
  public void TC02() 
  {
	   driver = new ChromeDriver();
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
  public void screenshot(ITestResult result) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	
		File fs = ts.getScreenshotAs(OutputType.FILE);
		
		String str = "D://test//TestPass"+result.getEndMillis()+".jpg";
		
		System.out.println(str);
	
		FileUtils.copyFile(fs,new File(str));
	}
	
}
