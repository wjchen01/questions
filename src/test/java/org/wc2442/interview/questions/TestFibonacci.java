package org.wc2442.interview.questions;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestFibonacci {

	@Test
	public void testSequence() {
		assertEquals(Arrays.asList(), Fibonacci.sequence(0));
		assertEquals(Arrays.asList(0), Fibonacci.sequence(1));
		assertEquals(Arrays.asList(0, 1), Fibonacci.sequence(2));
		assertEquals(Arrays.asList(0, 1, 1), Fibonacci.sequence(3));
		assertEquals(Arrays.asList(0, 1, 1, 2), Fibonacci.sequence(4));
		assertEquals(Arrays.asList(0, 1, 1, 2, 3), Fibonacci.sequence(5));
		assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), Fibonacci.sequence(6));
		assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.sequence(7));
		assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), Fibonacci.sequence(8));
	}

	@Test
	public void testValue() {
		assertEquals(new Integer(1134903170), Fibonacci.value(45));
	}
}
