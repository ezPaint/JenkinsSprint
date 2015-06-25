package com.simoncomputing.app.jenkinssprint.util;

public class Node<E> {
	
	private Node<E> next; 
	private Node<E> prev;
	private E value; 
	
	public Node() {}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

}
