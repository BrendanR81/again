package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(3);
		
		al.add("Honda");
		al.add("Toyota");
		al.add("Lexus");
		System.out.println(al.toString());
		
		al.remove(al.indexOf("Toyota"));
		al.set(0, "Mercedes");
		System.out.println(al.toString());
	}

}
