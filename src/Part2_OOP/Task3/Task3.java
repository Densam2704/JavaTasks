package Part2_OOP.Task3;

import java.util.Arrays;
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
	Object[] stringObjects = linkedList.toArray();
	System.out.println(Arrays.toString(stringObjects));
	
	String[] strings = new String[linkedList.size()];
	strings=linkedList.toArray(strings);
	System.out.println(strings[0]);
	
	
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
