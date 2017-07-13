package helpfulClasses;

public class LinkedListNode<T> {
	
	private T data;
	private LinkedListNode<T> next;
	private LinkedListNode<T> prev;
	
	public LinkedListNode(T data) {
		this.setData(data);
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(LinkedListNode<T> node) {
		this.next = node;
	}
	
	public LinkedListNode<T> getNext() {
		return this.next;
	}
	
	public void setPrev(LinkedListNode<T> node) {
		this.prev = node;
	}
	
	public LinkedListNode<T> getPrev() {
		return this.prev;
	}

}
