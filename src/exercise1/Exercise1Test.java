package exercise1;

import classes.Box;
import classes.Cat;
//import matryoshka.RussianCat;
//import matryoshka.RussianBox;

import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise1Test {
	
	@Test
	public void testAdd() {
		double delta = 0.000000000000000000001;
		// delta is the tolerance for floating point operation errors
		
		assertEquals(3.0, Exercise1.add(1, 2), delta);
		assertEquals(3.5, Exercise1.add(1, 2.5), delta);
		assertEquals(-1.0, Exercise1.add(1, -2.0), delta);
	}

	@Test
	public void testSnooze() {
		assertTrue(Exercise1.snooze(false, false));
		assertTrue(Exercise1.snooze(false, true));
		assertTrue(Exercise1.snooze(true, true));
		
		assertFalse(Exercise1.snooze(true, false));
	}

	@Test
	public void testRepeat() {
		assertEquals("Hi", Exercise1.repeat("Hi", 1));
		assertEquals("HiHi", Exercise1.repeat("Hi", 2));
		assertEquals("HiHiHi", Exercise1.repeat("Hi", 3));
		assertEquals("", Exercise1.repeat("Hi", 0));
	}

	@Test
	public void testFirst() {
		int[] values = {5, 4, 3, 2, 1};
		assertEquals(5, Exercise1.first(values));
	}

	@Test
	public void testLast() {
		int[] values = {5, 4, 3, 2, 1};
		assertEquals(1, Exercise1.last(values));
	}

	@Test
	public void testRange() {
		int[] values = {0};
		assertArrayEquals(values, Exercise1.range(1));
		
		values = new int[]{0, 1, 2, 3, 4, 5, 6};
		assertArrayEquals(values, Exercise1.range(7));
	}

	@Test
	public void testReduceProduct() {
		int[][] values = {{-1, 2, 3}, {4, 5, 6}};
		assertEquals(-720, Exercise1.reduceProduct(values));
		
		values = new int[][]{{2}, {5}, {10}};
		assertEquals(100, Exercise1.reduceProduct(values));
	}

	@Test
	public void testMakeKitty() {
		Cat cat = Exercise1.makeKitty();
		// Try to assert that your cat has the name you gave it.
	}

	
	@Test
	public void testKindaEqual() {
		assertTrue(Exercise1.kindaEqual("HI!", "hi!"));
		assertTrue(Exercise1.kindaEqual("", ""));
		
		assertFalse(Exercise1.kindaEqual("...wat", "wat"));
	}
	
	@Test
	public void testReverseHalves() {
		assertEquals("dam", Exercise1.reverseHalves("mad"));
		assertEquals("oplo", Exercise1.reverseHalves("loop"));
	}
	
	@Test
	public void testInvertCase() {
		assertEquals("tHIS IS A tEST", Exercise1.reverseHalves("This is a Test"));
		assertEquals(".Ok!", Exercise1.reverseHalves(".oK!"));
	}
	
	@Test
	public void testSwap() {
		char[] quiet = {'q', 'u', 'i', 'e', 't'};
		char[] quite = {'q', 'u', 'i', 't', 'e'};
		
		// Check if chars have been swapped
		assertArrayEquals(quite, Exercise1.swap(quiet, 4, 3));
		// Check for in-place manipulation
		assertEquals(quiet, Exercise1.swap(quiet, 4, 3));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(1, Exercise1.factorial(1));
		assertEquals(2, Exercise1.factorial(2));
		assertEquals(120, Exercise1.factorial(5));
	}
}
