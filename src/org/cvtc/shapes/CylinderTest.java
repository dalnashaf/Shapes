package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

//	Cylinder cylinder = new Cylinder(2.00f, 2.00f, new MessageBoxSub());
	ShapeFactory shapeFactory = new ShapeFactory(new MessageBoxSub());
	Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
	@Test
	public void testSurfaceArea() {
		((Cylinder) cylinder).setRadius(2.00f);
		((Cylinder) cylinder).setHeight(2.00f);
		assertEquals(50.26548f, ((Cylinder) cylinder).surfaceArea(),0.0002);
		System.out.println("@Cylinder Test1 - Correct SurfaceArea Value");
	}

	@Test
	public void testVolume() {	
		((Cylinder) cylinder).setRadius(2.00f);
		((Cylinder) cylinder).setHeight(2.00f);
		assertEquals(25.13274f, ((Cylinder) cylinder).volume(),0.0002);
		System.out.println("@Cylinder Test2 - Correct Volume Value");
	}

	@Test
	public void testGetRadius() {
		((Cylinder) cylinder).setRadius(5.00f);
		assertEquals(5.00f, ((Cylinder) cylinder).getRadius(),0.0002);
		System.out.println("@Cylinder Test3 - Correct Radius Value");
	}

	@Test
	public void testGetHeight() {
		((Cylinder) cylinder).setHeight(166f);
		assertEquals(166f, ((Cylinder) cylinder).getHeight(),0.0002);
		System.out.println("@Cylinder Test4 - Correct Radius Value");
	}

	@Test
	public void testCylinder() {
		((Cylinder) cylinder).setRadius(-88.00f);
		((Cylinder) cylinder).setHeight(-6f);
		assertEquals(0.0f, ((Cylinder) cylinder).getRadius(),0.0002);
		assertEquals(0.0f, ((Cylinder) cylinder).getHeight(),0.0002);
		System.out.println("@Cylinder Test5 - Postive values allowed only");
	}

}
