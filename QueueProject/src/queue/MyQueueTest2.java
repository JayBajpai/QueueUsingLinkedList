package queue;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import linkedlist.INode;
import linkedlist.MyNode;
public class MyQueueTest2 {
	@Test
	public void test() {
		MyNode<Integer> myFirstNode = new MyNode<>(50);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
        MyQueue myQueue = new MyQueue();
        
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode dequeue = myQueue.dequeue();
        
        myQueue.printQueue();
        Assert.assertEquals(dequeue,myFirstNode);
	}
}