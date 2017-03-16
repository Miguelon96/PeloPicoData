package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Endangered_Species implements Serializable {

	
	//ATRIBUTES
	private int id;
	private String name;
	private String taxonomy;
	private String diet;
	private String reproduction;
	
	private List <Population> population = new ArrayList <>();
	private Integer Population;  
	
	//CONSTRUCTORS
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
