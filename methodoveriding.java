class fatherbusiness{
	
	void payment(int amount,String mode)
	{
		 System.out.println("father business model");
		
	}
}
class sonbusiness extends fatherbusiness
{
	void payment(int amount,String mode)
	{
		System.out.println("son's business model");
	}
}

public class methodoveriding {

	public static void main(String[] args) {
		
		fatherbusiness obj1 = new fatherbusiness();
		fatherbusiness obj2 = new sonbusiness();
		obj1.payment(5000, "Rahul");
		obj2.payment(2000, "cheque");
	}

}
