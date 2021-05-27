class Subject{
	////////// Instance Variables ////////////
	int subid;
	String name;
	final int maxmarks = 10;
	int marksobtained;
	/////////////// getter setters //////////////
	public int getSubId()
	{
		return subid;
	}
	
	public void setSubId(int id)
	{
		this.subid = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getMarksobtained() 
	{
		return marksobtained;
	}

	public void setMarksobtained(int marksobtained)
	{
		this.marksobtained = marksobtained;
	}

	public int getMaxmarks()
	{
		return maxmarks;
	}
	
	/////////////////////// Constructors /////////////////////
	public Subject(int id,String name,int marksobtained,int maxmarks) 
	{
		this.setSubId(id);
		this.setName(name);
		this.setMarksobtained(marksobtained);
		this.getMaxmarks();
		
	}
	
	public Subject(String name,int id)
	{
		this.setName(name);
		this.setSubId(id);
	}
	
	public String toString()
	{
		return "\n Subject Id : "+subid+"\n Name : "+name+"\n Marks Obtained : "+marksobtained;
	}
	
}
//////////////////////////// Class ends /////////////////////////
public class CollegeArrayObject 
{

	public static void main(String[] args)
	{
		Subject subs[] = new Subject[2];
		subs[0]= new Subject(1,"OS",78,100);
		subs[1]= new Subject(2,"DS",72,100);
		for(Subject calls:subs) 
		{
			System.out.println(calls);
		}
		
		

	}

}
