package Database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import peloPicoData.db.pojos.*;


public class SQL_Delete {

	// Put connection here so it can be used in several methods
		private Connection c;
		Print print = new Print();
		
		SQL_Delete(Connection c){
			super();
			this.c=c;
			
		}
		
		public void callDelete(){
			try {
			
				print.printOpcion(3);
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				int option = Integer.parseInt(reader.readLine());
				
				switch(option){
				case 1: deleteAnimalShelter();
						break;
				case 2: deleteEndangered_Species();
						break;
				case 3: deletePopulation();
						break;
				case 4: deleteGovernment();
						break;
				case 5: deleteDanger();
						break;
				case 6: deleteHabitat();
						break;
				case 7: deleteLocation();
						break;
						
				}

					} catch (Exception e) {
							e.printStackTrace();
						}
		}
		
	
		public void deleteAnimalShelter() {
			try {

				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the animal_shelter to delete, type its ID: ");

				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM animal_shelter";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String resources = rs.getString("resources");
					Float capital = rs.getFloat("capital");
					Animal_Shelter animalShelter = new Animal_Shelter(id, name, resources, capital);
					print.printAnimal_Shelter(animalShelter);
			    }
				rs.close();
				stmt.close();
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM animal_shelter WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				rs.close();
				stmt.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void deleteEndangered_Species() {
			try {

				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the endangered_species to delete, type its ID: ");
				
				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM endangered_species";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String taxonomy = rs.getString("taxonomy");
					String diet = rs.getString("diet");
				    String reproduction = rs.getString("reproduction");
					Endangered_Species endangeredSpecies = new Endangered_Species(id, name, taxonomy,diet,reproduction);
					print.printEndangeredSpecies(endangeredSpecies);
				}
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM endangered_species WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				rs.close();
				stmt.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void deletePopulation(){
			try{
				
				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the population to delete, type its ID: ");
				
				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM population";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					int number = rs.getInt("number");
					String gender = rs.getString("gender");
					int age = rs.getInt("age");
					Population population = new Population(id, number, gender,age);
					print.printPopulation(population);
				}
				
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM population WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				rs.close();
				stmt.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void deleteGovernment(){
			try{
				
				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the government to delete, type its ID: ");
				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM government";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String type = rs.getString("type");
					String ideology = rs.getString("ideology");
					Government government = new Government(id, type, ideology);
					print.printGovernment(government);
				}
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM government WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				rs.close();
				stmt.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		 
		public void deleteDanger() {
			try {

				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the danger to delete, type its ID: ");
				
				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM danger";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String nature_danger = rs.getString("nature_danger");
					String magnitude = rs.getString("magnitude");
					Danger danger = new Danger(id, name, nature_danger, magnitude);
					print.printDanger(danger);
				}
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM danger WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				rs.close();
				stmt.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		
		public void deleteHabitat(){
			try{
				
				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the habitat to delete, type its ID: ");
				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM habitat";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String medium = rs.getString("medium");
					Habitat habitat = new Habitat(id, name, medium);
					print.printHabitat(habitat);
				}
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM habtat WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				rs.close();
				stmt.close();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void deleteLocation(){
			try{
				
				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the location to delete, type its ID: ");
				
				Statement stmt = c.createStatement();
				String sql = "SELECT * FROM location";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					Float size = rs.getFloat("size");
					String name = rs.getString("name");
					Location location = new Location(id, size, name);
					print.printLocation(location);
			    }
				rs.close();
				stmt.close();
				int d_id = Integer.parseInt(reader.readLine());
				String sql2 = "DELETE FROM location WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql2);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
