package Database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import peloPicoData.db.pojos.*;

public class SQL_Update {

	Connection c;
	int id_danger=0;
	int id_government=0;
	int id_animshelt=0;
	int id_endsp=0;
	int id_habitat=0;
	int id_popu=0;
	int id_loc=0;
	//No hacen falta modificar a medida hacemos
	public SQL_Update(Connection c) {
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
	
	private void printDangers() throws SQLException{
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM danger";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String nature_danger = rs.getString("nature_danger");
			String magnitude = rs.getString("magnitude");
			Danger danger = new Danger(id, name, nature_danger, magnitude);
			System.out.println(danger);
		}
		rs.close();
		stmt.close();
	}
	
	public void callUpdate(){
		try {
		
			System.out.println("Choose in which table you want to update data:"
					+ "\n1.Animal Shelter \n2.Endangered Species \n3.Population "
					+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(reader.readLine());
			
			switch(option){
			case 1: updateAnimalShelter();
					break;
			case 2: updateEndangered_Species();
					break;
			case 3: updatePopulation();
					break;
			case 4: updateGovernment();
					break;
			case 5: updateDanger();
					break;
			case 6: updateHabitat();
					break;
			case 7: updateLocation();
					break;
			}

				} catch (Exception e) {
						e.printStackTrace();
					}

		
		
	}
	public void updateAnimalShelter(){
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
			
		/*	String sql = "UPDATE animal_shelter SET address=? WHERE id=?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, newLocation);
			prep.setInt(2, dep_id);
			prep.executeUpdate();
			System.out.println("Update finished.");
			// Change a department's location: end*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateDanger(){
		try {

			id_danger ++;
			
			// Get the dangers info from the command prompt
			System.out.println("Please, choose the Dangers you want to modify:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			printDangers();
			System.out.println("Type it ID:");
			int danger_id = Integer.parseInt(reader.readLine());
			System.out.println("What you want to modify: \n1.Name \n2.Nature of danger \n3.Magnitude"
					+ "\nOption::");
			int option = Integer.parseInt(reader.readLine());
			
			PreparedStatement prep;
			String sql;
			
			switch(option){
			case 1:
				System.out.print("Write the new name: ");
				String name = reader.readLine();
				sql = "UPDATE danger SET name=? WHERE id=?";
				prep = c.prepareStatement(sql);
				prep.setString(1, name);
				prep.setInt(2, danger_id);
				prep.executeUpdate();
				System.out.println("Update finished.");
				// Change a danger name: end
				break;
			case 2:
				System.out.print("Write the new Nature of Danger: ");
				String nature_danger = reader.readLine();
				sql = "UPDATE danger SET nature_danger=? WHERE id=?";
				prep = c.prepareStatement(sql);
				prep.setString(1, nature_danger);
				prep.setInt(2, danger_id);
				prep.executeUpdate();
				System.out.println("Update finished.");
				// Change a danger nature of danger: end
				break;
			case 3:
				System.out.print("Write the new Magnitude: ");
				String magnitude = reader.readLine();
				sql = "UPDATE danger SET magnitude=? WHERE id=?";
				prep = c.prepareStatement(sql);
				prep.setString(1, magnitude);
				prep.setInt(2, danger_id);
				prep.executeUpdate();
				System.out.println("Update finished.");
				// Change a danger magnitude: end
				break;
			}
			

			//Danger dang = new Danger(id_danger,name, nature_danger,magnitude);

			
			} catch (Exception e) {
				e.printStackTrace();
				}

					
	}
	public void updateEndangered_Species(){
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

			/*String sql = "UPDATE departments SET address=? WHERE id=?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, newLocation);
			prep.setInt(2, dep_id);
			prep.executeUpdate();
			System.out.println("Update finished.");
			// Change a department's location: end*/

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateGovernment(){
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

			/*String sql = "UPDATE departments SET address=? WHERE id=?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, newLocation);
			prep.setInt(2, dep_id);
			prep.executeUpdate();
			System.out.println("Update finished.");
			// Change a department's location: end*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateHabitat(){
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

			/*String sql = "UPDATE departments SET address=? WHERE id=?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, newLocation);
			prep.setInt(2, dep_id);
			prep.executeUpdate();
			System.out.println("Update finished.");
			// Change a department's location: end*/

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateLocation(){
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

			/*String sql = "UPDATE departments SET address=? WHERE id=?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, newLocation);
			prep.setInt(2, dep_id);
			prep.executeUpdate();
			System.out.println("Update finished.");
			// Change a department's location: end*/

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updatePopulation(){
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

			/*String sql = "UPDATE departments SET address=? WHERE id=?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, newLocation);
			prep.setInt(2, dep_id);
			prep.executeUpdate();
			System.out.println("Update finished.");
			// Change a department's location: end*/

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
