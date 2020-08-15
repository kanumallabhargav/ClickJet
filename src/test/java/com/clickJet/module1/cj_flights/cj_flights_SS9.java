package com.clickJet.module1.cj_flights;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HomePageObjects;

import testData.CitiesFromDatabase;
import utilities.Base;

public class cj_flights_SS9 extends Base
{
WebDriver driver;
	
	@Test
	public void cj_flights_SS9_positiveAction() throws IOException, SQLException
	{
		driver = driverInitialize();
		
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.getDepartureCity().sendKeys(CitiesFromDatabase.getDepartureCity());
		homeObjects.getDestinationCity().sendKeys(CitiesFromDatabase.getDestinationCity());
		homeObjects.clickOnPassengers();
		homeObjects.clickOnAdultIncrease();
		homeObjects.clickOnAdultIncrease();
		homeObjects.clickOnChildIncrease();
		homeObjects.clickOnInfantIncrease();
		homeObjects.clickOnStudentCheckbox();
		homeObjects.clickOnFindFlights();
	}
}
