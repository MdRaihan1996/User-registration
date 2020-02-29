package test;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con;
	private DBConnection() {}
    
	static {
	    try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
			 System.out.println("In static block of DBConnection. connection= "+con);		
	}catch(Exception e) {e.printStackTrace();}
	
	}		
	
	public static Connection getCon() {
		
	  System.out.println("In getCon()");	
		
		return con;
	}
	
}
