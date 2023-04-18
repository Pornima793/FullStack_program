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
	}

}
