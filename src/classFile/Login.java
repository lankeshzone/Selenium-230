package classFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login 
{
  @Test (groups= {"Regression"} ,priority =3)
  public void TC01() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	  driver.findElement(By.id("username")).sendKeys("lankeshzone@gmail.com");
	  driver.findElement(By.name("session_password")).sendKeys("lankesh123");
	  driver.findElement(By.className("btn__primary--large")).click();
	    
  }

  @Test(groups= {"Smoke"})
  public void TC02() 
  {
	  WebDriver driver = new ChromeDriver();
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
