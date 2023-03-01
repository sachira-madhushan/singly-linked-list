class Main{
	public static void main(String[] args) {
		LinkedList<Integer> myList=new LinkedList<Integer>();

		myList.insertLast(10);
		myList.insertLast(20);
		myList.printList();
		myList.insertFirst(5);
		myList.insertFirst(50);
		myList.printList();
		System.out.println();
		System.out.println(myList.size());
		// myList.deleteLast();
		// myList.printList();
		// myList.deleteFirst();
		// myList.printList();
		myList.deleteAt(1);
		myList.printList();
		System.out.println();
		System.out.println(myList.search(50));
		System.out.println(myList.search(60));
	}
}