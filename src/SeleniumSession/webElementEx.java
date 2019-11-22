package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webElementEx {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver  d = new FirefoxDriver();
		
		d.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname, male, cricket, skills, submit, refresh;
		
		int x;
		x = 10;
		
	/*	firstname = d.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		firstname.click(); // clicks on the webelement
		
		System.out.println(" Attribute " + firstname.getAttribute("type"));
		
		System.out.println(" CSS Value " + firstname.getCssValue("font-size"));
		
		System.out.println(" TagName " + firstname.getTagName());
		
		System.out.println(" Location " + firstname.getLocation());
		
		System.out.println(" Size " + firstname.getSize());
		
		System.out.println(" Displayed " + firstname.isDisplayed());
		
		System.out.println(" Enabled " + firstname.isEnabled());
		
		System.out.println(" Selected " + firstname.isSelected());
		
		firstname.sendKeys("Lankesh");
		
		Thread.sleep(5000);
		
		firstname.clear();
		
		submit = d.findElement(By.id("submitbtn"));
		
		submit.submit();
		
		refresh = d.findElement(By.id("Button1"));
		refresh.click();
		
		male = d.findElement(By.xpath("//label[1]//input[1]"));
		male.click();
		System.out.println("is selected" + male.isSelected());
		
		cricket = d.findElement(By.id("checkbox1"));
		cricket.click();
		System.out.println("is selected" + cricket.isSelected());*/
		
		skills = d.findElement(By.xpath("//select[@id='Skills']"));
		//Select class -> Multiline/dropdowns
		
		Select s = new Select(skills);
		s.selectByIndex(4);
		
		System.out.println("option selected " + s.getFirstSelectedOption());
		
		s.selectByValue("C");
		
		s.deselectByValue("C");
	}

}
