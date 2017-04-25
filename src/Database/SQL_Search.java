package Database;

import java.io.*;
import java.sql.*;

import peloPicoData.db.pojos.*;



public class SQL_Search {

	Connection c;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String searchName;
	Print print = new Print();
	public SQL_Search(Connection c) {
		super();
		this.c = c;
	}
	
	public void search(){
		try {
			
		print.printOpcion(4);
		int search = Integer.parseInt(reader.readLine());
		
		switch(search){
		
		case 1: searchAnimalShelter();
		break;
		case 2: searchEndangered_Species();
		break;
		case 3: searchPopulation();
		break;
		case 4: searchGovernment();
		break;
		case 5: searchDanger();
		break;
		case 6: searchHabitat();
		break;
		case 7: searchLocation();
		break;
		
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



public void searchAnimalShelter(){
	try {
		
		System.out.print("Name of the animal shelter to be shown: ");
		searchName = reader.readLine();
		
		// Retrieve data: begin
					String sql = "SELECT * FROM animal_shelter WHERE name LIKE ?";
					PreparedStatement prep = c.prepareStatement(sql);
					prep.setString(1, searchName);
					ResultSet rs = prep.executeQuery();
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String resources = rs.getString("resources");
						float capital = rs.getFloat("capital"); }
						/*Government salary = rs.getDouble("salary");
						byte[] photo = rs.getBytes("photo");
						
						Animal_Shelter animal_shelter = new Animal_Shelter(id, name, resources, address, salary, photo);
						System.out.println(employee);
						// Process the photo
						if (photo!=null) {
							ByteArrayInputStream blobIn = new ByteArrayInputStream(employee.getPhoto());
							// Show the photo
							if (showImage) {
								ImageWindow window = new ImageWindow();
								window.showBlob(blobIn);
							}
							// Write the photo in a file
							else {
								File outFile = new File("./photos/Output.png");
								OutputStream blobOut = new FileOutputStream(outFile);
								byte[] buffer = new byte[blobIn.available()];
								blobIn.read(buffer);
								blobOut.write(buffer);
								blobOut.close();
							}
						}
					}
					rs.close();
					prep.close();
					System.out.println("Search finished.");
					// Retrieve data: end*/
		} catch (Exception e) {
		e.printStackTrace();
	}
}

public void searchEndangered_Species(){
	try {
		
		System.out.print("Name of the endangered specie to be shown: ");
		searchName = reader.readLine();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public void searchPopulation(){
	try {
		
		System.out.print("Name of the population to be shown: ");
		searchName = reader.readLine();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public void searchGovernment(){
	try {
		
		System.out.print("Name of the government to be shown: ");
		searchName = reader.readLine();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public void searchDanger(){
	try {
		
		System.out.print("Name of the danger to be shown: ");
		searchName = reader.readLine();
		
		// Retrieve data: begin
		String sql = "SELECT * FROM danger WHERE name LIKE ?";
		PreparedStatement prep = c.prepareStatement(sql);
		prep.setString(1, searchName);
		ResultSet rs = prep.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String nature_danger = rs.getString("nature_danger");
			String magnitude = rs.getString("magnitude"); 
			
			Danger danger = new Danger(id, name, nature_danger, magnitude);
			print.printDanger(danger);
			}
		
		rs.close();
		prep.close();
		System.out.println("Search finished.");
		// Retrieve data: end*/
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public void searchHabitat(){
	try {
		
		System.out.print("Name of the habitat to be shown: ");
		searchName = reader.readLine();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public void searchLocation(){
	try {
		
		System.out.print("Name of the location to be shown: ");
		searchName = reader.readLine();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}

}
