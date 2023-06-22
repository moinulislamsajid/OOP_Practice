package Encapsulation;

public class Domrakandi {
	private String name;
	private int id;
	
	public void se_name(String name,int id) {
		this.name=name;
		this.id = id;
	}
	public String get_name() {
		return name;
	}
	public int get_id() {
		return id;
	}
	void display() {
		System.out.println("His Name : "+name);
		System.out.println("His id : "+id);

		
	}

}
