class QueueWithLinkedList {
	static class QueueNode<T> {
		QueueNode next;
		T data;

		public QueueNode(T d) {
			this.data=d;
		}
	}
	QueueNode head;

	static void push(QueueWithLinkedList l, int d) {
		QueueNode n=new QueueNode(d);
		if (l.head != null)
			n.next=l.head;
		else
			n.next=null;
		
		l.head=n;
	}

	static void pop(QueueWithLinkedList l) {
		QueueNode n = l.head;
		while (n.next.next != null)
			n=n.next;
		n.next=null;
		
	}

	static void printQueue(QueueWithLinkedList sl) {
		QueueNode n=sl.head;		
		while(n.next!=null) {
			System.out.print(n.data + "-->");
			n=n.next;
		}
		System.out.println(n.data);
	}

	public static void main(String[] s) {
		QueueWithLinkedList sl = new QueueWithLinkedList();
		push(sl,2);
		push(sl,4);
		push(sl,8);
		push(sl,3);
		printQueue(sl);
		System.out.println("Pop");
		pop(sl);
		printQueue(sl);
		System.out.println("Push 9");
		push(sl,9);
		printQueue(sl);
	}
}
