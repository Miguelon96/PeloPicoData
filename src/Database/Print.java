package Database;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import peloPicoData.db.pojos.*;

public class Print {
		
	
	public Connection c;
	
	public void printOpcion(int option){
	
		switch(option){
		case 1: System.out.println("Choose in which table you want to insert data:"
				+ "\n1.Animal Shelter \n2.Endangered Species \n3.Population "
				+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");
				break;
		case 2: System.out.println("Choose in which table you want to select:"
				+ "\n1.Animal Shelter \n2.Endangered Species \n3.Population "
				+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");
  				break;
		case 3: System.out.println("Choose in which table you want to delete data:"
				+ "\n1.Animal Shelter \n2.Endangered Species \n3.Population "
				+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");
				break;
		case 4: System.out.print("What do you want to search? ");
		System.out.print("\n1.Animal Shelter \n2.Endangered Species \n3.Population "
				+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");;
	   			break;
		case 5: System.out.println("Choose in which table you want to update data:"
				+ "\n1.Animal Shelter \n2.Endangered Species \n3.Population "
				+ "\n4.Government \n5.Danger \n6.Habitat \n7.Location \nOption: ");
				break;
		case 6: System.out.println("\nNow, what you want to do?");
			    System.out.println("\n1.Insert \n2.Select \n3.Delete \n4.Search \n5.Update"
				+ "\n6.Close Database \nOption:");
                break;		
		}
		
	}
	
	public void printAnimal_Shelter(Animal_Shelter animalShelter) {
		System.out.println("\nAnimal Shelter\n");

		System.out.println(animalShelter);
	}
	
	public void printEndangeredSpecies(Endangered_Species endangeredSpecies) {
		System.out.println("\nEndangered Species\n");
		
		System.out.println(endangeredSpecies);

	}

    public void printPopulation(Population population) {
		System.out.println("\nPopulation\n");
		
		System.out.println(population);

	}
    
    public void printGovernment(Government government) {
		System.out.println("\nGovernment\n");
		
		System.out.println(government);

	}
    
    public void printDanger(Danger danger) {
		System.out.println("\nDangers\n");
	
			System.out.println(danger);	
		
	}
 
    public void printHabitat(Habitat habitat) {
		System.out.println("\nHabitat\n");

		System.out.println(habitat);
		
	}
    
    public void printLocation(Location location) {
		System.out.println("\nLocation\n");

		System.out.println(location);

	}

	



	
	
	
	
	
	
	
	
	
}
