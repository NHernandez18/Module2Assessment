package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ThirdModulusCalc;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 8, 2023
 */
public class test2 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ThirdModulusCalc obj1 = new ThirdModulusCalc();
		assertFalse(obj1.ThirdModulus(10)== 2);
	}

}
