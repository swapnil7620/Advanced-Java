


import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;

public class MySQLConnectionITP {
	static Connection con;
	
	/*
	private MySQLConnectionITP() {}
	public static Connection getConnection() throws Exception
	{	
		String driverName="com.mysql.jdbc.Driver";
		String dbUrl="jdbc:mysql://localhost:3306/itpmarch2025db";
		String dbUserName="root";
		String dbPassword="Nice@7620";
		
		Class.forName(driverName); 		
		con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
	}
	*/
	
	// Enhancement 
	private MySQLConnectionITP() {}
	public static Connection getConnection(ServletContext context) throws Exception
	{	
		String driverName=context.getInitParameter("driverName");
		String dbUrl=context.getInitParameter("dbUrl");
		String dbUserName=context.getInitParameter("dbUserName");
		String dbPassword=context.getInitParameter("dbPassword");
		
		Class.forName(driverName); 		
		con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
}
}