package Encapsulation_Agian;

public class Private_Name {
	private String name;
	private int id;
	
	// to set the value for encapsulation method
	public void set_info(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	// to get the value
	public String get_info(){
		return name;
	}
	
	public int get_id() {
		return id;
	}
	
	void display() {
		System.out.println("His name is : "+name);
		System.out.println("His id : "+id);
		
	}
	
	

}
