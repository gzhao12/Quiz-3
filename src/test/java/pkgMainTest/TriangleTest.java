package pkgMainTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.TriangleException;
import pkgMain.Triangle;

public class TriangleTest {
	Triangle testTri = new Triangle();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = TriangleException.class)
	public void TestException() throws TriangleException {
		Triangle testTriException = new Triangle(1, 2, 99);
	}

	@Test
	public void getSide1Test() {
		assertTrue(testTri.getSide1() == 1.0);
	}

	@Test
	public void getSide2Test() {
		assertTrue(testTri.getSide2() == 1.0);
	}

	@Test
	public void getSide3Test() {
		assertTrue(testTri.getSide3() == 1.0);
	}

	@Test
	public void setSide1Test() {
		testTri.setSide1(3.0);
		assertTrue(testTri.getSide1() == 3.0);
	}

	@Test
	public void setSide2Test() {
		testTri.setSide1(4.0);
		assertTrue(testTri.getSide1() == 4.0);
	}

	@Test
	public void setSide3Test() {
		testTri.setSide1(5.0);
		assertTrue(testTri.getSide1() == 5.0);
	}

	@Test
	public void getAreaTest() {
		testTri.setSide1(3.0);
		testTri.setSide2(4.0);
		testTri.setSide3(5.0);
		assertTrue(testTri.getArea() == 6);
	}

	@Test
	public void getPerimeterTest() {
		assertTrue(testTri.getPerimeter() == 3.0);
	}

	@Test
	public void toStringTest() {
		assertTrue(testTri.toString().equals("Side1: 1.0, Side2: 1.0, Side3: 1.0"));
	}
}
