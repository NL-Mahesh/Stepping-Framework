package com.application.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	WebDriver driver;
	public ReportsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="ext-gen38")
	private WebElement createChartButton;
	
	@FindBy(id="createChartLightbox_commitBtn")
	private WebElement exportPdfButton;
	
	@FindBy(id="createChartLightbox_downloadPdfBtn")
	private WebElement downloadButton;	
	
	public void downloadReport(){
		createChartButton.click();
		exportPdfButton.click();
		downloadButton.click();
		try {
			Runtime.getRuntime().exec
			("F:\\Mahesh\\AdvancedFramework\\SeleniumTutorials\\src\\test\\resources\\filedownload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
