package Basic_program;

public class Factorial_num {

	public static void main(String[] args) {
		// ascending order
		int num =5;
		long fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		//for desecnding order
		int num1 = 4;
		long fact1 = 1;
		for(int j=num1;j>=1;j--)
		{
			fact1=fact1*j;
		}
		System.out.println(fact1);
	}

}
