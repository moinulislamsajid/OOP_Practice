package HaspMap;

import java.util.*;

public class hasp_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a has_Map
		
		HashMap<Integer,String> student = new HashMap<Integer,String>();
		student.put(101,"Ayman Sajid");
		student.put(102,"Samiur Rahman Sakib");
		
		System.out.println("His name : "+student.get(101));
		
		
		HashMap<String,Integer> teacher = new HashMap<String,Integer>();
		teacher.put("Mojubur Rahman", 10001);
		teacher.put("Rebeka Sultana", 19191);
		
		System.out.println("His id : "+teacher.get("Mojubur Rahman"));
		System.out.println("His Wife id :"+teacher.get("Rebeka Sultana"));

	}

}
