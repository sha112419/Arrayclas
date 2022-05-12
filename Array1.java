package array;

import java.util.ArrayList;

public class Array1 {


	public static void main(String[] args) {
		ArrayList<String> shahid = new ArrayList<>(); 
		System.out.println("ArrayList initially: " + shahid); 
		shahid.add("manoj");
		System.out.println("ArrayList after adding one element: " + shahid); 
		shahid.add("baby");
		System.out.println("ArrayList after adding two elements: " + shahid);
		shahid.add("rahman");
		System.out.println("ArrayList after adding three elements: " + shahid);
		shahid.remove("manoj");
		System.out.println("ArrayList after removing one element: " + shahid);
		shahid.remove("baby");
		System.out.println("ArrayList after removing two elements: " + shahid);
		shahid.remove("rahman");
		System.out.println("ArrayList after adding three elements: " + shahid); 
		
	}  

}
