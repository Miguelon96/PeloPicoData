package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Danger implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1662524910422193375L;
	
	private int id;
	private String name;
	private String nature_danger;
	private String magnitude;
	private List <Endangered_Species> endangered_species = new ArrayList <>();

	
	public Danger(int id, String name, String nature_danger, String magnitude) {
		super();
		this.id = id;
		this.name = name;
		this.nature_danger = nature_danger;
		this.magnitude = magnitude;
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
	public String getNature_danger() {
		return nature_danger;
	}
	public void setNature_danger(String nature_danger) {
		this.nature_danger = nature_danger;
	}
	public String getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(String magnitude) {
		this.magnitude = magnitude;
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
		Danger other = (Danger) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String toString(){
		return "Id: "+id+ "\nName: "+name+ "\nNature of Danger: "+nature_danger+"\nMagnitude: "+magnitude;
	}
		
}
