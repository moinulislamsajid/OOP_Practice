package Encapsulation;

public class Sakib extends Sajid{

	private String Home_vill;
	public void set_homeVill(String Home_vill){
		this.Home_vill = Home_vill;
	}
	public String get_HomeVill() {
		return Home_vill;
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("His Hoome Vill : "+Home_vill);
	}
}
