package helpfulClasses;

public class LinkedList<T> {
	
	private LinkedListNode<T> head = new LinkedListNode<T>(null);
	private LinkedListNode<T> tail = new LinkedListNode<T>(null);
	
	int size;
	
	
	public LinkedList() {
		size = 0;
		head.setPrev(null);
		head.setNext(tail);
		tail.setPrev(head);
		tail.setNext(null);
	}
	
	public void addFirst(T data) {
		LinkedListNode<T> node = new LinkedListNode<T>(data);
		node.setNext(head.getNext());
		head.getNext().setPrev(node);
		head.setNext(node);
		node.setPrev(head);
		size++;
	}
	
	public void addLast(T data) {
		LinkedListNode<T> node = new LinkedListNode<T>(data);
		node.setPrev(tail.getPrev());
		tail.getPrev().setNext(node);
		node.setNext(tail);
		tail.setPrev(node);
		size++;
	}
	
	
	
	public void printList() {
		System.out.println("Size: " + size);
		LinkedListNode<T> curr = head.getNext();
		while(curr.getData() != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
		System.out.println();
	}

}
