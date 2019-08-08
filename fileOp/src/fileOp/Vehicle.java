package fileOp;

import java.io.Serializable;

public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private String name;
	
	
	public Vehicle (String type, String name) {
		this.type = type;
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Vehicle [type= " + type + ", name= " + name + "]";
	}
	
	

	
}
