package com.clickJet.auto.testRuns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/workspace/clickJet/src/main/resources/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
