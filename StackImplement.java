package stackUsingLinkedList;

public class StackImplement {

		public static void main(String[] args) {
			
			StackUsingLinkedList stack = new StackUsingLinkedList();
			System.out.println(stack.size());
			stack.push(56);
			stack.push(30);
			stack.push(70);
			
			
			System.out.println(stack.size());
			System.out.println(stack.isEmpty());
			
			System.out.println(stack.peek());
			System.out.println(stack.pop());
			
			System.out.println(stack.size());
			
		}
}
