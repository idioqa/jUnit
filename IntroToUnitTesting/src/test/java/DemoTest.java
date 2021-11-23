import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
	@Test
	public void test_is_triangle1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	@Test
	public void test_is_triangle2() {
		assertTrue(Demo.isTriangle(5, 3, 4));
	}
	@Test
	public void test_is_triangle3() {
		assertTrue(Demo.isTriangle(5, 4, 3));
	}
	@Test
	public void test_is_triangle4() {
		assertTrue(Demo.isTriangle(12, 13, 5));
	}
	@Test
	public void test_is_triangle5() {
		assertTrue(Demo.isTriangle(13, 14, 5));
	}
	@Test
	public void test_is_triangle6() {
		assertTrue(Demo.isTriangle(5, 14, 15));
	}
	@Test
	public void test_is_triangle7() {
		assertTrue(Demo.isTriangle(3.5, 4, 5));
	}
	@Test
	public void test_is_triangle8() {
		assertTrue(Demo.isTriangle(3, 4.5, 5));
	}
	
	@Test
	public void test_is_triangle10() {
		assertFalse(Demo.isTriangle(15, 1, 2));
	}
	
	@Test
	public void test_is_triangle11() {
		assertFalse(Demo.isTriangle(2, 15, 1));
	}
	
	@Test
	public void test_is_triangle12() {
		assertFalse(Demo.isTriangle(1, 14, 15));
	}
	
	@Test
	public void test_is_triangle13() {
		assertFalse(Demo.isTriangle(0, 15, 2));
	}
	
	@Test
	public void test_is_triangle14() {
		assertFalse(Demo.isTriangle(1, 0, 2));
	}
	
	@Test
	public void test_is_triangle15() {
		assertFalse(Demo.isTriangle(1, 15, 0));
	}
	
	@Test
	public void test_is_triangle16() {
		assertFalse(Demo.isTriangle(-3, 4, 5));
	}
	
	@Test
	public void test_is_triangle17() {
		assertFalse(Demo.isTriangle(3, -4, 5));
	}
	
	@Test
	public void test_is_triangle18() {
		assertFalse(Demo.isTriangle(3, 4, -5));
	}
	
	@Test
	public void main_test() {
		ByteArrayInputStream in = new ByteArrayInputStream("3\n4\n5\n".getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String args[] = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}
	 
}
