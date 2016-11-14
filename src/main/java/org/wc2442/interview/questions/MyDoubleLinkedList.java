package org.wc2442.interview.questions;

public class MyDoubleLinkedList {

	private Integer element;
	private MyDoubleLinkedList next;
	private MyDoubleLinkedList prev;
	
	public MyDoubleLinkedList(Integer element) {
		this.element = element;
		this.prev = null;
		this.next = null;
	}

	public Integer getElement() {
		return this.element;
	}
	
	public MyDoubleLinkedList getNext() {
		return this.next;
	}
	
	public void setNext(MyDoubleLinkedList next) {
		this.next = next;
	}
	
	public void setPrev(MyDoubleLinkedList prev) {
		this.prev = prev;
	}

	public static MyDoubleLinkedList reverse(MyDoubleLinkedList head) {
		if(head != null) {	
			while(head.next != null) {
				MyDoubleLinkedList next = head.next;
				head.next = head.prev;
				head.prev = next;
				head = next;
			}
			MyDoubleLinkedList next = head.next;
			head.next = head.prev;
			head.prev = next;
		}
		return head;
	}

}
