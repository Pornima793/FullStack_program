package Basic_program;

import java.util.Scanner;

public class finbonacci_series {
//0 1 1 2 3 5 8 13 21 34............
	public static void main(String[] args) {
		//sum of two precedding number
		int num1=0, num2=1, num=0;
		
		//scanner input
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number");
		int number =sc.nextInt();
		
		System.out.println(num1 + " "+ num2);
		for(int i=0;i<number;i++)
		{
			num = num1+num2;
			System.out.print(" " +num);
			num1=num2;
			num2=num;
			
		}
	}

}
