package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB
{

	static Statement stat;
	static ResultSet rs;

	public static void Access() 
	{
		String driverName = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/project";
		String id = "root";
		String password = "park123";
		// TODO Auto-generated method stub
		try
		{
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, id, password);
			stat = con.createStatement();
			stat.executeQuery("use project");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static void register(String id, String pw)throws SQLException
	{
		String[] ids = null;
		int i = 0;
		rs = stat.executeQuery("select id from customer");
		while (rs.next())
		{
			System.out.println(rs.getString("id"));
		}
	}
}
