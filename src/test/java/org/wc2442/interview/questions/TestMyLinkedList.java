package org.wc2442.interview.questions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyLinkedList {

	private MyLinkedList one;
	
	@Before
	public void setUp() throws Exception {
		MyLinkedList three = new MyLinkedList(3, null);
		MyLinkedList two = new MyLinkedList(2, three);
		one = new MyLinkedList(1, two);	
		
		assertEquals(new Integer(1), one.getElement());
		MyLinkedList next = one.getNext();
		assertEquals(new Integer(2), next.getElement());
		next = next.getNext();
		assertEquals(new Integer(3), next.getElement());		
	}

	@Test
	public void testReverse() {
		MyLinkedList reverse = MyLinkedList.reverse(one);
		assertEquals(new Integer(3), reverse.getElement());
		MyLinkedList next = reverse.getNext();
		assertEquals(new Integer(2), next.getElement());
		next = next.getNext();
		assertEquals(new Integer(1), next.getElement());		
	}
	
	@Test
	public void testReverse2() {
		MyLinkedList reverse2 = MyLinkedList.reverse2(one);
		assertEquals(new Integer(3), reverse2.getElement());
		MyLinkedList next = reverse2.getNext();
		assertEquals(new Integer(2), next.getElement());
		next = next.getNext();
		assertEquals(new Integer(1), next.getElement());		
	}

}
