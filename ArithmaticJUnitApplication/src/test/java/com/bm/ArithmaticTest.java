package com.bm;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticTest {
	
	ArithmaticApplication a1 = new ArithmaticApplication();
	
	@Test
	public void addTest(){
		Assert.assertEquals(9, a1.add(5, 4));
	}
	
	@Test
	public void subTest(){
		Assert.assertEquals(6, a1.sub(15, 9));
	}
	
	@Test
	public void multTest(){
		Assert.assertEquals(45, a1.mult(5, 9));
	}
	
	@Test
	public void divTest(){
		Assert.assertEquals(6, a1.div(54, 9));
	}
}
