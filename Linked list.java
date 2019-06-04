

public class Linked_list {
	
	public class MyNode {
		int value;
		MyNode next;
		
		MyNode(int value){
			this.value = value;
			this.next = null;
		}
	}
	
	static MyNode head;
	
    public Linked_list(int value) {
		head = new MyNode(value);
	}
	
	public MyNode insert(int value) {
		MyNode current = head;
		while(current.next != null) {
			current = current.next;
			
		}
		current.next = new MyNode(value);
		return head;
	}
	
	public void print() {
		MyNode current = head;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		//System.out.println(current.value);
	}
	
	public MyNode delete(int delvalue) {
		MyNode current = head;
		MyNode previous = current;
		while(current != null) {
			if(current.value == delvalue) {
				if(previous == current) {
					head = current.next;
					//return head;
				}
				previous.next = current.next;
				//return head;
			}
			previous = current;
			current = current.next;
		}
		return head;
	}
	
	public boolean searchloop(MyNode head) {
		MyNode current = head;
		MyNode fast = current;
		while(current != null) {
			if(current == fast) {
				return true;
			}
			fast = fast.next.next;
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Linked_list l = new Linked_list(1);
		
		l.insert(2);
		l.insert(2);
		l.print();
		System.out.println("***********");
		l.delete(2);
		l.print();
	}

}
