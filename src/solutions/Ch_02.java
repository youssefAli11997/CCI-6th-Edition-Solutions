package solutions;

import helpfulClasses.LinkedList;
import helpfulClasses.LinkedListNode;

public class Ch_02 {
	
	// 2.1 Remove Dups
	
	// with an empty LinkedList allowed. O(n --> loop * n --> contains()) = O(n^2)
	public LinkedList<Integer> removeDups(LinkedList<Integer> list){
		LinkedList<Integer> temp = new LinkedList<Integer>();
		LinkedListNode<Integer> curr = list.getHead().getNext();
		while(curr != list.getTail()) {			
			if(!temp.contains(curr.getData()))
				temp.addLast(curr.getData());
			curr = curr.getNext();
		}
		return temp;
	}
	
	// without any buffer allowed. (changing the list itself)
	// to be coded
}
