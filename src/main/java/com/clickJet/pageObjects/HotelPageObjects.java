package com.clickJet.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotelPageObjects 
{
	WebDriver driver;

	//pageObjects
	private By destinationCity = By.id("ctl00_mainContent_txtOriginStation1_MST");
	private By toDateBox = By.xpath("//*[@id=\"ReturnDate_MST\"]/button");
	private By dateElement = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]/a");
	private By adultBox = By.id("ddl_Adult_MST");
	private By childBox = By.id("ddl_Adult_MST");
	private By infantBox = By.id("ddl_Infant_MST");
	private By searchHotels = By.id("ctl00_mainContent_ButtonSubmit_MST");
	
	//Constructor
	public HotelPageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//Methods to access the webElements
	public WebElement getDestinationCityBox()
	{
		return driver.findElement(destinationCity);
	}
	public void selectDate()
	{
		driver.findElement(toDateBox).click();
		driver.findElement(dateElement).click();
	}
	public void selectAdults()
	{
		Select selectObject = new Select(driver.findElement(adultBox));
		selectObject.selectByVisibleText("3");
	}
	public void selectChildren()
	{
		Select selectObject = new Select(driver.findElement(childBox));
		selectObject.selectByVisibleText("2");
	}
	public void selectInfants()
	{
		Select selectObject = new Select(driver.findElement(infantBox));
		selectObject.selectByVisibleText("1");
	}
	
	//Search
	public void clickOnSearch()
	{
		driver.findElement(searchHotels).click();
	}
}
