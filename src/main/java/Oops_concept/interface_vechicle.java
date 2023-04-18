package Oops_concept;

 interface interface_vechicle1 {
	//all abstract methods
	abstract void Vname();
	abstract void Vspeedup();
	 void Vbreak();
	 
}
class bicycle implements interface_vechicle1
{
	public void Vname() {
		// TODO Auto-generated method stub
		System.out.println("Vname in bicycle");
	}
	public void Vspeedup() {
		// TODO Auto-generated method stub
		System.out.println("Vspeedup in bicycle ");
	}
	public void Vbreak() {
		// TODO Auto-generated method stub
		System.out.println("Vbreak in bicycle");
	}
	
}
class bike implements interface_vechicle1
{
	public void Vname() {
		// TODO Auto-generated method stub
		System.out.println("Vname in bike");
	}
	public void Vspeedup() {
		// TODO Auto-generated method stub
		System.out.println("Vspeedup in bike ");
	}
	public void Vbreak() {
		// TODO Auto-generated method stub
		System.out.println("Vbreak in bike");
	}
	
}
 class interface_vechicle 
{
    public static void main (String[] args) {

	bicycle b = new bicycle();
	b.Vname();
	b.Vbreak();
	b.Vspeedup();
	
	bike b1 = new bike();
	b1.Vbreak();
	b1.Vname();
	b1.Vspeedup();
   }
    
}