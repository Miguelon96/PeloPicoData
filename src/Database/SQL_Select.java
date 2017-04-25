package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import peloPicoData.db.pojos.*;

public class SQL_Select {
	
	private Connection c;
	Print print = new Print();
		
	public SQL_Select(Connection c) {
		super();
		this.c = c;
	}


	public void selectDanger() {
		try {
			
			// Retrieve data: begin
			Statement stmt = c.createStatement();
			String sql = "SELECT * FROM Danger";
			ResultSet rs = stmt.executeQuery(sql);//Set of results
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String nature_danger = rs.getString("nature danger");
				String magnitude = rs.getString("magnitude");
				Danger danger = new Danger(id,name,nature_danger, magnitude);
				print.printDanger(danger);
			}
			rs.close();
			stmt.close();
			// Retrieve data: end
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}