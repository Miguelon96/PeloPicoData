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

		SQL_Delete(Connection c){
			super();
			this.c=c;
			
		}
		
		public void callDelete(){
			try {
			
				System.out.println("Choose in which table you want to delete data:"
						+ "\n1.Animal Shelter \n2.Endangered Species \n3.Population "
						+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				int option = Integer.parseInt(reader.readLine());
				
				switch(option){
				/*case 1: insertAnimalShelter();
						break;
				case 2: insertEndangered_Species();
						break;
				case 3: insertPopulation();
						break;
				case 4: insertGovernment();
						break;*/
				case 5: deleteDanger();
						break;
				/*case 6: insertHabitat();
						break;
				case 7: insertLocation();
						break;*/
				}

					} catch (Exception e) {
							e.printStackTrace();
						}
		}
			
		private void printDanger() throws SQLException {

			System.out.println("\nDangers\n");

			Statement stmt = c.createStatement();
			String sql = "SELECT * FROM danger";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String nature_danger = rs.getString("nature_danger");
				String magnitude = rs.getString("magnitude");
				Danger d = new Danger(id, name, nature_danger, magnitude);
				
				System.out.println("Id:");
				System.out.println(d.getId());
				System.out.println("Name:");
				System.out.println(d.getName());
				System.out.println("Nature of the Danger:");
				System.out.println(d.getNature_danger());
				System.out.println("Magnitude:");
				System.out.println(d.getMagnitude());
				System.out.println("\n");


				
			}
			rs.close();
			stmt.close();
		}
		
		

		public void deleteDanger() {
			try {

				// Remove an employee: beginning
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choose the danger to delete, type its ID: ");
				printDanger();
				int d_id = Integer.parseInt(reader.readLine());
				String sql = "DELETE FROM danger WHERE id=?";
				PreparedStatement prep = c.prepareStatement(sql);
				prep.setInt(1, d_id);
				prep.executeUpdate();
				System.out.println("Deletion finished.");
				// Remove an employee: end


			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
}
