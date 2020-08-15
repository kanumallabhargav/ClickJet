package testData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getCountry 
{
	public static String enterCountryName() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config/dataProviderConfig");
		prop.load(fis);
		String country = prop.getProperty("country");
		return country;
	}
}
