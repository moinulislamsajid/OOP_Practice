package Encapsulation;

public class Sajid extends Domrakandi{

	private String vill;
	public void set_vill(String vill){
		this.vill = vill;
		
	}
	public String get_vill() {
		return vill;
	}
	@Override
	void display() {
		super.display();
		System.out.println("His Village : ");
		
	}
}
