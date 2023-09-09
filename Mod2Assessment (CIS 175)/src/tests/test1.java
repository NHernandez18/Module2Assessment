package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ApplyExponent;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 8, 2023
 */
public class test1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ApplyExponent obj1 = new ApplyExponent();
		
		assertTrue(obj1.Exponent(2) == 4);
	}
	
	@Test
	public void test2() {
		ApplyExponent obj2 = new ApplyExponent();
		
		assertEquals(obj2.Exponent(9),81);
	}

}
