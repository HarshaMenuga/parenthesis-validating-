package sort;

import java.util.*;

public class QueueUsingStackTest {
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();

	public void push(int element) {
		if (stack1.size() == 0) {
			stack1.push(element);
		} else {
			int length = stack1.size();
			for (int i = 0; i < length; i++)
				stack2.push(stack1.pop());
			stack1.push(element);

			for (int i = 0; i < length; i++)
				stack1.push(stack2.pop());
		}
	}
	public void display() {
		System.out.print("Queue = ");
		int l = getSize();
		if (l == 0)
			System.out.print("Empty\n");
		else {
			for (int i = l - 1; i >= 0; i--)
				System.out.print(stack1.get(i) + " ");
			System.out.println();
		}

	}

	private int getSize() {
		return stack1.size();
	}
	public int pop() {
		return stack1.pop();
	}
	public int peek() {
		return stack1.peek();
		
	}

	public static void main(String args[]) {
		QueueUsingStackTest test = new QueueUsingStackTest();
		test.push(10);
		test.push(20);
		test.push(30);
		test.display();
		System.out.println("Pop Elemet "+test.pop());
		test.display();
		System.out.println("Size : "+test.getSize());
		System.out.println("Peek Value : "+test.peek());
		test.push(40);
		test.display();
	}
}
