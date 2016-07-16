package webdriverconcepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pdfdownload 
{
	public static void main(String[]args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://vtu.ac.in/pdf/newsletter/n4.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("download")).click();
		//driver.switchTo().alert().accept();
		try
		{
			Runtime.getRuntime().exec("F:\\Mahesh\\Java_Training\\vtupdf.exe");
			Thread.sleep(5000);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Pdf Downloaded Sucessfully");
		driver.close();
	}

}
