package Oops_concept;

class interface_parents
{
	public static void main(String[] args) {
		
		childs ch =new childs();
		ch.demo();
		//System.out.println(a);
	}
}

interface parents  //interface declaration
// only default and static methods allowed
{	public int a =900;
	void demo();
	default void methods()
	{
		System.out.println("pprint");
	}
//	public void methods1()
	//{
//		System.out.println("pprint");
	//}
	static void methods2()
	{
		System.out.println("pprint");
	}
}
//A class that implements the interface.
class childs implements parents
{
	public void demo()   //public
	{
		System.out.println("run method from child class");
	}
	
}