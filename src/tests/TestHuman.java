package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import controller.Human;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class TestHuman {
	Human human = new Human();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test // Testing name with the assertEquals method
	public void testName() {
		assertEquals("James", "James");
	}
	
	@Test // testing age with the assertNotEquals Method
	public void testAge() {
		assertNotEquals(51, 50);
	}
	
	@Test // testing weight with the assertNull/NotNull Methods
	public void testWeight() {
		assertNull(null, null);
		assertNotNull(null, 201.97);
	}
	
	@Test
	public void tesDuplicateValue() { // testing for duplicate values with the assertTrue/False method
		assertTrue(human.hasDuplicateValue("j"));
		assertFalse(human.hasDuplicateValue("r"));
		
	}

}
