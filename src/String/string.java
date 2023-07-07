package String;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f_name = "Ayman Sajid";
		String l_name = "Nisho";
		String full_name = f_name + " " + l_name;
		System.out.println(full_name.length());
		
		for(int i =0; i<full_name.length();i++) {
			System.out.println(full_name.charAt(i));
		}
		String sentance = "My name is Ayman Sajid";
		String name = sentance.substring(11, sentance.length());
		System.out.println(name);
		
		StringBuilder ob = new StringBuilder("Ayman Sajid");
		System.out.println(ob);
		
		ob.setCharAt(0, 'N');
		System.out.println(ob);
		
		ob.insert(2, 'p');
		System.out.println(ob);
		
		ob.delete(2, 3);
		System.out.println(ob);

		
		

	}
	
	

}
