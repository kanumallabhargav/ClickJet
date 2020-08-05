package com.clickJet.auto.testRuns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/workspace/clickJet/src/main/resources/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//*[@id=\"traveller-home\"]/div[1]/div/div[2]/a[1]/span[1]")).click();
	}

}
