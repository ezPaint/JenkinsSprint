package com.simoncomputing.app.jenkinssprint.util;

import java.util.Iterator;

/**
 * 
 * @author nicholas.phillpott
 *
 * @param <E>
 */
public class Queue<E> implements Iterable<E>{
	
	private Node<E> head;
	private Node<E> tail;
	
	private int max;
	private int size;
	
	public Queue(int max) {
		this.max = max;
		size = 0; 
		head = new Node<E>();
		tail = new Node<E>();
		head.setPrev(tail);
		tail.setNext(head);
	}
	
	public Queue() {
		this(25);
	}
	
	/**
	 * Add object to Queue
	 * @param e object to add
	 * @return true if success, else false
	 */
	public boolean push(E e) {
		if (size >= max) {
			return false;
		}
		Node<E> node = new Node<E>();
		node.setValue(e);
		
		tail.getNext().setPrev(node);
		node.setNext(tail.getNext());
		node.setPrev(tail);
		tail.setNext(node);
		size++; 
		return true; 
	}
	
	/**
	 * look at next object that pop would call 
	 * @return next pop
	 */
	public E peek() {
		if (size == 0) {
			return null;
		}
		return head.getPrev().getValue();
	}
	
	/**
	 * 
	 * @return
	 */
	public E pop() {
		if (size == 0) {
			return null;
		}
		E e = peek();
		head.setPrev(head.getPrev().getPrev());
		head.getPrev().setNext(head);
		size--; 
		return e;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder(); 
		for (E e : this) {
			strb.append(e + ", ");
		}
		return strb.toString();
	}

	@Override
	public Iterator<E> iterator() {
		return new QueueIterator(); 
	}
	
	private class QueueIterator implements Iterator<E>{
		
		private Node<E> current;
		
		public QueueIterator() {
			current = head; 
		}

		@Override
		public boolean hasNext() {
			if (size == 0) {
				return false;
			}
			if (current.getPrev().equals(tail)) {
				return false;
			}
			return true; 
		}

		@Override
		public E next() {
			current = current.getPrev();
			return current.getValue();
		}

		@Override
		public void remove() {
			size--;
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			current = current.getPrev();
		}
	}

}
