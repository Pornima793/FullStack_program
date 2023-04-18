package Basic_program;

public class ReverseString_3diffway {

	public static void main(String[] args) {
		//1. using + String concatenation operator
		String str ="pornima";
		String Rev ="";
		
		for(int i =str.length()-1; i>=0;i--)
			{
				Rev =Rev + str.charAt(i);
			}
		System.out.println(Rev);  
		
		//2. using character array
		String str1 ="ABCD";
		String Rev1 ="";
		
		char a[] =str1.toCharArray();
		for(int i =str1.length()-1; i>=0;i--)
		{
			Rev1 =Rev1 + a[i];
		}
		System.out.println(Rev1);
		
		//using string buffer class
		StringBuffer sb =new StringBuffer(str1);
		 StringBuffer rev = sb.reverse();
		System.out.println(rev);

	}

}
