package String_Array_operations;

public class typecasting {
	public static void main(String[] args) {
		//integer to string
		int num = 678;
		String str = Integer.toString(num);
		System.out.println("integer to string =" +num); 
		
		
		//string to integer
		String str1= "1234";
		int num2 = Integer.parseInt(str1);
		System.out.println("string to integer =" +str1); 
		
		//integer to double 
		int d = 777;
		double dnum =(double)d;
		System.out.println("integer to double  =" +dnum); 

		

}
	
}