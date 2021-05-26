import java.util.*;


class Rectangle
{
	private int length;
	private int breadth;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int l)
	{
		this.length = l;
	}

	public int getBreadth()
	{
		return breadth;
	}

	public void setBreadth(int b) 
	{
		this.breadth = b;
	}

	
	
	int area()
	{
		return length*breadth;
	}
	
	int perimeter()
	{
		return 2*(length*breadth);
	}
	
}

class Datahiding {

	public static void main(String...args) 
	{
		Rectangle r = new Rectangle();
		r.setLength(15);
		r.setBreadth(5);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
	}
}
