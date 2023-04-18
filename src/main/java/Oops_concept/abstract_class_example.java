package Oops_concept;

public class abstract_class_example {  //base class
		public static void main(String[] args) {
			parentclass obj = new childclass(); //use reference of class
			obj.method();
			obj.method1();
			parentclass.demo();
		//1. cant create instance of abstract class
		//	parentclass p =new parentclass();
			
		//2. an abstract class without any abstract method. This allows us to create classes 
		// 		that cannot be instantiated but can only be inherited.	
		// 3.final methods (methods that cannot be overridden)	
		//4 . we can define static methods in an abstract class that can be called
		//	  independently without an object. 
			
			child3 obj3 =new child3();
			obj3.m1();
			obj3.m2();
			obj3.m3();
	}

}
abstract class allmethods
{
	abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class child2 extends allmethods
{
	 void m2()
	 {
		 System.out.println("run m2");
	 }
	    void m3()
	    {
	    	 System.out.println("run m3");
	    }
}
class child3 extends child2
{
	 void m1()
	{
		 System.out.println("run m1");

	}

}
//abstract class
abstract class parentclass
{
	public parentclass()   //abstract class constructor can created
	{  
		System.out.println("abstract class constructor called");
	}
	
	final void method1()
	{
		System.out.println("abstract final method run");

	}
	static void demo()
	{
		System.out.println("abstract static method run");

	}
	abstract void method();
	
}
//abstraction
class childclass extends parentclass
{
	childclass()  //constructor
	{
		System.out.println("childclass constructor called");
	}
	void method()  //addd unimplement method
	{
		String s ="pornima";
		int age =30;
		
		System.out.println(s);
		System.out.println(age);
		System.out.println("childclass print _________");
	}
}