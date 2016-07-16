package com.application.libraries;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class GenericLibrary {
	public static void switchToWIndow(WebDriver driver, String strExpectedTitle){
		//use getwindowhandles() to get string of window handles of all 
		//browser during current session
		Set<String> winhandles=driver.getWindowHandles();
		Iterator<String> itr=winhandles.iterator();
		//Loop through the collection
		while(itr.hasNext()){
			//Switch to each window
			driver.switchTo().window(itr.next());
			//check the title of the window, if it matches with expected title break the loop
			if(driver.getTitle().equalsIgnoreCase(strExpectedTitle)){
				break;
			}
		}
	}
	
	public static void closeBrowser(WebDriver driver){
		driver.close();
	}
}
