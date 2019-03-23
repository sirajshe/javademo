public class Node {
	Node next = null;
	int data;

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null)
			n=n.next;
		n.next=end;
	}

	void addAfterData(int d, int e) {
		Node n = this;
		Node newNode = new Node(e);

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

	void addBeforeData(int d, int e) {
		Node n = this;
                Node newNode = new Node(e);
                if (n.data == d) {
			System.out.println("came here to add head");
			System.out.println("Current head data="+n.data);
                	newNode.next=n;
			n=newNode;
			System.out.println("Current head data="+n.data);
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

	void printLinkedList(){
		Node n = this;
		System.out.println("Printing.. head data="+n.data);
		while(n.next!=null) {
			System.out.print(n.data + "-->");
			n=n.next;
		}
		System.out.println(n.data);
	}
	
	public static void main(String[] s) {
		Node n1 = new Node(2);
		n1.appendToTail(5);
		n1.appendToTail(3);
		n1.appendToTail(6);
		n1.appendToTail(9);
		n1.appendToTail(7);
		n1.printLinkedList();

		n1.addAfterData(3,0);
		n1.printLinkedList();
		
		n1.addAfterData(7,8);
		n1.printLinkedList();
		n1.addAfterData(2,1);
		n1.printLinkedList();

		//n1.addBeforeData(7,1);
		//n1.addBeforeData(9,10);
		n1.addBeforeData(2,12);
		n1.addBeforeData(12,14);
		n1.printLinkedList();
	}
}
