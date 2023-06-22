package constructor_override;

public class const_override_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		const_Override ob = new const_Override();
		const_Override ob1 = new const_Override(10);
		ob1.display();
		const_Override ob2 = new const_Override(10);
		ob2.display();
		const_Override ob3 = new const_Override(40,50);
		ob3.display();
		const_Override ob4 = new const_Override(90,20,10);
		ob4.display();
		const_Override ob5 = new const_Override("AYman Sajid");
		ob5.display();
	}

}
