package org.wc2442.interview.questions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyDoubleLinkedList {

	private MyDoubleLinkedList one;
	@Before
	public void setUp() throws Exception {
		MyDoubleLinkedList three = new MyDoubleLinkedList(3);
		MyDoubleLinkedList two = new MyDoubleLinkedList(2);
		one = new MyDoubleLinkedList(1);
		one.setNext(two);
		two.setPrev(one);
		two.setNext(three);
		three.setPrev(two);
		
		assertEquals(new Integer(1), one.getElement());
		MyDoubleLinkedList next = one.getNext();
		assertEquals(new Integer(2), next.getElement());
		next = next.getNext();
		assertEquals(new Integer(3), next.getElement());		
	}

	@Test
	public void test() {
		MyDoubleLinkedList reverse = MyDoubleLinkedList.reverse(one);
		assertEquals(new Integer(3), reverse.getElement());
		MyDoubleLinkedList next = reverse.getNext();
		assertEquals(new Integer(2), next.getElement());
		next = next.getNext();
		assertEquals(new Integer(1), next.getElement());		
	}

}
