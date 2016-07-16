package com.application.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{		
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		//DesiredCapabilities cap=DesiredCapabilities.chrome();
		//DesiredCapabilities cap=DesiredCapabilities.firefox();
		//cap.setPlatform(Platform.WINDOWS);					
		//cap.setBrowserName("internet explorer");
		/*System.setProperty("webdriver.chrome.driver", 
				"src/test/resources/browserdirvers/chromedriver.exe");*/
		System.setProperty("webdriver.ie.driver", 
				"src/test/resources/browserdirvers/IEDriverServer.exe");
		WebDriver driver=new RemoteWebDriver
				(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(10000);
		driver.quit(); 
	}
}
