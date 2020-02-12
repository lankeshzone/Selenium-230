package SeleniumSession;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub - Lankesh
		
		WebDriver driver = new ChromeDriver();
		
		
		/*driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		//to 
		Alert a = driver.switchTo().alert();
		
		System.out.println("Get text "  + a.getText());
		
		a.sendKeys("'Lankesh'" );
		
		//a.accept();
		
		a.dismiss();
		*/
		
		/*driver.get("http://demo.automationtesting.in/Frames.html");

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		
		// switch to frames to work with the elements inside the frame
		
		// use either webelement or index or name or id
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("lankesh");
	
	*/
		
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Multiple']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		
		Set<String> s = driver.getWindowHandles();
		
		for (String e : s)
		{
			driver.switchTo().window(e);
		//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			System.out.println("Title of each window " + driver.getTitle());
			if(driver.getTitle().contains("Sakinalium"))
			{
				System.out.println("Iam in");
				driver.findElement(By.linkText("Contact")).click();
			}
		}
		
		
	
	}

}
