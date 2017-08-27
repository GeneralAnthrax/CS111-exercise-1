package classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatTest {

	@Test
	public void testCat() {
		Cat cat = new Cat("Mr. Bigglesworth");
		assertEquals("Mr. Bigglesworth", cat.name);
	}
}
