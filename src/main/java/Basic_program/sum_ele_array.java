package Basic_program;

public class sum_ele_array {

	public static void main(String[] args) {
		int a[]= {5,2,7,6,9};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		//using Enhanced loop
	/*	for(int val:a)
		{
			sum=sum+val;
			
		}
		System.out.println(sum); */
	}

}
