package Part2_OOP.Task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Собственная реализация связного списка.
// (реализовать java.util.List.)
public class Task3 {
  private LinkedList<String> linkedList = new LinkedList<>();
  private MyLinkedList<String> myLinkedList = new MyLinkedList<>();
  
  public Task3() {
//	System.out.println("Check out MuLinkedListTest to see tests results");
//	linkedList.add("Hello");
//	linkedList.add("new");
//	linkedList.add("world");
//	Object[] stringObjects = linkedList.toArray();
//	System.out.println(Arrays.toString(stringObjects));
//
//	String[] strings = new String[linkedList.size()];
//	strings=linkedList.toArray(strings);
//	System.out.println(strings[0]);
	
	myLinkedList.add("Hello");
	myLinkedList.add("new");
	myLinkedList.add("new");
	myLinkedList.add("world");
	
	System.out.println("\nA new linked list has been created and default values has been added");
	printList(myLinkedList);
	
	System.out.println("\ntesting get by index (index = 3)\n" + myLinkedList.get(3));
	
	System.out.println("\ntesting indexOf for word 'new' \n" + myLinkedList.indexOf("new"));
	
	System.out.println("\ntesting lastIndexOf for word 'new' \n" + myLinkedList.lastIndexOf("new"));
	
	System.out.println("\ntesting getFirst " + myLinkedList.getFirst());
	
	System.out.println("\ntesting getLast " + myLinkedList.getLast());
 
	System.out.println("\ntesting set (set value 'WORLD' to 4th element in the list) " + myLinkedList.set(3,"WORLD"));
	printList(myLinkedList);
	
	System.out.println("\ntesting remove by index (index = 0) ");
	myLinkedList.remove(0);
	printList(myLinkedList);
	
	System.out.println("\ntesting remove by value (value = 'new')");
	myLinkedList.remove("new");
	printList(myLinkedList);
	
	
  }
  
  private void printList(List list) {
	System.out.println("Printing list");
	Object[] stringObjects = list.toArray();
	System.out.println(Arrays.toString(stringObjects));
  }
}
