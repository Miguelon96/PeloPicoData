package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import peloPicoData.db.pojos.*;

public class SQL_Select {
	public static void selectDanger(String args[]) {
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");
			
			// Retrieve data: begin
			Statement stmt = c.createStatement();
			String sql = "SELECT * FROM Danger";
			ResultSet rs = stmt.executeQuery(sql);//Set of results
			while (rs.next()) {//Return TRUE if there are more elements, so, while TRUE it moves to the next element
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				Department department = new Department(id, name, address);
				System.out.println(department);
			}
			rs.close();
			stmt.close();
			System.out.println("Search finished.");
			// Retrieve data: end
			
			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
