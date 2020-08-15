package com.clickJet.module4.cj_misc;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.clickJet.pageObjects.HomePageObjects;

import testData.getCountry;
import utilities.Base;

public class cj_misc_SS5 extends Base
{
WebDriver driver;
	
	@Test
	public void cj_misc_SS5_positiveAction() throws IOException
	{
		driver = driverInitialize();
		HomePageObjects homeObjects = new HomePageObjects(driver);
		homeObjects.getCountryBox().sendKeys(getCountry.enterCountryName());
		homeObjects.getCountryBox().sendKeys(Keys.ARROW_DOWN);
		homeObjects.getCountryBox().sendKeys(Keys.ARROW_DOWN);
		homeObjects.getCountryBox().sendKeys(Keys.ENTER);
	}
}
