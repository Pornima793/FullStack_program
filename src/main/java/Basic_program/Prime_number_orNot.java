package Basic_program;

import java.util.Scanner;

public class Prime_number_orNot {

	public static void main(String[] args) {
		
		//1.number should >1
		//2.should divided by self itself
		//3. count 
		int num = 3;
		int count=0;
			if(num>1)
			{
				for(int i=1;i<=num;i++)
				{
					if(num%i==0);
					count++;
				}
				if(count==2)
				{
					System.out.println("prime number");
				}
				else 
				{
					System.out.println("number is not prime");
				}

			}
			else
			{
				System.out.println("number1 is not prime");

			}
	}

}
