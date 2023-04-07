package super_this_program;

public class super_constructor_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childconstructor c1 =new childconstructor();
		c1.msg();
	}

}

class parentsconstructor 
{
	parentsconstructor()
	{
	System.out.println("Hello I am in contructor parent class");
	}

}
class childconstructor extends parentsconstructor 
{
	childconstructor()
	{
		super();
		System.out.println("Hello I am in contructor child class");
	}
	public void msg()
	{
		System.out.println("print child");
	}
}