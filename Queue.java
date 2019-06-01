public class MyQueue {
	static int[] que = new int[5];
	static int head=0;
	static int tail = 0;
	static int start=0;
	
	public boolean isEmpty() {
		if(head == tail && que[head]==0) {
			
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(head == tail && que[head]!=0) {
			return true;
		}
		return false;
	}
	
	public boolean enqueue(int value) {
		if(isFull())
			return false;
		
		que[tail] = value;
		tail++;
		if(tail == 5)
			tail = 0;
		return true;
	}
	
	public int dequeue() {
		if(isEmpty())
			return -1;
		if(tail == 4)
			tail = 0;
		int temp = que[head];
		que[head] = 0;
		head++;
		return temp;
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		
		for(int i=0; i<5; i++) {
			System.out.println(q.que[i]);
		}
		System.out.println("###########");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		System.out.println("###########");
		
		
		for(int i=0; i<5; i++) {
			System.out.println(q.que[i]);
		}
		q.enqueue(1);
		q.enqueue(2);
//		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(5);
		System.out.println("###########");
		
		
		for(int i=0; i<5; i++) {
			System.out.println(q.que[i]);
		}
	}

}
