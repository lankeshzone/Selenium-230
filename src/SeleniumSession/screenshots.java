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
		
		//Takes screen shot is used to take the snapshot of the current active page
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		//file is used to get the object of captured file
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		//COpy is used to store the file in a specified location
		FileUtils.copyFile(f,new File("D://Test//Century12345.png"));
		
	}

}
