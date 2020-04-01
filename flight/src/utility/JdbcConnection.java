package utility;
import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcConnection {
	private static final String DBURL="jdbc://mysql://localhost:3306/student";
	private static final String USERNAME="root";
	private static final String PASSWORD="Welcome123";
	public static Connection getConnection()
	{
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
			System.out.println("connected");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return connection;
	}
	public static String closeConnection(Connection connection)
	{
		String res = null;
		try
		{
			connection.close();
		}catch(Exception e)
		{
			res=e.getMessage();
		}
		return res;
	}

}
