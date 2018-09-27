package org.cvtc.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SphereTest {
	ShapeFactory shapeFactory = new ShapeFactory(new MessageBoxSub());
	Renderer sphere = shapeFactory.make(ShapeType.Sphere);
//	Sphere sphere = new Sphere(4.00f, new MessageBoxSub());
	
	@Test
	public void testSurfaceArea() {
		((Sphere) sphere).setRadius(4.00f);		
		assertEquals(201.062f, ((Sphere) sphere).surfaceArea(),0.0002);
		System.out.println("@Sphere Test1 - Correct SurfaceArea Value");
	}

	@Test
	public void testVolume() {
		((Sphere) sphere).setRadius(4.00f);
		assertEquals(268.0825731f, ((Sphere) sphere).volume(),0.0002);
		System.out.println("@Sphere Test2 - Correct Volume Value");

	}

	@Test
	public void testGetRadius() {
		((Sphere) sphere).setRadius(3.00f);
		assertEquals(3.00f, ((Sphere) sphere).getRadius(),0.0002);
		System.out.println("@Sphere Test3 - Correct Radius Value");
	
	}

	@Test
	public void testSphere() {
		((Sphere) sphere).setRadius(-2.00f);
		assertEquals(0.0f, ((Sphere) sphere).getRadius(), 0.0002);		
		System.out.println("@Sphere Test4 - Postive values allowed only");
	}
}
