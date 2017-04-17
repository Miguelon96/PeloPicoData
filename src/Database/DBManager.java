package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	
    private Connection c;
	
	
	public Connection connect(){
	try {
		// Open database connection
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:./PeloPicoData.db");
		c.createStatement().execute("PRAGMA foreign_keys=ON");
		System.out.println("Database connection opened.");
			

	} catch (Exception e) {
		e.printStackTrace();
	}
	return c;
}

public void disconnect(){
	try {
	
		// Close database connection			
		c.close();
		System.out.println("Database connection closed.");

	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
     
   public void createCall(Connection c){
   
	   SQL_Create table = new SQL_Create(c); 
	   table.callCreate();
   }
   
   public void dropCall(Connection c){
	   
	   SQL_Drop droping = new SQL_Drop(c); 
	   droping.dropTables();
   }
   
   public void dropAllCall(Connection c){
	   
	   SQL_Drop droping = new SQL_Drop(c); 
	   droping.dropAllTables();
   }
   
   public void insert(Connection c){
	   
	    SQL_Insert insert = new SQL_Insert(c);
		insert.callInsert();
   }
   
   public void delete(Connection c){
	   
	    SQL_Delete delete = new SQL_Delete(c);
		delete.callDelete();
  }
     
   
   public void select(Connection c){
	   
	    SQL_Select select = new SQL_Select(c);
		System.out.println("Introduce danger:\n");
		select.selectDanger();
 }
   
   public void search(Connection c){
	   
	    SQL_Search search = new SQL_Search(c);
		search.search();
 }
   
   public void update(Connection c){
	   SQL_Update update = new SQL_Update(c);
	   update.callUpdate();
   }
   
   }



