package introtogettersandsetters;

public class Person {

	private String name;
	private String superpower;

	String getName() {
		return name;
	}

	String getSuperpower() {
		return superpower;
	}
	
	void setName() {
		this.name = name;
	}
	
	void setSuperpower() {
		this.superpower = superpower;
	}

	public String toString() {
		return name + "has mad " + superpower + " skills.";
	}
	
	
}
