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

	public static void Access() throws SQLException
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
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		logIn("swp1234", "park12");
	}

	// ID 중복 체크
	public static boolean idCheck(String id) throws SQLException
	{
		rs = stat.executeQuery("select id from customer where id = '" + id
				+ "'");
		// 중복이라면 true
		while (rs.next())
		{
			if (rs.getString("id") != null)
			{
				return true;
			}
		}
		// 중복이 아니라면 false
		return false;
	}

	// 회원 가입
	public static void register(String id, String pw, char sex)
			throws SQLException
	{
		stat.executeQuery("insert into customer values('" + id + "','" + pw
				+ "','" + sex + "')");
	}

	public static int logIn(String id, String pw) throws SQLException
	{
		rs = stat.executeQuery("select id from customer where id = '" + id
				+ "'");
		while (rs.next())
		{
			rs = stat.executeQuery("select password from customer where id = '"
					+ id + "'");
			while (rs.next())
			{
				if (rs.getString("password").equals(pw))
				{
					System.out.println("로그인 성공");
					// 로그인 성공이라면 1반환
					return 1;
				}
			}
			// password가 다르면 0 반환
			System.out.println("비밀번호가 다릅니다");
			return 0;
		}
		// 아이디가 존재하지않는다면 -1 반환
		System.out.println("아이디가 존재하지 않습니다");
		return -1;
	}
}
