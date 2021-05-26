
public class varargs {
	static void show(int...x)
	{
		for(int a:x)
		{
			System.out.print(" "+a+" ");
		}
		System.out.println(" ");
	}
	public static void main(String...args) {
		
		
		show();
		show(10);
		show(10,20);
		show(10,20,20,30,40);
		show(10,20,80,34,234,123,5,6,43);
		show(new int[] {10,24,23}); // for anonymous array
		
	}

}
