package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementIdentification {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.manage().window().maximize();
		
		//username
		
		WebElement username;
		username = driver.findElement(By.id("username"));
		username.sendKeys("lankeshzone@gmail.com");
		System.out.println("Location of username " + username.getLocation());
		
		//session_password
		
		WebElement pwd;
		By locator;
		locator = By.name("session_password");
		pwd = driver.findElement(locator);
		pwd.sendKeys("Hello");
		System.out.println("Location of Password  " + pwd.getLocation());
		
		//class-name - button__password-visibility
		WebElement show;
		locator = By.className("button__password-visibility");
		show = driver.findElement(locator);
		System.out.println("Location of Password  " + show.getLocation());
		show.click();
		
		//linkText - Forgot password?
		WebElement forgot;
		locator = By.linkText("Forgot password?");
		forgot = driver.findElement(locator);
		System.out.println("Location of Password  " + forgot.getLocation());
		
		//partiallink - Agreement
		WebElement userAgree;
		locator = By.partialLinkText("Agreement");
		userAgree = driver.findElement(locator);
		System.out.println("Location of Password  " + userAgree.getLocation());
		
		
		//Tagname - h1
		WebElement welcome;
		locator = By.tagName("h1");
		welcome = driver.findElement(locator);
		System.out.println("Location of Password  " + userAgree.getLocation());
		
		//X-path - //button[@class='btn__primary--large from__button--floating']
		WebElement signIn;
		locator = By.xpath("//button[@class='btn__primary--large from__button--floating']");
		signIn = driver.findElement(locator);
		System.out.println("Location of Password  " + signIn.getLocation());
		
		//CSS-Path - body.system-fonts:nth-child(2) main.app__content:nth-child(2) div:nth-child(1) div.footer-app-content-actions p:nth-child(2) > a:nth-child(1)
		WebElement join;
		locator = By.cssSelector("body.system-fonts:nth-child(2) main.app__content:nth-child(2) div:nth-child(1) div.footer-app-content-actions p:nth-child(2) > a:nth-child(1)");
		join = driver.findElement(locator);
		System.out.println("Location of Password  " + join.getLocation());
		
	
	
	
	
	}

}
