package access_modifier;

public class access_modifier_protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access_modifier_protected obj =new access_modifier_protected();
		obj.display3();
		
		protectedcall obj1 =new protectedcall();
		obj1.protectedmethod();
		
	}
	
	protected void display3()
	{
		System.out.println("print same class from same package>>>");
	}
}

class protectedcall
{
	protected void protectedmethod()   //access protected
	 {
			System.out.println("print another class from same package");

	 }
}