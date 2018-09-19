package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {
	
	Cuboid cuboid = new Cuboid(3.00f, 3.00f, 3.00f, new MessageBoxSub());
	@Test
	public void testSurfaceArea() {
		assertEquals(54f, cuboid.surfaceArea(),0.0002);
		System.out.println("@Cuboid Test1 - Correct SurfaceArea Value");
	}

	@Test
	public void testVolume() {
		assertEquals(27f, cuboid.volume(),0.0002);
		System.out.println("@Cuboid Test2 - Correct Volume Value");

	}

	@Test
	public void testGetWidth() {
		cuboid.setWidth(5.00f);
		assertEquals(5.00f, cuboid.getWidth(),0.0002);
		System.out.println("@Cuboid Test3 - Correct Width Value");
	}

	@Test
	public void testGetHeight() {
		cuboid.setHeight(15.00f);
		assertEquals(15.00f, cuboid.getHeight(),0.0002);
		System.out.println("@Test4 - Correct Height Value");
	}

	@Test
	public void testGetDepth() {
		cuboid.setDepth(36.00f);
		assertEquals(36.00f, cuboid.getDepth(),0.0002);
		System.out.println("@Cuboid Test5 - Correct Depth Value");
	}
	
	@Test
	public void testCuboid() {
		cuboid.setWidth(-8.00f);
		cuboid.setHeight(-7.00f);
		cuboid.setDepth(-9.f);
		assertEquals(0.0f, cuboid.getWidth(), 0.0002);
		assertEquals(0.0f, cuboid.getHeight(), 0.0002);
		assertEquals(0.0f, cuboid.getDepth(), 0.0002);
		System.out.println("@Cuboid Test6 - Postive values allowed only");
	}
}
