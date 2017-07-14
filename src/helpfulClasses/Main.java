package helpfulClasses;
import solutions.Ch_01;
import solutions.Ch_02;

public class Main {
	public static void main(String[] args) {
		
		// Ch_01
		
		Ch_01 cci = new Ch_01();
		
		System.out.println(cci.isAllUnique2("Ali"));
		System.out.println(cci.isAllUnique2("youssef"));
		System.out.println();
		
		System.out.println(cci.checkPermutation("abc", "bac"));
		System.out.println(cci.checkPermutation("abd", "bac"));		
		System.out.println();
		
		System.out.println(cci.checkPermutation2("abcb", "bacb"));
		System.out.println(cci.checkPermutation2("abd", "bac"));		
		System.out.println();
		
		System.out.println(cci.palindromePermutation("Tact Coa papa"));
		System.out.println(cci.palindromePermutation("Tact Coa"));		
		System.out.println();
		
		System.out.println(cci.stringCompression("Tact Coa papa"));
		System.out.println(cci.stringCompression("aabcccccaaa"));		
		System.out.println();
		
		int[][] arr = {{1,2,3},
							{4,5,6},
							{7,8,9}};
		cci.print2DIntArray(cci.rotateMatrix(arr));	
		System.out.println();
		cci.print2DIntArray(cci.rotateMatrixInPlace(arr));	
		
		System.out.println("----------------------");
		// Ch_02
		
		Ch_02 cci2 = new Ch_02();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// testing removeDups
		
		for(int i=0; i<10; i++) list.addFirst(1);
		list.printList();
		list = cci2.removeDups(list);
		list.printList();
		list.clear();
		
		for(int i=0; i<10; i++) list.addLast(i);
		list.addLast(2);
		list.addLast(5);
		list.printList();
		list = cci2.removeDups(list);
		list.printList();
		list.clear();
		
		// testing removeDups2
		
		/*for(int i=0; i<10; i++) list.addFirst(1);
		list.printList();
		list = cci2.removeDups2(list);
		list.printList();
		list.clear();
		
		for(int i=0; i<10; i++) list.addLast(i);
		list.addLast(2);
		list.addLast(5);
		list.printList();
		list = cci2.removeDups2(list);
		list.printList();
		list.clear();*/
		
		System.out.println("----------------------");
		// testing helpful classes
		
		LinkedList<Integer> DLL = new LinkedList<Integer>();
		DLL.addFirst(5);
		DLL.addLast(15);
		DLL.addFirst(10);
		DLL.addLast(25);
		DLL.removeFirst();
		DLL.addFirst(20);
		DLL.removeLast();
		DLL.removeAt(1);
		DLL.printList();
	}
}