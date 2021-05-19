
class acc {

	private void privateFunc() 
	{ 
		System.out.println("private Function"); 
		}
	
	public void pubFunc() {
		
		System.out.println("public function");
	}
	void defaultFunc() {
		
		System.out.println("Default function");
	}
	
	protected void proFunc() {
		
		System.out.println("Protected function");
	}
}

public class accessModifiers{
	

	public static void main(String[] args) {
		
		acc AM = new acc();
		AM.defaultFunc();
		AM.proFunc();
		AM.pubFunc();
		

	}
}
	
	


