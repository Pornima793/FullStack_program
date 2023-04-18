package access_modifier;

public class access_modifier_private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access_modifier_private obj =new access_modifier_private();
		obj.dispaly();
		
	//	privatecall obj1 =new privatecall();
	//	obj.privatemethod();

		
	}
	private void dispaly()
	{
		System.out.println("print same class from same package");
	}

}

class privatecall
{
	private void privatemethod()   //access protected
	 {
			System.out.println("print another class from same package");

	 }
}