package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Endangered_Species implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3591284765705226686L;
	
	private int id;
	private String name;
	private String taxonomy;
	private String diet;
	private String reproduction;	
	private List <Population> population = new ArrayList <>();
	private List <Habitat> habitat = new ArrayList <>();
	private List <Animal_Shelter> animal_shelter = new ArrayList <>();
	private List <Danger> danger = new ArrayList <>();



		public Endangered_Species(){
			super();
		}

		
		public int getId() {
			return id;
		}

		public void setId(int iD) {
			id = iD;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}//

		public String getTaxonomy() {
			return taxonomy;
		}

		public void setTaxonomy(String taxonomy) {
			this.taxonomy = taxonomy;
		}

		public String getDiet() {
			return diet;
		}

		public void setDiet(String diet) {
			this.diet = diet;
		}

		public String getReproduction() {
			return reproduction;
		}

		public void setReproduction(String reproduction) {
			this.reproduction = reproduction;
		}
		
		public List<Population> getPopulation() {
			return population;
		}


		public void setPopulation(List<Population> population) {
			this.population = population;
		}


		public List<Habitat> getHabitat() {
			return habitat;
		}


		public void setHabitat(List<Habitat> habitat) {
			this.habitat = habitat;
		}


		public List<Animal_Shelter> getAnimal_shelter() {
			return animal_shelter;
		}


		public void setAnimal_shelter(List<Animal_Shelter> animal_shelter) {
			this.animal_shelter = animal_shelter;
		}


		public List<Danger> getDanger() {
			return danger;
		}


		public void setDanger(List<Danger> danger) {
			this.danger = danger;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Endangered_Species other = (Endangered_Species) obj;
			if (id != other.id)
				return false;
			return true;
		}

    
		
}
