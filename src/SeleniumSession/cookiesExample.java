package SeleniumSession;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub - Lankesh

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com");

		// this will resize the window to full screen
		driver.manage().window().fullscreen();
		
		//returns the current position of the window
		System.out.println("position " + driver.manage().window().getPosition());
		
		
		//returns the window size
		System.out.println(driver.manage().window().getSize());
		
		//reposition of window
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		
		//resizing the window
		Dimension d = new Dimension(200,200);
		driver.manage().window().setSize(d);
		
		//maximize the window
		driver.manage().window().maximize();
		
	/*	System.out.println("Get cookies " + driver.manage().getCookies());
			driver.manage().deleteAllCookies();
		
		
		//return the cookies available into a set type of coollection
		Set<Cookie> s = driver.manage().getCookies();
		System.out.println("Count of cookies before " + s.size());
		
		
		for (Cookie c : s)
		{
			//add cookies into the machine
			driver.manage().addCookie(c);
		}
		
		System.out.println("Count of cookies After " + s.size());
		System.out.println("Get cookies after addition " + driver.manage().getCookies());*/
	}

}
