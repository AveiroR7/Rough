class parent{
	
	public void func() {
		System.out.println("This is parent Class");
	}
}

class child extends parent{
	
	public void method() {
		System.out.println("This is Child Class with additional feature");
	}
}


public class inheritance {
	
	

	public static void main(String[] args) {
		
		child obj = new child();
		obj.func();
		obj.method();
		

	}

}
