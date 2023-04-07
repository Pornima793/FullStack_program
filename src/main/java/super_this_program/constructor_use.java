package super_this_program;

public class constructor_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pornima p1 = new pornima(); //construcot var automatically 
		p1.print();
	}

}
 class pornima
 {
	 pornima()  //constructor
	 {
		 System.out.println("printing message from constructor");
		 print();
	 }
	 public void print()
	 {
		 System.out.println("print message from method from class");
	 }
 }