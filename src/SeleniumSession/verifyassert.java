package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyassert {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com");

		String expectedMessage = "Linkedin Home";
		
		WebElement header = driver.findElement(By.className("hero__headline--basic"));
		
		String actualMessage = header.getText();
		
		
		Assert.fail("Iam failing");
		
		//Verification -- SoftAssertion
		if (actualMessage.equals(expectedMessage))
			System.out.println("Message matches " + actualMessage);
		else
		{
			System.out.println("Message does not match " + actualMessage);
	
		}
	/*	Assert.assertEquals(, expected); // compare any two items for euality
		Assert.assertNotEquals(); //
		Assert.assertFalse(condition); //condition is checked with false
		Assert.assertTrue(condition); // condition is checked with true
		Assert.assertNull(object); //
		Assert.fail(message); // explicit fail of the script
		
		*/
		
		Assert.assertNotEquals(actualMessage, expectedMessage);
		
		Assert.assertFalse(!header.isDisplayed());
		
		//Assert.assertTrue(header.isSelected());
		
		//String str = "lankesh";
		
		//Assert.assertNull(str,"Iam null");

		System.out.println("After assertion statement ");
		
	}

}
