package com.clickJet.module2.cj_hotels;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HomePageObjects;
import com.clickJet.pageObjects.HotelPageObjects;

import testData.CitiesFromDatabase;
import utilities.Base;

public class cj_hotels_SS1 extends Base
{
	WebDriver driver;
	
	@Test
	public void cj_hotels_SS1_positiveAction() throws IOException, SQLException
	{
		driver = driverInitialize();
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.clickOnHotels();
		HotelPageObjects hotelObjects = new HotelPageObjects(driver);
		hotelObjects.getDestinationCityBox().sendKeys(CitiesFromDatabase.getDestinationCity());
		hotelObjects.selectDate();
		hotelObjects.selectAdults();
		hotelObjects.selectChildren();
		hotelObjects.selectInfants();
		hotelObjects.clickOnSearch();
	}
}
