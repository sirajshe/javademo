public class LinkedList {

	static class LinkedListNode {
	LinkedListNode next;
	int data;

		public LinkedListNode(int d) {
		data = d;
		}
	}
	LinkedListNode head;

	static void appendToTail(LinkedList list, int d) {
		LinkedListNode newNode = new LinkedListNode(d);
		newNode.next=null;
	
		if (list.head == null) {
			list.head = newNode;
		} else {
			LinkedListNode last = list.head;
			while (last.next != null)
				last=last.next;
			// Loop exits when last.next is null
			last.next=newNode;
		}
	}
	static void addAfterData(LinkedList l, int d, int e) {
		LinkedListNode newNode = new LinkedListNode(e);
		LinkedListNode n = l.head;
		while (n.next != null) {
			if (n.data == d) {
				newNode.next=n.next;
				n.next=newNode;
				break;
			}
			if (n.next.next == null && n.next.data == d) {
				newNode.next=null;
                                n.next.next=newNode;
				break;
			}
			
			n=n.next;
		}
			
			
	}

	static void addBeforeData(LinkedList l, int d, int e) {
		LinkedListNode n = l.head;
                LinkedListNode newNode = new LinkedListNode(e);
                if (n.data == d) {
			//System.out.println("came here to add head");
			//System.out.println("Current head data="+n.data);
                	newNode.next=n;
			l.head=newNode;
			//System.out.println("Current head data="+n.data);
			return;
                } else {
			System.out.println("came here for "+d +" and "+ e);
                	while (n.next != null) {
                        	if (n.next.data == d) {
                                	newNode.next=n.next;
                                	n.next=newNode;
                                	break;
                        	}
                        	n=n.next;
                	}
		}

	}
	
	static void deleteFirstNodeWithData(LinkedList l, int d){
		LinkedListNode n = l.head;
		if (n.data == d) {
			l.head=n.next;
			return;	
		}
		while (n.next != null) {
			if (n.next.data == d) {
				n.next=n.next.next;
				break;
			}
			n=n.next;
		}
	}

	static void printLinkedList(LinkedList l){
		LinkedListNode n = l.head;
		//System.out.println("Printing.. head data="+n.data);
		while(n.next!=null) {
			System.out.print(n.data + "-->");
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	public static void main(String[] s) {
		LinkedList l = new LinkedList();
		appendToTail(l,5);
		appendToTail(l,8);
		appendToTail(l,6);
		addAfterData(l,8,7);
		addAfterData(l,6,9);
		addBeforeData(l,8,10);
		addBeforeData(l,5,3);
		addBeforeData(l,3,25);
		addBeforeData(l,9,26);
		addAfterData(l,9,15);
		printLinkedList(l);
		deleteFirstNodeWithData(l,8);
		deleteFirstNodeWithData(l,25);
		deleteFirstNodeWithData(l,15);
		printLinkedList(l);
	}
}
