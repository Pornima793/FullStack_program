package Oops_concept;

import Oops_concept.outer2.inner2;

abstract class outer 
{
	abstract class inner
	//class contains at least one abstract method then 
	//compulsory that we should declare the class as abstract otherwise we will get a compile-time error 
	{
		abstract void innermethod();
	}
}
//abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
class outer2 extends outer
{
	class inner2 extends inner
	{	@Override
		void innermethod() {
			System.out.println("run inner method in inner class");			
		}
		
	}
}
public class nested_abstract_class {

	public static void main(String[] args) {
		outer2 obj = new outer2();  //outer abstract class
		
		outer2.inner2 obj2 = obj.new inner2();
		obj2.innermethod();
			
				
	}

}
