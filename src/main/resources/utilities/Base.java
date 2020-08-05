package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base 
{
	WebDriver driver;
	Properties prop = new Properties();
	public WebDriver driverInitialize() throws IOException
	{
		//Use FileInputStream only on mac. For windows, parameterize through Jenkins build.
		//Note: DO NOT READ THE FILE FROM INPUTSTREAM ON WINDOWS
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config/browserConfig.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String operatingSystem = prop.getProperty("os");
		String url = prop.getProperty("baseUrl");
		if(operatingSystem.equalsIgnoreCase("macos"))
		{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("headlessChrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
			ChromeOptions chromeOptionsObject = new ChromeOptions();
			chromeOptionsObject.addArguments("headless");
			driver = new ChromeDriver(chromeOptionsObject);
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("headlessFirefox"))
		{
			System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/geckodriver");
			FirefoxOptions firefoxOptionsObject = new FirefoxOptions();
			firefoxOptionsObject.addArguments("headless");
			driver = new FirefoxDriver(firefoxOptionsObject);
		}
		}
		else if (browserName.equalsIgnoreCase("windows"))
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if(browserName.equalsIgnoreCase("headlessChrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver");
				ChromeOptions chromeOptionsObject = new ChromeOptions();
				chromeOptionsObject.addArguments("headless");
				driver = new ChromeDriver(chromeOptionsObject);
			}
			if(browserName.equalsIgnoreCase("firefox"))
			{
				System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\geckodriver");
				driver = new FirefoxDriver();
			}
			if(browserName.equalsIgnoreCase("headlessFirefox"))
			{
				System.getProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\geckodriver");
				FirefoxOptions firefoxOptionsObject = new FirefoxOptions();
				firefoxOptionsObject.addArguments("headless");
				driver = new FirefoxDriver(firefoxOptionsObject);
			}
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
