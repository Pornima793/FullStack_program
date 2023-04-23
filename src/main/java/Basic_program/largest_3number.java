package Basic_program;

import java.util.Scanner;

public class largest_3number {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third number:");
		int num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3)
		{
			System.out.println("num1 is largest number");
		}
		else if ( num2>num1 && num2>num3) 
		{
			System.out.println("num2 is largest number");
		}
		if (num3>num1 && num3>num2)
		{
			System.out.println("num3 is largest number");
		}
		
		/*	int a=30, c=50, d=40;
		//second approCH
		int largest1 = a>c?a:c;  //largesest between  a& c
		int largest2 =largest1>d?largest1:d;
		System.out.println(largest2);
		 */
		
	}

}
