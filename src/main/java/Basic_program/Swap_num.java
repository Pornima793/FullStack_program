package Basic_program;

public class Swap_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		System.out.println("before swap num: " +a +" " +b);
		
		//using third var
	int temp=a;  //temp=10
		a=b;     //a=20
		b=temp;  //b=10
		System.out.println("after swap num: " +a +" " +b);
		
		//using + & - operator
		int x=100, y=200;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swap num: " +x +" " +y);

				
		//using * & / operator
				int x1=1000, y1=2000;
				x1=x1*y1;
				y1=x1/y1;
				x1=x1/y1;
				System.out.println("after swap num: " +x1 +" " +y1);
				

	}

}
