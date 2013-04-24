/**
 * Program Name: RectangleTest.java
 * Purpose: a test class to test methods of the Rectangle class
 * Coder: Chris Tully, Devon Tully, Nichole Munavish
  */

public class ShapesTest
{
	public static void main(String[] args)
	{
			
		// create an object
		Rectangle rect1 = new Rectangle();
		System.out.println("\nrect1 color is " + rect1.getColor());
		System.out.println("rect1 length is " + rect1.getLength());
		System.out.println("rect1 width is " + rect1.getWidth());
		
		
	//create an object 
		Rectangle rect2 = new Rectangle(5.0, 9.0, "red","Rectangle");
		
		System.out.println("\nrect2 color is " + rect2.getColor());
		System.out.println("rect2 length is " + rect2.getLength());
		System.out.println("rect2 width is " + rect2.getWidth());
	
		
		// setter methods on one object
		System.out.println("\n calling setters on rect3 object...");
		rect1.setColor("Blue");
		rect1.setLength(20.0);
		rect1.setWidth(15.0);
		
		//call the getters again 
		System.out.println("\nrect1 color is " + rect1.getColor());
		System.out.println("rect1 length is " + rect1.getLength());
		System.out.println("rect1 width is " + rect1.getWidth());
		System.out.println(" rect1 perimeter " + rect1.calcPerimeter());
		System.out.println("rext1 surfaceArea is" +rect1.calcSurfaceArea());
		System.out.println(rect1.toString());
	
		
		System.out.println(" rect2 perimeter is " + rect2.calcPerimeter());
		System.out.println("rect 2 surface area is" +rect2.calcSurfaceArea());
		System.out.println(rect2.toString());
		
		
		Box box1 = new Box();
		
		System.out.println("\nbox1 color is " + box1.getColor());
		System.out.println("box1 length is " + box1.getLength());
		System.out.println("box1 width is " + box1.getWidth());
		System.out.println("box1 area is " + box1.calcVolume());
		
		
		System.out.println("\n calling setters on box1object...");
		box1.setLength(15.0);
		box1.setWidth(10.0);
		box1.setheight(9.0);
		
		System.out.println("\nbox1 color is " + box1.getColor());
		System.out.println("box1 length is " + box1.getLength());
		System.out.println("box1 width is " + box1.getWidth());
		
		
		Box box2 = new Box(4.0,3.0,"purple",5.0,"Box");
		
		System.out.println("\nbox2 color is " + box2.getColor());
		System.out.println("box2 length is " + box2.getLength());
		System.out.println("box2 width is " + box2.getWidth());
		System.out.println("Box 2 height is" + box2.getHeight());
		System.out.println("box2 area is " + box2.calcVolume());
	
		System.out.println("box1 area is " + box1.calcVolume());
		System.out.println("box2 area is " + box2.calcVolume());
		System.out.println(" box1 perimeter is " + box1.calcPerimeter());
		System.out.println(" box2 perimeter is " + box2.calcPerimeter());
		System.out.println(" box1 surface area is" + box1.calcSurfaceArea());
		System.out.println(" box2 surface area is" + box2.calcSurfaceArea());
		System.out.println(box1.toString());
		System.out.println(box2.toString());
		
	}//end main
}//end class
