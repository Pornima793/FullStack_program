package Oops_concept;

public class method_overloading {

	public void addition(int x, int y)
	{
		int add = x +y;
		System.out.println(add);
		
	}
	
	public double substraction(int a, double b)
	{
		double sub = a-b;
		return sub;
		//System.out.println(sub); gives compile error

	}
	public static void main(String[] args) {
			
		method_overloading ad = new method_overloading();
		ad.addition(20, 5);
		System.out.println("Substraction result " + ad.substraction(33, 2.5));
		
	}

}
