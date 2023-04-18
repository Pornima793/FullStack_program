package Basic_program;

import java.util.Scanner;

public class palidrome_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();		
		//1.using algorithm
		int rev =0;
		while(num!=0) {
			rev = rev *10+ num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		
		if(num ==rev)
		{
			System.out.println("number is palidrome");

		}
		else
		{
			System.out.println("number is not palidrome");

		}
		//using string buffer
		int num1=9897;
				StringBuffer sb =new StringBuffer(String.valueOf(num1));
				StringBuffer rev1 =sb.reverse();
				System.out.println(rev1);
				
		//using string builder
		int num2=9090;
		StringBuilder sb1=new StringBuilder();
		sb1.append(num2);
		StringBuilder rev2=sb1.reverse();
		System.out.println(rev2);
				
	}
	

}
