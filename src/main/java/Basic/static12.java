package Basic;

public class static12 {
	private static int b=99999;
	 static{  
		  System.out.println("static block is invoked3");  
		   int vc =77;
		   int df;
		   df=vc/0;
		   System.out.println(vc);
		  } 
		  static{  
		  System.out.println("static block is invoked");  
		   
		  }  static{  
			  System.out.println("static block is invoked2" + b);  
			   
			  }  
		  
public static void main(String []args)
{
	static12 obj =new static12(2);
	
}
public static12(int a)
{
	System.out.println("in constructor..................=" + a);
}

}
