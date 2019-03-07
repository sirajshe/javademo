public class DeleteMiddleLinkedList{
	Node head;
	static class Node {
		Node next;
		int data;
	
		public Node(int d) {
			this.data=d;
		}
	}

	static void appendToTail(DeleteMiddleLinkedList l, int d) {
		Node newNode = new Node(d);
		if (l.head == null) {
			l.head=newNode;
		} else {
			Node h = l.head;
			while (h.next != null) {
				h=h.next;
			}
			h.next=newNode;
		}
	}

	static void printLl(DeleteMiddleLinkedList list) {
		Node l = list.head;
		while (l != null) {
			System.out.print(l.data + "-->");
			l=l.next;
		}
		//System.out.println(l.data);
	}

	static void deleteMiddle(DeleteMiddleLinkedList l) {
		int count = 0;
		Node n = l.head;
		while(n.next != null) {
			count++;
			n=n.next;
		}
		count++;
		System.out.println("Count="+count);
		n = l.head;
		int idx = 0;
		while (n.next != null) {
			if (idx == count/2 - 1 ) {
				n.next=n.next.next;
				break;
			}
			idx++;
			n=n.next;
		}
	}

	public static void main(String[] s) {
		DeleteMiddleLinkedList l = new DeleteMiddleLinkedList();
		appendToTail(l,4);
		appendToTail(l,9);
		appendToTail(l,6);
		appendToTail(l,8);
		appendToTail(l,12);
		printLl(l);
		deleteMiddle(l);
		printLl(l);
		deleteMiddle(l);
		printLl(l);
		deleteMiddle(l);
		printLl(l);
		deleteMiddle(l);
		printLl(l);
	}
}
