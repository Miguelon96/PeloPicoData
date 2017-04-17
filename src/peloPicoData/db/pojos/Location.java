package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Location implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6326067513915117186L;
	
	private int id;
	private Float size;
	private String name;
	private List <Population> population = new ArrayList <>();
	private List <Habitat> habitat = new ArrayList <>();

	
	
	public Location(int id, Float size, String name) {
		super();
		this.id = id;
		this.size = size;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Float getSize() {
		return size;
	}
	public void setSize(Float size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		Location other = (Location) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
