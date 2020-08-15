package com.clickJet.module3.cj_holidayPackages;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HolidayPackagesPageObjects;
import com.clickJet.pageObjects.HomePageObjects;

import testData.CitiesFromDatabase;
import utilities.Base;

public class cj_holidayPackages_SS1 extends Base
{
	WebDriver driver;
	
	@Test
	public void cj_hlidayPackages_SS1_positiveAction() throws IOException, SQLException
	{
		driver = driverInitialize();
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.clickOnHolidayPackages();
		HolidayPackagesPageObjects holidayPackagesObjects = new HolidayPackagesPageObjects(driver);
		holidayPackagesObjects.getDestinationBox().sendKeys(CitiesFromDatabase.getDestinationCity());
		holidayPackagesObjects.getDepartureBox().sendKeys(CitiesFromDatabase.getDepartureCity());
		holidayPackagesObjects.getReturnBox().sendKeys(CitiesFromDatabase.getDepartureCity());
		holidayPackagesObjects.selectDate();
		holidayPackagesObjects.clickOnSearch();
	}
}
