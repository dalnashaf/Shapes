package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	Cylinder cylinder = new Cylinder(2.00f, 2.00f, new MessageBoxSub());
	@Test
	public void testSurfaceArea() {
		assertEquals(50.26548f, cylinder.surfaceArea(),0.0002);
		System.out.println("@Cylinder Test1 - Correct SurfaceArea Value");
	}

	@Test
	public void testVolume() {		
		assertEquals(25.13274f, cylinder.volume(),0.0002);
		System.out.println("@Cylinder Test2 - Correct Volume Value");
	}

	@Test
	public void testGetRadius() {
		cylinder.setRadius(5.00f);
		assertEquals(5.00f, cylinder.getRadius(),0.0002);
		System.out.println("@Cylinder Test3 - Correct Radius Value");
	}

	@Test
	public void testGetHeight() {
		cylinder.setHeight(166f);
		assertEquals(166f, cylinder.getHeight(),0.0002);
		System.out.println("@Cylinder Test4 - Correct Radius Value");
	}

	@Test
	public void testCylinder() {
		cylinder.setRadius(-88.00f);
		cylinder.setHeight(-6f);
		assertEquals(0.0f, cylinder.getRadius(),0.0002);
		assertEquals(0.0f, cylinder.getHeight(),0.0002);
		System.out.println("@Cylinder Test5 - Postive values allowed only");
	}

}
