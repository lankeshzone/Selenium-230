package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.className("login")).click();
	
	driver.findElement(By.id("email_create")).sendKeys("dgssdfsdfgsdfgsfd@gmail.com");
	
	driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement x = driver.findElement(By.xpath("//input[@id='id_gender1']"));
	System.out.println(x.getLocation());
	x.click();
	
	}

}
