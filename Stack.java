
public class MyStack {
	static int[] stack = new int[5];
	static int top=0;
	
	public boolean isEmpty() {
		if(top == 0)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(top == 6) {
			return true;
		}
		return false;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int temp = stack[--top];
		//top--;
		return temp;
		
	}
	
	public boolean push(int value) {
		if(isFull()) {
			return false;
		}
		stack[top] = value;
		top++;
		return true;
	}
	
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
		for(int i=0; i<top; i++) {
			System.out.println(s.stack[i]);
		}
		System.out.println("###########");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("###########");
		
		
		for(int i=0; i<top; i++) {
			System.out.println(s.stack[i]);
		}
	}

}
