package com.rocio.testing.testp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rocio.herokuu.ForTesting;

public class Apptest {

	ForTesting suma = null;
	
	@Before
	public void initialize() {
		suma = new ForTesting();
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented")
		int expected = 4;
		assertEquals(expected, suma.suma2(2, 2));
	}
	}


