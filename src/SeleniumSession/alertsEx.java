package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsEx {

	public static void main(String[] args)
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		// alert variable... perform different actions
		Alert a = driver.switchTo().alert();
		
		System.out.println("message on alert box" + a.getText());
		
		//to click on Okay or accept button on the alert box
		a.accept();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		a = driver.switchTo().alert();
		
		//to cancel the alert box
		a.dismiss();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		a= driver.switchTo().alert();
		
		//to provide input to the alert box
		a.sendKeys("Hello iam from test case");
		
		a.accept();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		
		//using frame id or name attribute
	//	driver.switchTo().frame("singleframe");
		
		//using frame index
	//	driver.switchTo().frame(0);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		//using frame webelement
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Lankesh");
	
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Interactions")).click();
		
	}

}
