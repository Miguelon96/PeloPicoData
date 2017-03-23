package peloPicoData.db.pojos;

import java.util.*;
import java.io.Serializable;

public class Government implements Serializable {

	
	private int id;
	private String type;
	private String ideology;	
	private List <Animal_Shelter> animal_shelter = new ArrayList <>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIdeology() {
		return ideology;
	}
	public void setIdeology(String ideology) {
		this.ideology = ideology;
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
		Government other = (Government) obj;//
		if (id != other.id)
			return false;
		return true;
	}
	
}
