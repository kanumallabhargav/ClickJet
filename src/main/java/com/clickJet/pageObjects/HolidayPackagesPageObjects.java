package com.clickJet.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HolidayPackagesPageObjects 
{
	WebDriver driver;
	
	//WebElements
	private By destinationBox = By.id("ctl00_mainContent_HolidayPackages_DropDownListPackage_CTXT");
	private By departureBox = By.id("ctl00_mainContent_HolidayPackages_DropDownListFrom_CTXT");
	private By returnBox = By.id("ctl00_mainContent_HolidayPackages_DropDownListTo_CTXT");
	private By dateBox = By.xpath("//*[@id=\"divHolidaypackages\"]/div/div/table/tbody/tr/td[4]/div/button");
	private By dateElement = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[6]/td[2]/a");
	private By searchHolidayPackages = By.id("btnFindHolidays");

	//Constructor
	public HolidayPackagesPageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//Methods to access WebElements
	public WebElement getDestinationBox()
	{
		return driver.findElement(destinationBox);
	}
	public WebElement getDepartureBox()
	{
		return driver.findElement(departureBox);
	}
	public WebElement getReturnBox()
	{
		return driver.findElement(returnBox);
	}
	public void selectDate()
	{
		driver.findElement(dateBox).click();
		driver.findElement(dateElement).click();
	}
	public void clickOnSearch()
	{
		driver.findElement(searchHolidayPackages).click();
	}
}
