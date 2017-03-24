package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Habitat implements Serializable {

		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 851376603424971984L;
	private int id;
	private String name;
	private String medium;
	private List <Location> location = new ArrayList <>();
	private List <Endangered_Species> endangered_species = new ArrayList <>();


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	
	public List<Location> getLocation() {
		return location;
	}
	public void setLocation(List<Location> location) {
		this.location = location;
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
		Habitat other = (Habitat) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
