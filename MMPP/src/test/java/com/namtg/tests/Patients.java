package com.namtg.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.namtg.baseclass.baseClass;
import com.namtg.pages.add_Prescription;
import com.namtg.pages.create_Fee;
import com.namtg.pages.reports;


public class Patients extends baseClass  
{

	
	 
	
	@Test(priority=1, description="This TC to verify the Add Prescription")
	public void Add_prescription_2() throws InterruptedException
	{
		
		add_Prescription addPrescription = new add_Prescription(driver);
		
		// Click on the Add Prescription link
		addPrescription.clickAddPrescriptionTab();
		// Verify the title 
		addPrescription.verifyTheTitle();
		// Enter the prescription name	
		addPrescription.prescriptionName();
		// Enter the Prescription Description:
		addPrescription.prescriptionDescription();
		// Click on the Submit button
		addPrescription.submit();	
	}
	
	
	@Test(priority=2, description="This TC to verify the create fee tab")
	public void Creats_fee()
	{
		create_Fee createFee = new create_Fee(driver);
		
		// Click on the Create Fee tab
		createFee.clickOnTheCreateFeeTab();
		// Verify the title "Fee Details"
		createFee.verifyTheTitle();
		// Click on the submit
		createFee.submit();
		
		
	}

	
	
}