package Basic;

public class static_example {
	static int var =12;    //only declare class level
	
	public static void main(String [] args)
	{
		System.out.println("run static methods" + "=" + var);
		static1.method();  //staic direct call without using var
	}
	
	static {
		
		System.out.println("static block...");   // run 1st
	}  
	
	public void method3()
	{
	//	static int asc =45;
		
	}
}

class static1 
{	static void method()
	{
		System.out.println("run static methods");
		//System.out.println("run static methods" + var);
	}
}