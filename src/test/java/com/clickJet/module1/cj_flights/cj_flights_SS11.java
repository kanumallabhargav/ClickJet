package com.clickJet.module1.cj_flights;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HomePageObjects;

import utilities.Base;

public class cj_flights_SS11 extends Base
{
WebDriver driver;
	
	@Test
	public void cj_flights_SS11_negativeAction() throws IOException, SQLException
	{
		driver = driverInitialize();
		
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.clickOnFindFlights();
	}
}
