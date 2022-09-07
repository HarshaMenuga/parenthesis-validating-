package sort;

class Single_LinkedList {
	class Node {
		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	Node head = null;
	Node tail = null;
	int size = 0;
	int count = 0;
 
	public void insert(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
//			size++;
//			count++;
		} else if (size > 0) {
			tail.nextNode = newNode;
		}
		tail = newNode;
		size++;
		count++;

	}

	public void delete(int data) {

		if (size == 0) {
			System.out.println("List is empty");
			return;
		} else {

			if (head.data == data) {
				head = head.nextNode;
				return;
			}

			Node prevNode = null;
			Node curNode = head;

			while (curNode.nextNode != null) {

				if (curNode.data == data) {
					prevNode.nextNode = curNode.nextNode;
					size--;
					return;
				} else {
					prevNode = curNode;
					curNode = curNode.nextNode;
				}
			}

			if (curNode.data == tail.data) {
				tail = prevNode;
				tail.nextNode=null;
				size--;
				if (size == 1) {
					head.nextNode = null;
				}
			}
		}

	}

	public void getHead() {
		if (size == 0) {
			System.out.println("Empty");
		} else {
			System.out.println("\nhead : " + head.data);
		}
	}

	public void gettail() {
		if (size == 0) {
			System.out.println("List is empty");
		} else {
			System.out.println("\ntail : " + tail.data);
		}
	}

	public void getSize() {
		Node temp = head;
		int count = 0;
		while (temp.nextNode != null) {
			count++;
			temp = temp.nextNode;
		}
		System.out.println("Size : " + count);
	}

	public void find(int data) {
		boolean flag = false;
		int i = 1;
		if (size != 0) {
			if (head.data == data || tail.data == data) {
				System.out.println("exists");
				return;
			}
			Node curNode = head;
			while (curNode.nextNode != null) {
				if (curNode.data == data) {
					flag = true;
					break;
				}
				i++;
				curNode = curNode.nextNode;
			}
			if (flag) {
				System.out.println("Exists");
			} else {
				System.out.println("Not Exists");
			}
		}
	}
//	public void addFirst(int data) {
//		Node FirstNode = null;
//		Node newNode = new Node(data);
//		FirstNode.nextNode = newNode;
//		FirstNode = head;
//	}

	public void display() {
		if (size!=0) {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.nextNode;
			}
			System.out.print(currentNode.data + " ");
		} else {
			System.out.println("List is Empty");
		}

	}

	public static void main(String[] args) {

		Single_LinkedList obj = new Single_LinkedList();
		obj.insert(89);
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(5);
		obj.insert(555);
		obj.display();
//		obj.getHead();
		
//		obj.getSize();
//		obj.find(89);
//		obj.delete(89);
//		obj.delete(555);
//		obj.addFirst(100);
//		obj.display();
//		obj.gettail();
	}

}
