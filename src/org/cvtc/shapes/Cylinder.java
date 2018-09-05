/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author danya
 *
 */
public class Cylinder extends Shape {
	//create a private float variable to store the radius' value 
	private float radius = 0.0f;
	//create a private float variable to store the height's value 
	private float height = 0.0f;
	/**
	 * @return the radius
	 */
	public float getRadius() {
		// double check the entered radius not negative using if clause, and set back to 0 if it was.
		if(radius <0) {
			radius = 0.0f;
		}
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		// double check the entered height not negative using if clause, and set back to 0 if it was.
		if(height <0) {
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
	
	@Override
	public float surfaceArea() {
		// Cylinder's surface area =2πrh+2πr2		
		return (float) ((2 * Math.PI * getRadius() * getHeight()) + (2 * Math.PI * Math.pow(getRadius(), 2)));
	}
	@Override
	public float volume() {
		// Cylinder's volume = πr2h	
		return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	}
	@Override
	public void render() {
		// Show dialog box with a title Cylinder.
		// The box contains the dimensions, surface area, and volume for the Cylinder's object if the render method called.  
		JOptionPane.showMessageDialog(null, "Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Radius: " + getRadius() + "\n Height: " + getHeight(), "Cylinder", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	//When the object is created, Java calls the constructor first.
	//Any code you have in your constructor will then get executed.
	//You don't need to make any special calls to a constructor method - 
	//they happen automatically when you create a new object. 
	//Constructor methods take the same name as the class.
	public Cylinder(float raduis ,float height) {
		setRadius(raduis);
		setHeight(height);		
	}	
}
