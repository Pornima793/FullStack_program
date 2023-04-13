package Oops_concept;

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p =new parent();
		p.print(45,50);
		parent p1 =new child();
		p1.print(45,55);
	}

}
class parent
{
	public void print(int a, int b)
	{
		System.out.println("im in parent class");
	}
}
class child extends parent 
{
	public void print(int a, int b)
	{
		System.out.println("im in child class");

	}
}