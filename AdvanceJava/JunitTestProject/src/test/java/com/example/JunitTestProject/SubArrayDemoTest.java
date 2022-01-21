package com.example.JunitTestProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubArrayDemoTest {

	SubArrayDemo aa= new SubArrayDemo();
	@Test
	public void subBtnArrayTest() {
		assertArrayEquals(new int[] {30,25,40,32,31,35}, aa.subBtnArray());
	}
}
