package Part2_OOP.Task3;

import java.util.LinkedList;

//Собственная реализация связного списка.
// (реализовать java.util.List.)
public class Task3 {
  private LinkedList<String> linkedList = new LinkedList<>();
  
  public Task3() {
	System.out.println("Check out MuLinkedListTest to see tests results");
	linkedList.add("Hello");
	linkedList.add("new");
	linkedList.add("world");
	linkedList.remove("hello");
	linkedList.indexOf("hello");
	printList();
	
  }
  
  private void printList() {
	String res = "";
	for (String s :
			linkedList) {
	  res += " " + s;
	}
	System.out.println("List:\n" + res);
  }
}
