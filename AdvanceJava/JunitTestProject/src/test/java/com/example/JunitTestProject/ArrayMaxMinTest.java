package com.example.JunitTestProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMaxMinTest {
			ArrayMaxMin AM =new ArrayMaxMin();
			@Test
			public void maxDiffTest() {
				assertEquals(20,AM.maxDiff());
			}
			@Test
			public void minDiffTest() {
				assertEquals(1,AM.minDiff());
			}

}
