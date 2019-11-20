package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkInstall 
{
	public static void main(String[] ar)
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		ChromeDriver driver2 = new ChromeDriver();
		
		FirefoxDriver driver3 = new FirefoxDriver();
		
		
	}
	
}
