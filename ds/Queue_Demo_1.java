package maps;

public class Queue_Demo_1 {

	private int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize = 0;

	public Queue_Demo_1(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full!! Can not add more elements");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue");
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!! Can not dequeue element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
			currentSize--;
		}
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {

		if (currentSize == 0) {
			return true;
		}
		return false;
	}

	public static void main(String a[]) {

		Queue_Demo_1 queue = new Queue_Demo_1(5);
		queue.enqueue(5);
		queue.dequeue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.dequeue();
		queue.enqueue(25);
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(35);
		queue.dequeue();
		queue.enqueue(40);
		queue.enqueue(45);
	}
}
