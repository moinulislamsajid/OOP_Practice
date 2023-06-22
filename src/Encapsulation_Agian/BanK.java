package Encapsulation_Agian;

public class BanK {
	private String area_code;
	private int breanch_code;
	
	public void  set_area(String area_code,int breanch_code) {
		this.area_code = area_code;
		this.breanch_code = breanch_code;
		
	}
	
	public String get_area() {
		return area_code;
	}
	
	public int get_area_num() {
		return breanch_code;
	}
	
	// print the current value
	
	void display() {
		System.out.println("Area code : "+area_code);
		System.out.println("Breanch Code : "+breanch_code);
	}
	
	
	

}
