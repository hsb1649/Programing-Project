package GUI;

import java.sql.SQLException;

import database.DB;

public class Main
{
	public static void main(String[] args) throws SQLException
	{
		new Menu1();
		DB.Access();
	}
}
