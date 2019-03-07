class StackWithLinkedList {
	static class StackNode<T> {
		StackNode next;
		T data;

		public StackNode(T d) {
			this.data=d;
		}
	}
	StackNode head;

	static void push(StackWithLinkedList l, int d) {
		StackNode n=new StackNode(d);
		if (l.head != null)
			n.next=l.head;
		else
			n.next=null;
		
		l.head=n;
	}

	static void pop(StackWithLinkedList l) {
		if (l.head != null)
			l.head=l.head.next;
	}

	static void printStack(StackWithLinkedList sl) {
		StackNode n=sl.head;		
		while(n.next!=null) {
			System.out.print(n.data + "-->");
			n=n.next;
		}
		System.out.println(n.data);
	}

	public static void main(String[] s) {
		StackWithLinkedList sl = new StackWithLinkedList();
		push(sl,2);
		push(sl,4);
		push(sl,8);
		push(sl,3);
		printStack(sl);
		System.out.println("Pop");
		pop(sl);
		printStack(sl);
		System.out.println("Push 9");
		push(sl,9);
		printStack(sl);
	}
}
