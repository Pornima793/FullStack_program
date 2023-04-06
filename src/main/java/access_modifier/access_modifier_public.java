package access_modifier;


public class access_modifier_public {

	public static void main(String[] args) {
		
		Baseclass obj =new Baseclass();
		obj.display1();
		access_modifier_public obj1 =new access_modifier_public();
		obj1.display();
		
		
	}
	public void display()
	{
		System.out.println("print same class from same package");
	}
}

 class Baseclass
{
	public void display1()  //acces public
	{
		System.out.println("print another class from same package");
	}
}