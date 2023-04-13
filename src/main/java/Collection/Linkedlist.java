package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
	
		LinkedList <Integer> l1 =new LinkedList();
		l1.add(22);
		l1.add(33);
		l1.add(55);
		
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
