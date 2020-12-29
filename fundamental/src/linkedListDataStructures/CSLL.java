package linkedListDataStructures;

	public class CSLL {
		private Node head;
		private int size;
		private Node tail;
		private static class Node{
			int data;
			Node next;
			public Node(int data, Node next) {
				this.data = data;
				this.next = next;
			}
			
		}
		public void add(int data) {
			Node newNode=new Node(data,null);
			if(head==null) {
				head=newNode;
				tail=newNode;
				newNode.next=newNode;
				size++;
			}
			else {
				/*Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=newNode;
				newNode.next=head;*/
				tail.next=newNode;
				tail=tail.next;
				newNode.next=head;
				size++;
			}
		}
		public int get(int index) {
			return -1;
		}
		public int size() {
			return size;
		}
		public void remove(int data) {
			if(head==null) {
				return;
			}
			if(size==1) {
				head=null;
				size--;
				return;
			}			
		}
		public void removeSpecific(int data) {
			if(head==null) {
				return;
			}
			else {
				Node temp=head;
				if(temp.data==data) {
					head=head.next;
					tail.next=head;
				}
				Node prev=temp;
				while(temp!=null) {
					if(temp.data==data) {
						prev.next=temp.next;
						temp.next=null;
						size--;
					}
					prev=temp;
					temp=temp.next;
				}
			}
		}
		public boolean contains(int data) {
			if(head==null) {
				return false;
			}
			else {
				Node temp=head;
				while(temp!=null) {
					if(temp.data==data) {
						return true;
					}
					temp=temp.next;
				}
				return false;
			}
		}
		public void display() {
			Node temp=head;
			for(int i=0;i<size;i++) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		public static void main(String[] args) {
			CSLL csll=new CSLL();
			csll.add(10);
			csll.add(20);
			csll.add(30);
			csll.add(40);
			csll.add(50);
			System.out.println(csll.contains(10));
//			csll.removeSpecific(50);
//			csll.remove(10);
//			csll.remove(20);
			System.out.println(csll.size());
			csll.display();
		}
	}



