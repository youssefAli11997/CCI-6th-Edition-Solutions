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
	
	public LinkedListNode<T> getHead() {
		return head;
	}
	
	public LinkedListNode<T> getTail() {
		return tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void clear() {
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
	
	public void removeFirst() {
		if(this.isEmpty()) {
			System.out.println("Error : the list is empty!");
			return;
		}
		head.setNext(head.getNext().getNext());
		head.getNext().setPrev(head);
		size--;
	}

	public void removeLast() {
		if(this.isEmpty()) {
			System.out.println("Error : the list is empty!");
			return;
		}
		tail.setPrev(tail.getPrev().getPrev());
		tail.getPrev().setNext(tail);
		size--;
	}
	
	public void removeAt(int index) {
		if(index >= size) {
			System.out.println("Error: invalid index");
			return;
		}
		if(index == size-1) {
			removeLast();
			return;
		}
		if(index == 0) {
			removeFirst();
			return;
		}
			
		LinkedListNode<T> curr = head.getNext(); // first element
		for(int i=0; i<index-1; i++)
			curr = curr.getNext();
		
		curr.setNext(curr.getNext().getNext());
		curr.getNext().getNext().setPrev(curr);
		size--;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean contains(T data) {
		LinkedListNode<T> curr = head.getNext();
		while(curr != tail) {
			if(curr.getData() == data)
				return true;
			curr = curr.getNext();
		}
		
		return false;
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
