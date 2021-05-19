class parent{  // base class
	
	public void func() {
		System.out.println("This is parent Class");
	}
}

class child extends parent{  // derived class
	
	public void method() {
		System.out.println("This is Child Class with additional feature");
	}
}


public class inheritance {
	
	

	public static void main(String[] args) {
		
		child obj = new child();  // creating new object of the child class so that we can extract its extended feature and after that we are allocating memory.
		obj.func();
		obj.method();
		

	}

}
