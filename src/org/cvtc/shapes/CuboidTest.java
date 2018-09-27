package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {
	ShapeFactory shapeFactory = new ShapeFactory(new MessageBoxSub());
	Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
//	Cuboid cuboid = new Cuboid(3.00f, 3.00f, 3.00f, new MessageBoxSub());
	@Test
	public void testSurfaceArea() {
		((Cuboid) cuboid).setHeight(3.00f);
		((Cuboid) cuboid).setWidth(3.00f);
		((Cuboid) cuboid).setDepth(3.00f);
		assertEquals(54f, ((Cuboid) cuboid).surfaceArea(),0.0002);
		System.out.println("@Cuboid Test1 - Correct SurfaceArea Value");
	}

	@Test
	public void testVolume() {
		((Cuboid) cuboid).setHeight(3.00f);
		((Cuboid) cuboid).setWidth(3.00f);
		((Cuboid) cuboid).setDepth(3.00f);
		assertEquals(27f, ((Cuboid) cuboid).volume(),0.0002);
		System.out.println("@Cuboid Test2 - Correct Volume Value");

	}

	@Test
	public void testGetWidth() {
		((Cuboid) cuboid).setWidth(5.00f);
		assertEquals(5.00f, ((Cuboid) cuboid).getWidth(),0.0002);
		System.out.println("@Cuboid Test3 - Correct Width Value");
	}

	@Test
	public void testGetHeight() {
		((Cuboid) cuboid).setHeight(15.00f);
		assertEquals(15.00f, ((Cuboid) cuboid).getHeight(),0.0002);
		System.out.println("@Test4 - Correct Height Value");
	}

	@Test
	public void testGetDepth() {
		((Cuboid) cuboid).setDepth(36.00f);
		assertEquals(36.00f, ((Cuboid) cuboid).getDepth(),0.0002);
		System.out.println("@Cuboid Test5 - Correct Depth Value");
	}
	
	@Test
	public void testCuboid() {
		((Cuboid) cuboid).setWidth(-8.00f);
		((Cuboid) cuboid).setHeight(-7.00f);
		((Cuboid) cuboid).setDepth(-9.f);
		assertEquals(0.0f, ((Cuboid) cuboid).getWidth(), 0.0002);
		assertEquals(0.0f, ((Cuboid) cuboid).getHeight(), 0.0002);
		assertEquals(0.0f, ((Cuboid) cuboid).getDepth(), 0.0002);
		System.out.println("@Cuboid Test6 - Postive values allowed only");
	}
}
