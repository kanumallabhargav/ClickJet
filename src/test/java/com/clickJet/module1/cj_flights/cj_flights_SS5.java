package com.clickJet.module1.cj_flights;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HomePageObjects;

import testData.CitiesFromDatabase;
import utilities.Base;

public class cj_flights_SS5 extends Base
{
WebDriver driver;
	
	@Test
	public void cj_flights_SS5_positiveAction() throws IOException, SQLException
	{
		driver = driverInitialize();
		
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.clickOnMultiCity();
		homeObjects.multiCityAlertAccept();
		homeObjects.getDepartureCity().sendKeys(CitiesFromDatabase.getDepartureCity());
		homeObjects.getDestinationCity().sendKeys(CitiesFromDatabase.getDestinationCity());
		homeObjects.getMulticitySecondDeparture().sendKeys(CitiesFromDatabase.getDepartureCity());
		homeObjects.getMulticitySecondDestination().sendKeys(CitiesFromDatabase.getDestinationCity());
		homeObjects.getMulticityThirdDeparture().sendKeys(CitiesFromDatabase.getDepartureCity());
		homeObjects.getMulticityThirdDestination().sendKeys(CitiesFromDatabase.getDestinationCity());
		homeObjects.clickOnMultiCityAddMoreButton();
		homeObjects.clickOnMultiCityRemoveButton();
		homeObjects.clickOnPassengers();
		homeObjects.clickOnAdultIncrease();
		homeObjects.clickOnChildIncrease();
		homeObjects.clickOnFindFlights();
	}
}
