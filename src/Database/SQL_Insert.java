package Database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import peloPicoData.db.pojos.*;

public class SQL_Insert {

	Connection c;
	int id_danger=0;
	int id_government=0;
	int id_animshelt=0;
	int id_endsp=0;
	int id_habitat=0;
	int id_popu=0;
	int id_loc=0;
	Print print = new Print();
	public SQL_Insert(Connection c) {
		super();
		this.c = c;
	}

	private void printGovernment() throws SQLException {
	
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM government";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String type = rs.getString("type");
			String ideology = rs.getString("ideology");
			Government government = new Government(id, type, ideology);
			System.out.println(government);
		}
		rs.close();
		stmt.close();
	}
	
	private void printPopulation() throws SQLException {
		
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM population";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt("id");
			int number = rs.getInt("number");
			String gender = rs.getString("gender");
			int age = rs.getInt("age");
			Population population = new Population(id, number, gender,age);
			System.out.println(population);
		}
		rs.close();
		stmt.close();
	}
	
	private void printEndangeredSpecies() throws SQLException {
		
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM endangered_species";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String taxonomy = rs.getString("taxonomy");
			String diet = rs.getString("diet");
		    String reproduction = rs.getString("reproduction");
			Endangered_Species endangered_species = new Endangered_Species(id, name, taxonomy,diet,reproduction);
			System.out.println(endangered_species);
		}
		rs.close();
		stmt.close();
	}
	
	public void callInsert(){
		try {
		
			print.printOpcion(1);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(reader.readLine());
			
			switch(option){
			case 1: insertAnimalShelter();
					break;
			case 2: insertEndangered_Species();
					break;
			case 3: insertPopulation();
					break;
			case 4: insertGovernment();
					break;
			case 5: insertDanger();
					break;
			case 6: insertHabitat();
					break;
			case 7: insertLocation();
					break;
			}

				} catch (Exception e) {
						e.printStackTrace();
					}

		
		
	}
	public void insertAnimalShelter(){
		try {
			
			id_animshelt ++;
			
			// Get the animal shelter info from the command prompt
			System.out.println("Please, input the Animal Shelter information:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Name: ");
			String name = reader.readLine();
			System.out.print("Resources: ");
			String resources = reader.readLine();
			System.out.print("Capital: ");
			float capital = Float.parseFloat(reader.readLine());
			System.out.print("Choose its government, type its ID: ");
			printGovernment();
			int gover_id = Integer.parseInt(reader.readLine());
			
			Animal_Shelter animshel = new Animal_Shelter(id_animshelt, name, resources,capital);
		//	Animal_Shelter animal_shelter = new Animal_Shelter(resources,capital,gover_id);
			
			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO animal_shelter (name,resources, capital, gover_id) "
					+ "VALUES ('" + name + "' , '" + resources + "', '" + capital	+  "', '" + gover_id +"')";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Animal Shelter information has been processed");
			System.out.println("Records inserted.");
			// Insert new record: end
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertDanger(){
		try {

			id_danger ++;
			// Get the dangers info from the command prompt
			System.out.println("Please, input the Dangers information:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Name: ");
			String name = reader.readLine();
			System.out.print("Nature of Danger: ");
			String nature_danger = reader.readLine();
			System.out.print("Magnitude: ");
			String magnitude = reader.readLine();

			Danger dang = new Danger(id_danger,name, nature_danger,magnitude);

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO danger (name, nature_danger, magnitude) "
					+ "VALUES ('" + name + "','" + nature_danger + "', '" + magnitude	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Dangers info processed");
			// Insert new record: end	
			} catch (Exception e) {
				e.printStackTrace();
				}

					
	}
	public void insertEndangered_Species(){
		try {
			
			id_endsp ++;
			
			// Get the endangered species info from the command prompt
			System.out.println("Please, input the endangered species information:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("name: ");
			String name = reader.readLine();
			System.out.print("taxonomy: ");
			String taxonomy = reader.readLine();
			System.out.print("diet: ");
			String diet = reader.readLine();
			System.out.print("reproduction: ");
			String reproduction = reader.readLine();

			Endangered_Species endspecie = new Endangered_Species(id_endsp,name,taxonomy,diet,reproduction);

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO endangered_species (name, taxonomy, diet, reproduction) "
					+ "VALUES ('" + name + "', '" + taxonomy	+ "', '" + diet	+ "', '" + reproduction	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Endangered Species info processed");
			// Insert new record: end

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertGovernment(){
		try {
			
			id_government ++;
			
			// Get the government info from the command prompt
			System.out.println("Please, input the government info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("type: ");
			String type = reader.readLine();
			System.out.print("ideology: ");
			String ideology = reader.readLine();

			Government govern = new Government(id_government,type,ideology);

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO government (type, ideology) "
					+ "VALUES ('" + type + "', '" + ideology	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Government info processed");
			// Insert new record: end
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertHabitat(){
		try {
			
			id_habitat ++;
			
			// Get the habitat info from the command prompt
			System.out.println("Please, input the habitat info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("name: ");
			String name = reader.readLine();
			System.out.print("medium: ");
			String medium = reader.readLine();

			Habitat habit = new Habitat(id_habitat,name,medium);

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO habitat (name, medium) "
					+ "VALUES ('" + name + "', '" + medium	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Habitat info processed");
			// Insert new record: end

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertLocation(){
		try {
			
			id_loc ++;
			
			// Get the location info from the command prompt
			System.out.println("Please, input the location info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("size: ");
			float size = Float.parseFloat(reader.readLine());
			System.out.print("name: ");
			String name = reader.readLine();

			Location locat = new Location(id_loc, size, name);

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO location (size, name) "
					+ "VALUES ('" + size + "', '" + name	+ "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Location info processed");
			// Insert new record: end

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertPopulation(){
		try {
			
			id_popu ++;
			
			// Get the population info from the command prompt
			System.out.println("Please, input the population info:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("number: ");
			int number = Integer.parseInt(reader.readLine());
			System.out.print("gender: ");
			String gender = reader.readLine();
			System.out.print("age: ");
			int age = Integer.parseInt(reader.readLine());
			System.out.print("Choose the location of the population, ID: ");
			printPopulation();
			int population_id = Integer.parseInt(reader.readLine());
			System.out.print("Choose the endangered specie, ID: ");
			printEndangeredSpecies();
			int endangered_id = Integer.parseInt(reader.readLine());

			Population pop = new Population(id_popu,number, gender, age);

			// Insert new record: begin
			Statement stmt = c.createStatement();
			String sql = "INSERT INTO departments (number, gender, age, population_id, endangered_id) "
					+ "VALUES ('" + number + "', '" + gender	+ "', '" + age	+ "', '"
					+ population_id + "' , '" + endangered_id + "');";
			stmt.executeUpdate(sql);
			stmt.close();
			System.out.println("Population info processed");
			// Insert new record: end

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
