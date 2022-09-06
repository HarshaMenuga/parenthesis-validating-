package maps;

class Stack_1 {
	String st[];
	int top;
	int size;

	public Stack_1() {
		top = -1;
		size = 10;
		this.st = new String[10];
	}

	public void stack_1(int i) {
		top = -1;
		this.size = i;
		st = new String[i];
	}

	public boolean push(String value) {
		if (isEmpty()) {
			top = top + 1;
			st[top] = value;
			return true;
		} else if (!isFull()) {
			top = top + 1;
			st[top] = value;
			return true;
		} else {
			System.out.println("Stack is full......!");
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else if (size > top) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isFull() {
		if (top > size) {
			return true;
		}
		return false;
		
	}

	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty.......");
			return null;
		} else {
			String value;
			value = st[top];
			top = top - 1;
			return value;
		}

	}

	public String peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return st[top];
		}
	}
}

public class Stack_Demo {

	public static void main(String[] args) {
		Stack_1 stack = new Stack_1();
		System.out.println(stack.push("Harsha"));
		System.out.println(stack.push("Ovaledge"));
		System.out.println(stack.push("Sita"));
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		
		
		
	}

}
