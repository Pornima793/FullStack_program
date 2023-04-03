package String_Array_operations;

import java.util.Arrays;

public class Array_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data declare
		int arr[]= {222,33,44,55,66,77,11};
		System.out.println(arr[0]);                  //print array using index
		System.out.println("_____________________________________");                  //print array using index
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);                  //print all data array

		}
		
		int Roll_num[]=new int[5];
		//integer values 
		Roll_num[0]=21;
		Roll_num[1]=23;
		Roll_num[2]=24;
		Roll_num[3]=25;
		Roll_num[4]=22;

		String Student_Name[]=new String[5];
		//all string only name student
		Student_Name[0]="Rahul";
		Student_Name[1]="Mangesh";
		Student_Name[3]="Rupesh";
		Student_Name[2]="Raman";
		Student_Name[4]="Mayur";

		String Student_city[]=new String[5];
		Student_city[0]="Pune";
		Student_city[1]="Mumbai";
		Student_city[2]="Kolkata";
		Student_city[3]="Goa";
		Student_city[4]="Latur";
		//Student_city[5]="Madras";
		
		char Student_Letter[]=new char[5];
		Student_Letter[0]= 'c';
		Student_Letter[1]= 'd';
		Student_Letter[2]= 'f';
		Student_Letter[3]= 'g';
		Student_Letter[4]= 'h';
		
		System.out.println("_____________________________________");

		System.out.println(Roll_num.length);
		System.out.println(Student_Name.getClass());
		System.out.println("_____________________________________");

		Arrays.sort(Roll_num);  //sort
		//Arrays.toString(Roll_num);
		for(int j=0;j<=Roll_num.length-1;j++)
		{
			System.out.println(Roll_num[j]);                  //print all int data array
		}
		System.out.println("_____________________________________");
		
		for(int k=0;k<=Student_Letter.length-1;k++)
		{
			System.out.println(Student_Letter[k]);                  //print all char data array
		}
		System.out.println("_____________________________________");
	}
	
}

