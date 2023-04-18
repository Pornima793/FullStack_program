package Basic_java;

public class static_exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.staticnestedclass obj =new outer.staticnestedclass();
		obj.nestedmethod();
	}

}
class outer
{
	static String str="zunje";
	
	static class staticnestedclass
	{
		void nestedmethod()
		{
			System.out.println("display message:" + str);
		}
	}
}

/*public class outer2
{
	
}*/