package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_methods {

	public static void main(String[] args) {

			ArrayList <String> studentname = new ArrayList <String>();
			studentname.add("Tom");
			studentname.add("Peter");
			studentname.add("Jhon");
			studentname.add("James");
			studentname.add("Rosy");
			studentname.add("Jack");
			
			ArrayList<String> Coursename = new ArrayList<String>();
			Coursename.add("C");
			Coursename.add("C++");
			Coursename.add("java");
			
			// Adding studentdList and courseList
			studentname.addAll(Coursename);
			System.out.println("Adding studentdList and courseList :::: " + studentname);
			
			
			//object present or not
			System.out.println(studentname.contains("Tom"));
			
			//index of object
			System.out.println(studentname.indexOf("James"));
			
			//remove item
			System.out.println(studentname.remove(6));
			System.out.println(studentname);
			Coursename.clear();
			System.out.println(Coursename);
			//
			System.out.println(Coursename);
			
			// List with other collection say as Integer 
			ArrayList<Integer> arInt = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
			System.out.println("Creating ArrayList with Integer Array :::: " + arInt);
			
			//sorting using collections
			Collections.sort(studentname);
			System.out.println(studentname);
			
			//checking any equal
			System.out.println(studentname.equals(Coursename));
			
			//removeall:additional ele and retain all: common element
	}

}
