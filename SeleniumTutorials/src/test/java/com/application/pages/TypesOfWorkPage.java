package com.application.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWorkPage {
	WebDriver driver;
	public TypesOfWorkPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	@FindBy(id="ext-gen7")
	private WebElement createTypeOfWorkButton;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="//a[text()='Selenium']/../../td[6]/a")
	private WebElement deleteLink;
	
	public void logout(){
		logoutLink.click();
	}	
	
	public void navigateToCreateNewTypeOfWorkPage(){
		createTypeOfWorkButton.click();
	}
	public void deleteTypeOfWork(){
		deleteLink.click();
		//Get the text
		//driver.switchTo().alert().getText();
		//click on ok
		driver.switchTo().alert().accept();
		//click on cancel
		//driver.switchTo().alert().dismiss();
		
	}
	
}