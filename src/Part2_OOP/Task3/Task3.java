package Part2_OOP.Task3;

import java.util.LinkedList;

//Собственная реализация связного списка.
// (реализовать java.util.List.)
public class Task3 {
  private LinkedList<String>linkedList =new LinkedList<>();
  public Task3(){
	
	linkedList.add("Hello");
	linkedList.add("new");
	linkedList.add("world");
	printList();
	
  }
  private void printList(){
    String res="";
	for (String s :
			linkedList) {
	  res+=" "+s;
	}
	System.out.println("List:\n"+res);
  }
}
