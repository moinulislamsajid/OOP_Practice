package super_consructor;

public class super_cons {
	String name;
	int id;
	// create a constructor
	super_cons(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	void display() {
		System.out.println("His name is : "+name);
		System.out.println("His id is : "+id);
	}

}
