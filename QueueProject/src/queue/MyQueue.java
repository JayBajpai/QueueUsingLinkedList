package queue;

import linkedlist.INode;
import stack.MyLinkedList;

public class MyQueue {
	
	private final MyLinkedList MyLinkedList;
	private INode myNode;
	public MyQueue(){
		
		this.MyLinkedList = new MyLinkedList();
	}
	
	
	public void enqueue(INode myNode) {
		
		MyLinkedList.append(myNode);
		
		
	}


	public void printQueue() {
		
		MyLinkedList.printNodes();
		
	}


	public INode peak() {
		
		return MyLinkedList.head;
	}
	
	


	public INode dequeue() {
		
	        return MyLinkedList.pop();
	    }
	}