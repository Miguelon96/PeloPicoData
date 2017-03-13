package peloPicoData.db.pojos;

import java.io.Serializable;

public class Government implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5435134538631927199L;
	
	private int id;
	private String type;
	private String ideology;
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
		Government other = (Government) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
