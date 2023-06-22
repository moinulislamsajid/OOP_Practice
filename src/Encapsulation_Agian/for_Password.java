package Encapsulation_Agian;

public class for_Password {

	@SuppressWarnings("unused")
	private String string_pass;
	@SuppressWarnings("unused")
	private int num_pass;
	
	public void set_pass(String string_pass,int num_pass) {
		
		this.string_pass = string_pass;
		this.num_pass = num_pass;
	}
	public String get_pass() {
		return string_pass;
	}
	
	public int get_pass_num() {
		return num_pass;
	}
	
	// for print the current information
	
	void display() {
		System.out.println("Your String Password is : "+string_pass);
		System.out.println("Your number password is : "+num_pass);
	}
}
