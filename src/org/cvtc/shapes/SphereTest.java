package org.cvtc.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SphereTest {
	Sphere sphere = new Sphere(4.00f, new MessageBoxSub());
	@Test
	public void testSurfaceArea() {
		assertEquals(201.062f, sphere.surfaceArea(),0.0002);
		System.out.println("@Sphere Test1 - Correct SurfaceArea Value");
	}

	@Test
	public void testVolume() {
		assertEquals(268.0825731f, sphere.volume(),0.0002);
		System.out.println("@Sphere Test2 - Correct Volume Value");

	}

	@Test
	public void testGetRadius() {
		sphere.setRadius(3.00f);
		assertEquals(3.00f, sphere.getRadius(),0.0002);
		System.out.println("@Sphere Test3 - Correct Radius Value");
	
	}

	@Test
	public void testSphere() {
		sphere.setRadius(-2.00f);
		assertEquals(0.0f, sphere.getRadius(), 0.0002);		
		System.out.println("@Sphere Test4 - Postive values allowed only");
	}
}
