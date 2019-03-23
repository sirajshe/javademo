public class LinkedListTest {

	static class LinkedListNode {
	LinkedListNode next;
	int data;

		public LinkedListNode(int d) {
		data = d;
		}
	}
	LinkedListNode head;

	static void appendToTail(LinkedListTest list, int d) {
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

	static void printLinkedList(LinkedListTest l){
		LinkedListNode n = l.head;
		//System.out.println("Printing.. head data="+n.data);
		while(n.next!=null) {
			System.out.print(n.data + "-->");
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	public static void main(String[] s) {
		LinkedListTest l = new LinkedListTest();
		LinkedListTest l2 = new LinkedListTest();
		appendToTail(l,5);
		appendToTail(l,8);
		appendToTail(l,6);
		appendToTail(l2,9);
		appendToTail(l2,10);
		appendToTail(l2,10);
		appendToTail(l2,25);
		appendToTail(l2,54);
		printLinkedList(l);
		printLinkedList(l2);
		LinkedListNode n = l.head;
		while (n.next != null)
			n=n.next;
		n.next=l2.head;
		printLinkedList(l);
		LinkedListTest l3 = new LinkedListTest();
		appendToTail(l3,5);
		appendToTail(l3,8);
		LinkedListTest l4 = new LinkedListTest();
		appendToTail(l4,5);
		appendToTail(l4,8);
		if (l3 == l4) {
			System.out.println("l3 and l4 are same");
		}
		
	}
}
