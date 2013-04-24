/**
 Program Name:Rectangle.java
Purpose:
Coder: Chris Tully,Devon Tully,Nichole Munavish
DUE Date:Mar 11th, 2011
 */

public class Rectangle extends Shape
{
	//variables
	private double length;
	private double width;
	
	//constructors
	Rectangle()
	{
		this.length = 1.0;
		this.width = 1.0;
		super.setColor ("black");
	}
	
	Rectangle(double width, double length, String color, String Shape)
	{
		super(color, Shape);
		this.length=length;
		this.width=width;
		
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}
	
	//abstract methods 
	public double calcPerimeter()
	{
		return 2*(length+width);
	}
	
	public double calcSurfaceArea()
	{
		return length*width;
	}
	
	public String toString()
	{
		return "This object is a " + super.getType() + " object and it's color is"+super.getColor()+". This Rectangle has a width of " + width +" and a length of "+length;
	}
	
	
	
}//end class