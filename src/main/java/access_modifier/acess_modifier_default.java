package access_modifier;

 class acess_modifier_default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		default1 dobj = new default1();
		dobj.defaultmethod();
		
		acess_modifier_default obj3 =new acess_modifier_default();
		obj3.defaultdisplay();
	}
		 void defaultdisplay()
		{
			System.out.println("print same class from same package");
		}
	
		
	}

 class default1
 {
	 void defaultmethod()   //access default
	 {
			System.out.println("print another class from same package");

	 }
 }