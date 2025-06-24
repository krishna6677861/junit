package com.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalciTesting {
	
	Calculator c=new Calculator();
	
	@Before
	public void getbefore() {
		System.out.println("before testing");
	}
	
	@Test
	public void getaddtest() {
		c.getadd(5,56);
	}
	
	@Test
	public void getsub() {
		c.getsub(40,20);
	}
	
	@Test
	public void getmulti() {
		c.getmulti(2,4);
	}
	
	@Test
	public void getdiv() {
		c.getdiv(40,10);
	}
	
	@After
	public void getafter() {
		System.out.println("after testing");
	}

}
