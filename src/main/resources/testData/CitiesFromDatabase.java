package testData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import utilities.DBConnect;

public class CitiesFromDatabase 
{
	public static final String departure=null;
	public static final String destination=null;
	static DBConnect database = new DBConnect();
	
	//Get departure city
	public static String getDepartureCity() throws IOException, SQLException
	{
		ArrayList<String> cities = database.DBConn(departure, destination);
		String departureCity = cities.get(0);
		return departureCity;
	}
	
	//Get destination city
	public static String getDestinationCity() throws IOException, SQLException
	{
		ArrayList<String> cities = database.DBConn(departure, destination);
		String departureCity = cities.get(1);
		return departureCity;
	}
}
