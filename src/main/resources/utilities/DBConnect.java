package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.sql.Connection;

public class DBConnect 
{
	public ArrayList<String> DBConn(String departure, String destination) throws IOException, SQLException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config/databaseConfig.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		//Get required properties from file
		String databaseName = prop.getProperty("databaseName");
		String SQL_Query = prop.getProperty("SQL_Query");
		String hostName = prop.getProperty("hostName");
		String portNumber = (String) prop.get("portNumber");
		String DB_ID = prop.getProperty("DB_ID");
		String DB_password = prop.getProperty("DB_password");
		String serverType = prop.getProperty("serverType");
		
		//Connect to the database
		Connection con = DriverManager.getConnection(serverType+hostName+":"+portNumber+"/"+databaseName, DB_ID, DB_password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQL_Query);
		
		//Retrieve the values
		rs.next();
		departure = rs.getString(0);
		destination = rs.getString(1);
		
		//Pushing the values to an arrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add(departure);
		list.add(destination);
		
		//Return the arrayList
		return list;
	}
}
