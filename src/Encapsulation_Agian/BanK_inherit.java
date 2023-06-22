package Encapsulation_Agian;

public class BanK_inherit extends BanK {

	private int sec_code;
	
	public void set_sec(int sec_code) {
		this.sec_code = sec_code;
		
	}
	public int get_sec() {
		return sec_code;
	}
	void displayBank() {
		super.display();
		System.out.println("Secourity COde For Withdraw Money : "+sec_code);
	}
}
