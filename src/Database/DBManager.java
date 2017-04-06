package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	
	
	private Connection c;

	public DBManager(Connection c1){
		
		Connection c = c1;

	}
	
	public void connect(String args[]){
	try {
		// Open database connection
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:./db/PeloPicoData.db");
		c.createStatement().execute("PRAGMA foreign_keys=ON");
		System.out.println("Database connection opened.");
			

	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public void disconnect(String args[]){
	try {
	
		// Close database connection			
		c.close();
		System.out.println("Database connection closed.");

	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
     
   public void createCall(){
   
	   SQL_Create table = new SQL_Create(); 
	   
   }
   
   public void deleteCall(){
	   
	   SQL_Create deleteobj = new SQL_Create(); 
	   
   }
   
   
   public void insertCcall(){
	   
	   SQL_Create insertobj = new SQL_Create(); 
	   
   }
   
   
   
   }


