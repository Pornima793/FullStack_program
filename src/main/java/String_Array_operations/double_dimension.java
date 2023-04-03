package String_Array_operations;

public class double_dimension {
	
	
	public static void main(String[] args) {
		
		int arr1[][]=new int [3][2];
		arr1[0][0] = 11; 
		arr1[0][1] = 21; 
		arr1[1][0] = 31; 
		arr1[1][1] = 41; 
		
		System.out.println("Row num" + " = " + arr1.length);
		System.out.println("Col num" + " = " + arr1[1].length);

		for(int i=0; i<arr1.length; i++)

		{
			for(int j = 0; j<arr1[1].length; j++)
			{
				 System.out.println(arr1[i][j] + " ");

			}

		}
			

			///double_dimension obj = new double_dimension();
		//	obj.arr2[2][2];
			int arr11[][]=new int[2][2]; 
			int arr22[][]= {{1,2,3},{4,5,6}};
			System.out.println("__________________");
			for(int k=0; k<arr22.length; k++)

			{
				for(int l = 0; l<arr22[1].length; l++)
				{
					 System.out.println(arr22[k][l] + " ");

				}

			} 
			
			
			String str1[][]= {{"ganesh","mahesh"},{"ramesh","Saurabh"}};
			String str2[][] =new String[2][2];
			for(int k=0; k<str1.length; k++)

			{
				for(int l = 0; l<str1[1].length; l++)
				{
					 System.out.println(str1[k][l] + " ");

				}

			} 
	}
			
}