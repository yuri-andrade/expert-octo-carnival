package s2b.tst.sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test(expected=IllegalArgumentException.class)
	public void testFirstNumberIsNegativeGivesException() {
		Sum.sum(-10, 0);
	}	

	@Test(expected=IllegalArgumentException.class)
	public void testSecondNumberIsNegativeGivesException() {
		Sum.sum(0, -10);
	}	
	
	@Test
	public void testThatZeroPlusZeroIsZero() {
		double expected = 0;
		double actual = Sum.sum(0, 0);
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testThatOnePlusZeroIsOne() {
		double expected = 1;
		double actual = Sum.sum(1, 0);
		assertEquals(expected, actual, 0.01);
	}	

	@Test
	public void testThatHalfPlusHalfIsOne() {
		double expected = 1;
		double actual = Sum.sum(0.5, 0.5);
		assertEquals(expected, actual, 0.01);
	}	
	
}
