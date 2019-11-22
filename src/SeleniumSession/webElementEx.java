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
		
		//Identification of elements 
		skills = d.findElement(By.xpath("//select[@id='Skills']"));
		firstname = d.findElement(By.xpath("//input[@placeholder='First Name']"));
		submit = d.findElement(By.id("submitbtn"));
		male = d.findElement(By.xpath("//label[1]//input[1]"));
		cricket = d.findElement(By.id("checkbox1"));
		
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
		
		
		submit.submit();
		
		refresh = d.findElement(By.id("Button1"));
		refresh.click();
		
		male.click();
		System.out.println("is selected" + male.isSelected());
		
		cricket.click();
		System.out.println("is selected" + cricket.isSelected());*/
		
		//Select class -> Multiline/dropdowns
		
		Select s = new Select(skills);
		s.selectByIndex(4);
		
		System.out.println("option selected " + s.getFirstSelectedOption());
		
		s.selectByValue("C");
		
		s.deselectByValue("C");
	}

}
