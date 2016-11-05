package org.wc2442.interview.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReserveString {

	@Test
	public void test() {
		assertEquals("", ReverseString.reverse(""));
		assertEquals("o", ReverseString.reverse("o"));
		assertEquals("lo", ReverseString.reverse("ol"));		
		assertEquals("oleh", ReverseString.reverse("helo"));
		assertEquals("olleh", ReverseString.reverse("hello"));
	}

}
