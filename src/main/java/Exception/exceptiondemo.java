package Exception;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=12;
			int b=0;
			int c;
			//c=a/b;    
			int array[]=new int[3];
			//array[4]= 33;
			int array2[]= {1,2,4,5,6};
			String str="pornima";
//			System.out.println(c);
			String str2 =null;
			System.out.println(str2.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Number format exception");
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("NullPointer format exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e.getMessage());
			System.out.println("ArrayIndexOutOfBounds format exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("Default Exception");

		}
		
	//	finally {
		//	System.out.println("in fnally block>>>>>>>>>");
		//}
		
	}

}
