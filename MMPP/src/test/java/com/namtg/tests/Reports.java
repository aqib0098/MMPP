package com.namtg.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.namtg.pages.reports;


public class Reports 
{
	
	WebDriver driver;
	// test
	@Test(priority=3, description="This TC to verify the report tab")
	public void report()
	{
		reports reports = new reports(driver);
		// Click on the report Tab
		reports.clickOnTheReportsTab();
		// verify the title (Reports Detials)
		reports.verifyTheTitle();
		// Select the Appointments
		reports.selectAppointments();
		// Write the Report name 
		reports.reportName("test");
		// Write the Report Description 
		reports.WriteReportDescription("123 Test");
		// Click on the submit button 
		reports.submit();	
	}
	
	
	
}


