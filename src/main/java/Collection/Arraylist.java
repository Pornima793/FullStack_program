package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		//collection def: 
		
		//    list, queue and set :-> interface
		// arraylist, linkedlist, stack and vector  :- class
		//   collection and collections: w.r.to class & interface
		// queue: priority queue ->interface dequeue->class array deqeue
		//set : hashset and linkedhashset -->interface sortedset
		//hashmap 
		
		//List  :  Arraylist 
		ArrayList <Integer> l =new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(6);
		l.add(42);
		
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("_________________________________________");

		
		List <String> l1 =new ArrayList();
		l1.add("pornima");
		l1.add("apeksha");
		l1.add("Rupali");
		
		
		Iterator itr1 = l1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		} 
		
		/*// Typical for loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Students names in ArrayList using for loop :::: " + studentList.get(i));
		}
*/
		
		// generic list has same datatype
		
		//remove duplicate elemment using linkhashset
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 10, 20, 3, 4, 5, 60, 60, 10));

		// 1. Using LinkedHashSet
		// LinkedHashSet is coming from Set family, LinkedHashSet is class which is implementing the set interface.
		// Property of Set is that they can not have duplicate elements 

		LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkSet);
		System.out.println("Duplicate numbers removed using LinkedHashSet :::: " + numbersListWithoutDuplicate);
	}


}
