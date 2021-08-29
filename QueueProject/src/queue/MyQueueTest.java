package queue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import linkedlist.INode;
import linkedlist.MyNode;
import stack.MyStack;

public class MyQueueTest {

	@Test
	public void test() {
		
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myThirdNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myFirstNode);
		
		myQueue.printQueue();
		
		INode peak = myQueue.peak();
		Assert.assertEquals(myThirdNode,peak);
		
	}

}