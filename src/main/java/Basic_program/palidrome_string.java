package Basic_program;

import java.util.Scanner;

public class palidrome_string {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the String name: ");

		String str = sc.nextLine();
		
		String Rev ="";
		int len=str.length();
		for (int i=len-1;i>=0;i--)
		{
			Rev = Rev + str.charAt(i);
		}			System.out.println(Rev);

		if(str.equals(Rev))
		{
			System.out.println("String is palidrome");
			
		}
		else
		{
			System.out.println("String is not palidrome" +str);

		}
		
	}

}
