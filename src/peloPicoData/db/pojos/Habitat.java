package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Habitat implements Serializable {

		
	
	
	
	private int id;
	private String name;
	private String medium;
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
