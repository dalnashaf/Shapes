/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author danya
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a Cuboid object 
		Cuboid cuboid= new Cuboid(10, 10, 10,new MessageBox());
		// Create a Cylinder object 
		Cylinder cylinder = new Cylinder(10, 10,new MessageBox());
		// Create a Sphere object 
		Sphere sphere = new Sphere(10, new MessageBox());
		
		// Call the render method for each object we've created
		cuboid.render();
		cylinder.render();
		sphere.render();
	}
}
