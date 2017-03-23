package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Population implements Serializable {

	
	private int id;
	private int number;
	private String gender;
	private int age;
	private Location location;
	private Endangered_Species endangered_species;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Endangered_Species getEndangered_species() {
		return endangered_species;
	}
	public void setEndangered_species(Endangered_Species endangered_species) {
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
		Population other = (Population) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
