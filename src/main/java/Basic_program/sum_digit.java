package Basic_program;

public class sum_digit {

	public static void main(String[] args) {
	
		int num=4567;
		int sum=0;
		while(num>0)
		{
					 //last number
			sum=sum+num%10;      //4+3+2+1
			num=num/10;           //123 12 1
		}
		
		System.out.println("sum no of digit in number:" + sum);
	}

}
