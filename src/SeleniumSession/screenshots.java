package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshots {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com");
			
		// f = new File("D://Test//selenium230.png");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f,new File("D://Test//Century12345.png"));
		
	}

}
