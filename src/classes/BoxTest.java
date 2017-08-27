package classes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BoxTest {

	static Cat cat1;
	static Cat cat2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cat1 = new Cat("cat1");
		cat2 = new Cat("cat2");
	}

	@Test
	public void testBox() {
		Box box = new Box(cat1);
		assertEquals(cat1, box.cat);
	}

	@Test
	public void testGetCat() {
		Box box = new Box(cat1);
		assertEquals(cat1, box.getCat());
	}

	@Test
	public void testSetCat() {
		Box box = new Box(cat1);
		box.setCat(cat2);
		assertEquals(cat2, box.cat);
	}
}
