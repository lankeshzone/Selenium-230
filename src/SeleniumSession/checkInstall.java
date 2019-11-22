package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class checkInstall 
{
	public static void main(String[] ar)
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		ChromeDriver driver2 = new ChromeDriver();
		
		InternetExplorerDriver d = new InternetExplorerDriver();
		d.get("https://www.google.co.in");
		
		
	}
	
}
