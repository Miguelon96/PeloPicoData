package UserInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import peloPicoData.*;
import Database.*;


public class Main {

	
	public static void main(String args[]) {

		try {
			String decision;
			int option;
			int cont = 1;
			Connection c = null;
			
			DBManager manager = new DBManager();
			System.out.println("Welcome to PeloPicoData, would you like to create the tables of the database? y/n");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			decision= bf.readLine();
			if(decision.equalsIgnoreCase("y")){
				c = manager.connect();
				manager.dropAllCall(c);
				manager.createCall(c);
			}
			while(cont == 1){
			System.out.println("\nNow, what you want to do?");
			System.out.println("\n1.Insert \n2.Select \n3.Delete \n4.Drop \n5.Search \n6.Update"
					+ "\n7.Close Database \nOption:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			option = Integer.parseInt(reader.readLine());
			
			switch(option){
			case 1: manager.insert(c);
					break;
			case 2: manager.select(c);
	  				break;
			case 3: manager.delete(c);
			case 4: manager.dropCall(c);
					break;
			case 5: manager.search(c);
		   			break;
			case 6: manager.update(c);
					break;
			case 7: cont = 0;
		   			break;
			}
			}
			//We disconnect the Database
			manager.disconnect();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
}

}
