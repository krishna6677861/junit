package com.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Test;

public class Assertpro {
	
	Calculator c=new Calculator();
	
	@Test
	public void gettest() {
		assertEquals(c.getadd(10,20),30);
	}
	
	@Test
	public void getsub() {
		assertNotEquals(c.getsub(30, 20), 10);
	}

}
