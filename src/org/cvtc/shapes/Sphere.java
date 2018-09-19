/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author danya
 *
 */
public class Sphere extends Shape implements Renderer {
	//create a private float variable to store the radius' value 
	private float radius;

	/**
	 * @return the radius
	 */
	public float getRadius() {
		// double check the entered radius not negative using if clause, and set back to 0 if it was.
		if(radius < 0) {
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
	
	@Override
	public float surfaceArea() {
		//Sphere's Surface Area = 4πr2
		return (float) (4 * Math.PI * Math.pow(getRadius(), 2 ));
	}

	@Override
	public float volume() {
		//sphere's volume= 4/3 πr3
		return (float) (( 4.0 / 3.0 ) * Math.PI * Math.pow( getRadius(), 3));
	}

	public void render() {
		// Show dialog box with a title Sphere.
		//The box contains the dimensions, surface area, and volume for the Sphere's object if the render method called. 
		//JOptionPane.showMessageDialog(null, "Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n"+ "Dimensions: \n Radius: " + getRadius() , "Sphere", JOptionPane.INFORMATION_MESSAGE);
		String message = "Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n"+ "Dimensions: \n Radius: " + getRadius();
		this.dialog.Show(message, "Sphere");
	}
	
	//When the object is created, Java calls the constructor first.
	//Any code you have in your constructor will then get executed.
	//You don't need to make any special calls to a constructor method - 
	//they happen automatically when you create a new object. 
	//Constructor methods take the same name as the class.
	
	public Sphere(float raduis, Dialog dialog) {
		super(dialog);
		setRadius(raduis);
	}
}
