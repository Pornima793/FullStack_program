package String_Array_operations;

public class split_String {

	public static void main(String[] args) {
			String str ="pornimamuchate";
			//convert str to array
			String strarr[] =new String[str.length()];
			//store split letter in array 
			strarr= str.split("");
			for(int i=0; i<strarr.length-1; i++)
			{
			System.out.println(strarr[i]);
			}
	}

}
