package webdriverconcepts;
import java.util.*;
import java.util.NoSuchElementException;
import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Checkpoints 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		/*Title Checkpoint
		 * Expected Title comes form requirement */
		String expectedTitle="actiTIME - Login";
		//Actual Title comes from the page
		String actualTitle=driver.getTitle();
		//compare the expected & actual Title
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Application Openend");
		}
		else
		{
			System.out.println("Application Failed");
		}
		//Text Checkpoint
		String expectedText="Please identify yourself";
		/*Find the element[html tag] using findElement()
		and use the method getText() to get the actual text*/
		String actualText=driver.findElement(By.id("headerContainer")).getText();
		if(actualText.equals(expectedText))
		{
			System.out.println("Application Openend");
		}
		else
		{
			System.out.println("Application Failed");
		}
		//1-->Element checkpoint-Try Catch Method
		try
		{
			driver.findElement(By.id("username"));
			System.out.println("Element exists");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element dose not exists");
		}
		//2-->Element checkpoint-findElements as collections
		List<WebElement> ele=driver.findElements(By.id("username"));
		//System.out.println(ele);
		//System.out.println(ele.size());
		//System.out.println(ele.get(0));
		if(ele.size()>0)
		{
			System.out.println("Element exists");
		}
		else
		{
			System.out.println("Element dose not exists");
		}
		//Element enabled or disable checkpoint
		boolean enabled=driver.findElement(By.name("username")).isEnabled();
				if(enabled)
				{
					System.out.println("Element is Enabled");
				}
				else
				{
					System.out.println("Element is Disabled"); 
				}		
		//Element visible or hidden checkpoint
		boolean visible=driver.findElement(By.id("forgetPasswordEmailOrUsername")).isDisplayed();
		if(visible)
		{
			System.out.println("Element is Visible");
		}
		else
		{
			System.out.println("Element is Hidden");
		}
		//To throw an exception since forgot password form is not visible
		//driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("user");
	}

}
