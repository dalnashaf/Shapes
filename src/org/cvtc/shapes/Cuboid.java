/**
 * 
 */
package org.cvtc.shapes;
/**
 * @author danya
 *
 */
public class Cuboid extends Shape implements Renderer {
	//create a private float variable to store the width's value 
	private float width = 0.0f;
	//create a private float variable to store the height's value 
	private float height = 0.0f;
	//create a private float variable to store the depth's value 
	private float depth = 0.0f;
	
	/**
	 * @return the width
	 */
	public float getWidth() {
		// double check the entered width not negative using if clause, and set back to 0 if it was.
		if(width < 0) {
			width = 0.0f;
		}
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		// double check the entered height not negative using if clause, and set back to 0 if it was.
		if(height < 0) {
			height = 0.0f;
		}
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	/**
	 * @return the depth
	 */
	public float getDepth() {
		// double check the entered depth not negative using if clause, and set back to 0 if it was.
		if (depth < 0) {
			depth = 0.0f;
		}
		return depth;
	}
	/**
	 * @param depth the depth to set
	 */
	public void setDepth(float depth) {
		this.depth = depth;
	}
	@Override
	public float surfaceArea() {
		//Cuboid's surface area =2lw+2lh+2hw
		return (2 * getDepth() * getWidth() )+ (2 * getDepth() * getHeight() )+ (2 * getHeight() * getWidth());
	}
	@Override
	public float volume() {
		// Volume of a cuboid = (length × breadth × height)
		return getDepth() * getWidth() * getHeight(); 
	}
	
	public int render() {
		// Show dialog box with a title Cuboid. 
		//This box contains the dimensions, surface area, and volume for the Cuboid's object if the render method called. 
		//JOptionPane.showMessageDialog(null, "Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Depth: " + getDepth() + "\n Height: " + getHeight() + "\n Width: " + getWidth(), "Cuboid", JOptionPane.INFORMATION_MESSAGE);					
		String message = "Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Depth: " + getDepth() + "\n Height: " + getHeight() + "\n Width: " + getWidth();
	 return	this.dialog.Show(message, "Cylinder");
	}
	
	//When the object is created, Java calls the constructor first.
	//Any code you have in your constructor will then get executed.
	//You don't need to make any special calls to a constructor method - 
	//they happen automatically when you create a new object. 
	//Constructor methods take the same name as the class.
	public Cuboid(float width, float height, float depth, Dialog dialog) {
		super(dialog); 			
		setWidth(width);
		setHeight(height);
		setDepth(depth);		
	}
}
