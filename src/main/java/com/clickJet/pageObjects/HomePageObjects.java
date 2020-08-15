package com.clickJet.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects
{
	WebDriver driver;
	
	//All PageObjects
	//Trip type
	private By oneWay = By.id("ctl00_mainContent_rbtnl_Trip_0");
	private By roundTrip = By.id("ctl00_mainContent_rbtnl_Trip_1");
	private By multiCity = By.id("ctl00_mainContent_rbtnl_Trip_2");
	
	//PageObjects for main elements
	private By departureCity = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	private By destinationCity = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	private By departDate = By.id("ctl00_mainContent_view_date1");
	private By returnDate = By.id("ctl00_mainContent_view_date2");
	
	//Passengers
	private By passengers = By.id("divpaxinfo");
	private By adultIncrease = By.id("hrefIncAdt");
	private By adultDecrease = By.id("hrefDecAdt");
	private By childIncrease = By.id("hrefIncChd");
	private By childDecrease = By.id("hrefDecChd");
	private By infantIncrease = By.id("hrefIncInf");
	private By infantDecrease = By.id("hrefDecInf");
	
	//Others
	private By currency = By.id("ctl00_mainContent_DropDownListCurrency");
	
	//Checkboxes
	private By familyAndFriendsCheckbox = By.id("ctl00_mainContent_chk_friendsandfamily");
	private By seniorCitizenCheckbox = By.id("ctl00_mainContent_chk_SeniorCitizenDiscount");
	private By indianArmedForcesCheckbox = By.id("ctl00_mainContent_chk_IndArm");
	private By studentCheckbox = By.id("ctl00_mainContent_chk_StudentDiscount");
	private By unaccompaniedMinorCheckbox = By.id("ctl00_mainContent_chk_Unmr");
	
	//Other links
	private By specialAssistance = By.linkText("Special Assistance");
	
	//MultiCity elements
	private By multiCityAlert = By.id("MultiCityModelAlert");
	private By multiCitySecondDeparture = By.id("ctl00_mainContent_ddl_originStation2_CTXT");
	private By multiCitySecondDestination = By.id("ctl00_mainContent_ddl_destinationStation2_CTXT");
	private By multiCityThirdDeparture = By.id("ctl00_mainContent_ddl_originStation3_CTXT");
	private By multiCityThirdDestination = By.id("ctl00_mainContent_ddl_destinationStation3_CTXT");
	private By multicityFirstDepartDate = By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button");
	private By multicitySecondDepartDate = By.xpath("//*[@id=\"Div2\"]/button");
	private By multiCityThirdDepartDate = By.xpath("//*[@id=\"Div3\"]/button");
	private By multiCityAddMoreButton = By.id("btnAddMore1");
	private By multicityRemoveButton = By.id("btnRemove2");

	//Search/Submit
	private By submit = By.id("ctl00_mainContent_btn_FindFlights");
	
	//Links to other modules
	private By hotels = By.linkText("Hotels");
	private By holidayPackages = By.linkText("Holiday Packages");
	
	//Locators for cj_misc module
	private By flightStatus = By.linkText("Flight Status");
	private By checkIn = By.linkText("Check-In");
	private By manageBooking = By.linkText("Manage Booking");
	private By countrySelect = By.id("autosuggest");
	private By familyFun = By.xpath("//*[@id=\"traveller-home\"]/div[1]/div/div[2]/a[1]/span[1]");
	private By bookCab = By.xpath("//*[@id=\"traveller-home\"]/div[2]/div/div[2]/a[1]/span[1]");
	private By rewards = By.xpath("//*[@id=\"traveller-home\"]/div[3]/div/div[2]/a[1]/span[1]");
	private By taxDocs = By.xpath("//*[@id=\"GST\"]/span[1]");
	private By passportRules = By.xpath("//*[@id=\"traveller-home\"]/div[5]/div/div[2]/a[1]/span[1]");
	private By corporateTraveller =By.xpath("//*[@id=\"traveller-home\"]/div[6]/div/div[2]/a[1]/span[1]");
	private By changeFlightRefund = By.xpath("//*[@id=\"traveller-home\"]/div[7]/div/div[2]/a[1]/span[1]");
	private By offerLink = By.xpath("//*[@id=\"header\"]/div[1]/div[2]/a");
	
	//OfferLinkVerificationElement
	private By offerVerifyElement = By.xpath("//*[@id=\"carousel-example-generic\"]/div/div/div/div/div/a");
	
	//constructor to pass WebDriver object
	public HomePageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//Trip type
	public void clickOnOneWay()
	{
		driver.findElement(oneWay).click();
	}
	public void clickOnRoundTrip()
	{
		driver.findElement(roundTrip).click();
	}
	public void clickOnMultiCity()
	{
		driver.findElement(multiCity).click();
	}
	
	//Methods for main elements
	public WebElement getDepartureCity()
	{
		return driver.findElement(departureCity);
	}
	public WebElement getDestinationCity()
	{
		return driver.findElement(destinationCity);
	}
	public void clickOnDepartDate()
	{
		driver.findElement(departDate).click();
	}
	public void clickOnReturnDate()
	{
		driver.findElement(returnDate).click();
	}
	
	//Passengers
	public void clickOnPassengers()
	{
		driver.findElement(passengers).click();
	}
	public void clickOnAdultIncrease()
	{
		driver.findElement(adultIncrease).click();
	}
	public void clickOnAdultDecrease()
	{
		driver.findElement(adultDecrease).click();
	}
	public void clickOnChildIncrease()
	{
		driver.findElement(childIncrease).click();
	}
	public void clickOnChildDecrease()
	{
		driver.findElement(childDecrease).click();
	}
	public void clickOnInfantIncrease()
	{
		driver.findElement(infantIncrease).click();
	}
	public void clickOnInfantDecrease()
	{
		driver.findElement(infantDecrease).click();
	}
	
	//Others
	public void clickOnCurrency()
	{
		driver.findElement(currency);
	}
	
	//CheckBoxes
	public void clickOnFamilyAndFriendsCheckbox()
	{
		driver.findElement(familyAndFriendsCheckbox).click();
	}
	public void clickOnSeniorCitizenCheckbox()
	{
		driver.findElement(seniorCitizenCheckbox).click();
	}
	public void clickOnIndianArmedForcesCheckbox()
	{
		driver.findElement(indianArmedForcesCheckbox).click();
	}
	public void clickOnStudentCheckbox()
	{
		driver.findElement(studentCheckbox).click();
	}
	public void clickOnUnaccompaniedMinorCheckbox()
	{
		driver.findElement(unaccompaniedMinorCheckbox).click();
	}
	
	//Click on special assistance link
	public void clickOnSpecialAssistance()
	{
		driver.findElement(specialAssistance).click();
	}
	
	//MultiCity methods
	public void multiCityAlertAccept()
	{
		driver.findElement(multiCityAlert).click();
	}
	public WebElement getMulticitySecondDeparture()
	{
		return driver.findElement(multiCitySecondDeparture);
	}
	public WebElement getMulticitySecondDestination()
	{
		return driver.findElement(multiCitySecondDestination);
	}
	public WebElement getMulticityThirdDeparture()
	{
		return driver.findElement(multiCityThirdDeparture);
	}
	public WebElement getMulticityThirdDestination()
	{
		return driver.findElement(multiCityThirdDestination);
	}
	public void clickOnMulticityFirstDepartDate()
	{
		driver.findElement(multicityFirstDepartDate).click();
	}
	public void clickOnMulticitySecondDepartDate()
	{
		driver.findElement(multicitySecondDepartDate).click();
	}
	public void clickOnMulticityThirdDepartDate()
	{
		driver.findElement(multiCityThirdDepartDate).click();
	}
	public void clickOnMultiCityAddMoreButton()
	{
		driver.findElement(multiCityAddMoreButton).click();
	}
	public void clickOnMultiCityRemoveButton()
	{
		driver.findElement(multicityRemoveButton).click();
	}
	
	//Find Flights
	public void clickOnFindFlights()
	{
		driver.findElement(submit).click();
	}
	
	//Links to other modules
	public void clickOnHotels()
	{
		driver.findElement(hotels).click();
	}
	public void clickOnHolidayPackages()
	{
		driver.findElement(holidayPackages).click();
	}
	
	//Elements for cj_misc module
	public void clickOnFlightStatus()
	{
		driver.findElement(flightStatus).click();
	}
	public void clickOnCheckIn()
	{
		driver.findElement(checkIn).click();
	}
	public void clickOnManageBooking()
	{
		driver.findElement(manageBooking).click();
	}
	public WebElement getCountryBox()
	{
		return driver.findElement(countrySelect);
	}
	public void clickOnFamilyFun()
	{
		driver.findElement(familyFun).click();
	}
	public void clickOnBookCab()
	{
		driver.findElement(bookCab).click();
	}
	public void clickOnRewards()
	{
		driver.findElement(rewards).click();
	}
	public void clickOnTaxDocs()
	{
		driver.findElement(taxDocs).click();
	}
	public void clickOnPassportRules()
	{
		driver.findElement(passportRules).click();
	}
	public void clickOnCorporateTraveller()
	{
		driver.findElement(corporateTraveller).click();
	}
	public void clickOnChangeFlightRefund()
	{
		driver.findElement(changeFlightRefund).click();
	}
	public void clickOnOfferLink()
	{
		driver.findElement(offerLink).click();
	}
	
	//VerificationForOfferLink
	public boolean verification()
	{
		boolean verify =  driver.findElement(offerVerifyElement).isDisplayed();
		return verify;
	}
}
