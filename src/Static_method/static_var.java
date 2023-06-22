package Static_method;

public class static_var {

	String name;
	int id;
	static String uni_name;  // you can also initialization this static variable 
	static {
		uni_name = "DIU";
	}
	static_var(String name,int id){
		this.name = name;
		this.id = id;
	}
	void display() {
		System.out.println("His  name : "+name);
		System.out.println("His age : "+name);
		System.out.println("His UNiversity : "+name);
	}
	
	
}
