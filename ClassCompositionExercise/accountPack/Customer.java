package accountPack;

public class Customer {
	private int ID;
	private String name;
	private char gender;
	
	public Customer(int iD, String name, char gender) {
		this.ID = iD;
		this.name = name;
		System.out.println(gender);
		if(gender == 'm' || gender == 'f') {
			this.gender = gender;
		}
		else {
			throw new IllegalArgumentException("Gender should be either m or f");
		}
	}
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return name + "(" + ID + ")";
	}
}
