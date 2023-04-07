package super_this_program;

public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c12 = new child();
		c12.display();
	}

}
class parent
{
	int a=20;
}

class child extends parent
{
	int a=70;
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}