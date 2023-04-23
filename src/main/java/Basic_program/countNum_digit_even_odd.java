package Basic_program;

public class countNum_digit_even_odd {

	public static void main(String[] args) {
		int a=956784;
		int count=0;
		while(a>0)
		{
			a=a/10; 
			count++;
		}
				System.out.println(count);
				System.out.println("____________________________");

	
	int b=4567211;
	int even_count=0;
	int odd_count=0;
	while (b>0) {
		int rem =b%10;
		if(rem%2==0)
		{
			even_count++;		
		}
		else
		{
			odd_count++;
		}
		b=b/10;
	}
	System.out.println("count of even number" + even_count );
	System.out.println("count of odd  number" + odd_count);

}
}