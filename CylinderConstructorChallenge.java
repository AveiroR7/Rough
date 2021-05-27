class Cylinder
{
	private double radius;
	private double height;
	
	public Cylinder() 
	{
		this.radius =0;
		this.height =0;
	}
	
	public Cylinder(double r) 
	{
		this.radius = r;
		this.height = 1;
	}
	
	public Cylinder(double r,double h)
	{
		this.radius =r;
		this.height = h;
	}
	
	double getRadius() 
	{
		return radius;
	}
	
	void setRadius(double r)
	{
		this.radius = r;
	}
	
	double getHeight() 
	{
		return height;
	}
	
	void setHeight(double h)
	{
		this.height = h;
	}
	
	void setDimensions(double r,double h)
	{
		this.radius = r;
		this.height = h;
	}
	
	public double cyc() {
		setDimensions(radius,height);
		double volume =2*Math.PI*radius*height; 
		return volume;
	}
}

public class CylinderConstructorChallenge {

	public static void main(String...args) 
	{
		Cylinder c = new Cylinder();
		c.setDimensions(5,10);
		System.out.println("Volume of Cylinder: "+c.cyc());
			
	}

}
