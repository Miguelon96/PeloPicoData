package peloPicoData.db.pojos;

import java.io.Serializable;

public class Danger implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8221712119364750030L;
	
	private int id;
	private String nature_danger;
	private String magnitude;
	
	
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
	
		
}
