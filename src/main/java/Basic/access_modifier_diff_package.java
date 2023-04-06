package Basic;
import access_modifier.access_modifier_protected;
import access_modifier.access_modifier_public;


public class access_modifier_diff_package  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access_modifier_public obj =new access_modifier_public();
		obj.display();
		
		//acess_modifier_default obj1 =new acess_modifier_default(); //cant acces becasuse default diff package
		
		
		//access_modifier_protected obj3 =new access_modifier_protected();       //cant access protected packg
		//obj3.display3();
		
		
	}

}
class Baseclass
{
	public void display1 ()
	{
		System.out.println("print another class from same package");
	}
}