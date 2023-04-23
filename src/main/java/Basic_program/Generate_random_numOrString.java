package Basic_program;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Generate_random_numOrString {

	public static void main(String[] args) {
		//approach 1 -random
		Random ran =new Random();
		int rannum= ran.nextInt(100);
		System.out.println(rannum);
		
		 double randl = ran.nextDouble();  //0.0 to less than 1
		 System.out.println(randl);
		 
		 //approach 2- using math class
		 System.out.println(Math.random());
		 
		 //approach 3- apache commas APi
	// string str =	 RandomStringUtils.randomNumeric(5);   ---randomalphabetic(10)
		 //		 System.out.println(str);

		 
	}

}
