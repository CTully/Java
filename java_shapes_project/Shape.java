/**
 Program Name:Shape.java
Purpose:
Coder: Chris Tully,Devon Tully, Nichole Munavish
Date:Mar 8, 2011
 */

public abstract class Shape
{
	
	//defining the variables
	private String type;
	private String color;
	
	//Constructors
	
	 public Shape()
	 {
		 
	 }
	
	public Shape(String type, String color)
	{
		this.setType(type);
		this.color=color;
	}
	
	//getters and setters
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
		//creating the abstract
	//!--Is this part right? Do we need to
	//spefify that it's static?--!
	
	public  abstract double calcPerimeter();
	
	public  abstract double calcSurfaceArea();
	
	public abstract String toString();


	
}//end class