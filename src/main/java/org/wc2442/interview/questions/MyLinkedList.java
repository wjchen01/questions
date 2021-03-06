package org.wc2442.interview.questions;

public class MyLinkedList {
	
	private Integer element;
	private MyLinkedList next;
	
	public MyLinkedList(Integer element, MyLinkedList next) {
		this.element = element;
		this.next = next;
	}
	
	public Integer getElement() {
		return this.element;
	}
	
	public MyLinkedList getNext() {
		return this.next;
	}
	
	public static MyLinkedList reverse(MyLinkedList origin) {
		if(origin == null) {
			throw new NullPointerException("Null MyLinkedList");
		}
		
		MyLinkedList next = origin.getNext();
		if(next == null) {
			return origin;
		}
		origin.next = null;
		MyLinkedList reversed = reverse(next);
		next.next = origin;	
		
		return reversed;
	}
	
	public static MyLinkedList reverse2(MyLinkedList head) {
		if(head != null) {	
			MyLinkedList prev = null;
			while(head.next != null) {
				MyLinkedList next = head.next;
				head.next = prev;
				prev = head;
				head = next;
			}
			head.next = prev;
		}
		return head;
	}
	
}
