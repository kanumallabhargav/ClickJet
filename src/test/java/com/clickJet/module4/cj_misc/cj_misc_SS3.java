package com.clickJet.module4.cj_misc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HomePageObjects;

import utilities.Base;

public class cj_misc_SS3 extends Base
{
WebDriver driver;
	
	@Test
	public void cj_misc_SS3_positiveAction() throws IOException
	{
		driver = driverInitialize();
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.clickOnManageBooking();
	}
}