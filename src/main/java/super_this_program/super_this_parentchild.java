package super_this_program;

public class super_this_parentchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 p1 =new parent1();
				p1.message();
		child1 c1 = new child1();
				c1.messsage();;
			c1.display();
		
	}

}
class parent1
{
	void message()
	{
		System.out.println("print message from parent1________");
	}
}

class child1 extends parent1
{
	void messsage()
	{
		System.out.println("print message from child1________");

	}
	void display()
	{
		System.out.println("mesaage printing from child");
		super.message();
	}
}