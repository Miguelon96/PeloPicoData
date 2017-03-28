package Database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLInsert {

	
	public static void insertAnimalShelter(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Resources: ");
			String resources = reader.readLine();
			System.out.print("Capital: ");
			float capital = Float.parseFloat(reader.readLine());

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (resources, capital) "
					+ "VALUES ('" + resources + "', '" + capital	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void insertDanger(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Nature of Danger: ");
			String nature_danger = reader.readLine();
			System.out.print("Magnitude: ");
			String magnitude = reader.readLine();

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (Nature of Danger, magnitude) "
					+ "VALUES ('" + nature_danger + "', '" + magnitude	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void Endangered_Species(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("name: ");
			String name = reader.readLine();
			System.out.print("taxonomy: ");
			String taxonomy = reader.readLine();
			System.out.print("diet: ");
			String diet = reader.readLine();
			System.out.print("reproduction: ");
			String reproduction = reader.readLine();

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (name, taxonomy, diet, reproduction) "
					+ "VALUES ('" + name + "', '" + taxonomy	+ "', '" + diet	+ "', '" + reproduction	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void insertGovernment(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("type: ");
			String type = reader.readLine();
			System.out.print("ideology: ");
			String ideology = reader.readLine();

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (type, ideology) "
					+ "VALUES ('" + type + "', '" + ideology	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void insertHabitat(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("name: ");
			String name = reader.readLine();
			System.out.print("medium: ");
			String medium = reader.readLine();

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (name, medium) "
					+ "VALUES ('" + name + "', '" + medium	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void insertLocation(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("name: ");
			float size = Float.parseFloat(reader.readLine());
			System.out.print("name: ");
			String name = reader.readLine();

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (size, name) "
					+ "VALUES ('" + size + "', '" + name	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void insertPopulation(){
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");

			// Get the employee info from the command prompt
			System.out.println("Please, input the department info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("number: ");
			int number = Integer.parseInt(reader.readLine());
			System.out.print("gender: ");
			String gender = reader.readLine();
			System.out.print("age: ");
			int age = Integer.parseInt(reader.readLine());

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (number, gender, age) "
					+ "VALUES ('" + number + "', '" + gender	+ "', '" + age	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Department info processed");
			System.out.println("Records inserted.");
			// Insert new record: end

			// Close database connection
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
