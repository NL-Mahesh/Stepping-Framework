package com.application.test;

import org.testng.annotations.Test;

import com.application.libraries.ExcelLibrary;
import com.application.pages.EnterTimeTrackPage;
import com.application.pages.LoginPage;
import com.application.pages.ReportsPage;

public class DownloadReportTest extends BaseClass{
	@Test
	public void testDownloadReport(){
		/*ExcelLibrary xllib = new ExcelLibrary();
		String un = xllib.getExcelData("Login", 1, 0);
		String pw = xllib.getExcelData("Login", 1, 1);*/
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manager");		
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToReportsPage();
		ReportsPage rp = new ReportsPage(driver);
		rp.downloadReport();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}