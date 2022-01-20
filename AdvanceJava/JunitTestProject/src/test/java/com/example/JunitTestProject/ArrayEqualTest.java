package com.example.JunitTestProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayEqualTest {
	ArrayEqual aa= new ArrayEqual();
	@Test
	public void testArray() {
		assertArrayEquals(new int[] {5,7,9}, aa.arrayDemoTest());
	}

}
