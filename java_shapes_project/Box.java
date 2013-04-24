
/**
 * Program Name: Box
 * Purpose:
 * Coder: Chris Tully, Devon Tully, Nichole Munavish
 */
public class Box extends Rectangle {
	  //data members
	private double height;
	
	public Box()
	{

		super.setLength(5.0);
		super.setWidth(5.0);
		super.setColor ("red");
		this.height= 5.0;
	}
	public Box( double length, double width, String color, double height, String Shape)
	{
		super(length,width,color,Shape);		
		this.height = height;
	}
	
	//getters and setters
	
	public double getHeight()
	{
		return height;
	}
	public void setheight(double newHeight)
	{
		this.height=newHeight;
	}
	
	public double calSurfaceArea()
	{
		return (2*(super.getLength()*super.getWidth())+ 2 *(super.getLength()*height)+ 2*(super.getWidth()*height));
	}
	public double calcVolume()
	{
		return (super.getLength()*super.getWidth()*height);
	}
	
	public String toString()
	{
	 return "This object is a box object with a width of " +super.getWidth()+ " a length of " + super.getLength() +" and a height of " + height;	
	}
	}
