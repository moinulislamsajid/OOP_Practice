package super_consructor;

public class super_in  extends super_cons{

	String uni_name;
	
	super_in(String name,int id,String uni_name){
		super(uni_name, id);
		this.uni_name = uni_name;
	}
	
	void display1() {
		super.display();
		System.out.println("His University Name : "+uni_name);
	}
}
