
class Node{
	public Object item;
	public Node next; // pointing to next node
}
public class LinkedListImplementation1 {
	private int size = 0;
	private Node head;
	public LinkedListImplementation1() {
		// TODO Auto-generated constructor stub
		this.size=0;
		this.head=null;
	}
	public void insertatEnd(String i) {
		Node node = new Node();
		node.item=i;
		node.next=null;
		Node current=this.head;
		if(this.head==null) {
			this.head=node;
			this.size=1;
			System.out.println(this.head.toString());
		}else {
			while(current.next!=null) {
				current=current.next;
			}current.next=node;
			this.size+=1;
		}
	}
	public void insertatStart(String i) {
		Node n = new Node();
		n.item=i;
		n.next=null;
		if(this.head==null) {
			this.head=n;
			this.size=1;
			System.out.println(this.head.toString());
		}else {
			n.next=this.head;
			this.head=n;
			this.size+=1;
		}
	}
	public void insertatMiddle(String i,int pos) {
		Node n = new Node();
		n.item = i;
		n.next=null;
		Node temp;
		Node current = this.head;
		if(this.head!=null && pos<=this.size) {
		for(int j=0;j<pos;j++) {
			current=current.next;
		}
		temp=current.next;
		current.next=n;
		n.next=temp;
		this.size+=1;
		}else {
			System.out.println("Position is greater than size");
		}
	}
	public void deleteatEnd() {
		Node current=this.head;
		if(this.head==null) {
			System.out.println("list is empty");
		}else {
			while(current.next.next!=null) {
				current=current.next;
			}current.next=null;
			this.size-=1;
		}
	}
	public void deleteatStart() {
		if(this.head==null) {
			System.out.println("List is empty");
		}else {
			this.head=this.head.next;
			this.size-=1;
		}
	}
	public void deleteatMiddle(int pos) {
		Node current = this.head;
		if(this.head!=null && pos<=this.size) {
		for(int j=0;j<pos-1;j++) {
			current=current.next;
		}
		current.next=current.next.next;
		this.size-=1;
		}else {
			System.out.println("Position is greater than size");
		}
	}
	public void display() {
		Node current = this.head;
		if(head==null) System.out.println("List is empty");
		for(int i=0;i<size;i++){
			System.out.print(current.item+"->");
			current=current.next;
		}
	}
	
    public void find(Object value) {
        Node current = this.head;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (current.item.equals(value)) {
                System.out.println("Elements present at index" + i);
                flag = true;
                // break;
            }

            current = current.next;

        }
        if (!flag) {
            System.out.println("Element not present in Linked list");
        }
    }
	public static void main(String[] args) {
		LinkedListImplementation1 l = new LinkedListImplementation1();
		l.insertatStart("RGM");
        l.insertatStart("Dileep");
        l.insertatStart("Kumar");
        l.insertatStart("Venkata");
		l.insertatMiddle("CSE", 3);
		l.insertatEnd("College");
		l.display();
		System.out.println();
		l.deleteatMiddle(2);
		l.display();
		l.deleteatEnd();
		System.out.println();
		l.display();
		l.find("RGM");
	}
}