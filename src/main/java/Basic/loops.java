package Basic;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{	//i=0,i=1;i=2,i=3;i=4,i=5
			for(int j=5;j>i;j--)
			{
				System.out.print(" "+j);
			}
			
			System.out.println();
		}
		
		for(int i=5;i>=0;i--)
		{	//i=0,i=1;i=2,i=3;i=4,i=5
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(); 
		}
	
		
		for(int i=5;i>=0;i--) 
		{ // i=0 i=1; i=2 i=3 i=4; i=5; 
			for(int j=1;j<=i;j++) 
			{ 
				System.out.print(" * ");
			} 
			System.out.println(); 
			}
		}
	}


