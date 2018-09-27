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
		ShapeFactory shapeFactory = new ShapeFactory(new MessageBox());
//		// Create a Cuboid object 
//		Cuboid cuboid= new Cuboid(10, 10, 10,new MessageBox());
//		// Create a Cylinder object 
//		Cylinder cylinder = new Cylinder(10, 10,new MessageBox());
//		// Create a Sphere object 
//		Sphere sphere = new Sphere(10, new MessageBox());
		
		// Call the render method for each object we've created

		
		Renderer cuboid1 = shapeFactory.make(ShapeType.Cuboid);
		
		Renderer cylinder1 = shapeFactory.make(ShapeType.Cylinder);
		
		Renderer sphere1 = shapeFactory.make(ShapeType.Sphere);
		
		cuboid1.render();
		cylinder1.render();
		sphere1.render();

	}
}
