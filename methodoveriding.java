class car
{
	int gears;
	boolean x;
	
	 void start()
	{
		System.out.println("The car is Started");
	}
	
	 void accelerate()
	{
		
		System.out.println("Throttle more to increase the speed");
	}
	
	 int changeGear(int gears) {
		this.gears = gears;
		System.out.println("The current working gear is : "+gears);
		return gears;
	}	
}

class LuxuryCar extends car{
	
	void openRoof(boolean x)
	{
		this.x=x;
		if (x==true)
		{
			System.out.println("Roof is Open");
		}
		else
		{
			System.out.println("Roof is Closed");
		}
	}
	@Override
	int changeGear(int gears)
	{
		System.out.println("Automatic gear");
		return gears;
	}
	
}

public class methodoveriding {

	public static void main(String[] args) {
		
	LuxuryCar c = new LuxuryCar();
	
	c.start();
	c.accelerate();
	c.changeGear(2);
	c.openRoof(true);	
	}

}
