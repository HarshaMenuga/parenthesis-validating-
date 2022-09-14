package sort;

public class DLL {

	class Node {
		int data;
		Node nextNode;
		Node previousNode;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;
	int size = 0;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			head.previousNode = null;
		} else if (size > 0) {
			tail.nextNode = newNode;
			newNode.previousNode = tail;
		}
		tail = newNode;
		size++;
		tail.nextNode = null;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.nextNode = node;
			node.previousNode = tail;
			node.nextNode = null;
			tail = node;
		}
		size++;
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		if (head != null) {
			node.nextNode = head;
			head.previousNode = node;
			node.previousNode = null;
			head = node;
		}
		size++;
	}

	public void delete(int data) {
		if (size == 0) {
			System.out.println("List is empty");
			return;
		} else if (head.data == data) {
			head = head.nextNode;
			head.previousNode = null;
			size--;
			return;
		}
		Node temp = head;
		while (temp.nextNode != null) {
			if (temp.data == data) {
				temp.previousNode.nextNode = temp.nextNode;
				temp.nextNode.previousNode = temp.previousNode;
				return;
			} else {
				temp = temp.nextNode;
			}
		}
		size--;
	}

	public int size() {
		int count = 1;
		if (size == 0) {
			System.out.println("List is Empty");
		}
		Node temp = head;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
			count++;
		}
		return count;
	}

	public void display() {
		Node CurrentNode = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			while (CurrentNode != null) {
				System.out.print(CurrentNode.data + " <-> ");
				CurrentNode = CurrentNode.nextNode;
			}
		}
		System.out.println("END");
	}

	public void display_rev() {
		Node last = tail;
		while (last != null) {
			System.out.print(last.data + " <-> ");
			last = last.previousNode;
		}
		System.out.println("START");
	}

	public static void main(String[] args) {
		DLL obj = new DLL();
		obj.insert(17);
		obj.insert(3);
		obj.insert(35);
		obj.insert(1);
		obj.insert(90);
		obj.insert(1);
		obj.addLast(90);
		obj.insert(800);
		obj.addFirst(100);
		// obj.delete(35);
		obj.display();
		System.out.println("count : " + obj.size());
	}
}