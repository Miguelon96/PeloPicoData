package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Animal_Shelter implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5982998710194121392L;
	
	private int id;
	private String name;
	private String resources;
	private Float capital;
	private Government government;
	private List <Endangered_Species> endangered_species = new ArrayList <>();

	
	
	public Animal_Shelter(int id, String name, String resources, Float capital) {
		super();
		this.id = id;
		this.name = name;
		this.resources = resources;
		this.capital = capital;
	}


	public Animal_Shelter(String resources, Float capital, Government government) {
		super();
		this.resources = resources;
		this.capital = capital;
		this.government = government;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResources() {
		return resources;
	}
	public void setResources(String resources) {
		this.resources = resources;
	}
	public Float getCapital() {
		return capital;
	}
	public void setCapital(Float capital) {
		this.capital = capital;
	}
	
	public Government getGovernment() {
		return government;
	}
	public void setGovernment(Government government) {
		this.government = government;
	}
	public List<Endangered_Species> getEndangered_species() {
		return endangered_species;
	}
	public void setEndangered_species(List<Endangered_Species> endangered_species) {
		this.endangered_species = endangered_species;
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
		Animal_Shelter other = (Animal_Shelter) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String toString(){
		return "Id: "+id+ "\nName: "+name+ "\nResources: "+resources+"\nCapital: "+capital;
	}

	
	
	
	
	
}
