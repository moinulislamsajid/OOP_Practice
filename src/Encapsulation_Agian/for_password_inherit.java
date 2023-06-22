package Encapsulation_Agian;

public class for_password_inherit extends for_Password {

	private char spacial_sym;
	
	public void set_sym(char spacial_sym){
		this.spacial_sym = spacial_sym;
	}
	
	public char get_sym() {
		return spacial_sym;
	}
	
	
	void display1() {
		super.display();
		System.out.println("Your Spacial Symbol is : "+spacial_sym);
	}
}
