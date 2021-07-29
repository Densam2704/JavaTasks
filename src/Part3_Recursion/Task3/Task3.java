package Part3_Recursion.Task3;
//Binary Search
public class Task3 {
  Tree tree;
  
  public Task3() {
	int key = 1;
	int value = 1;
	
	System.out.println("Creating tree with 4 nodes");
	tree = new Tree(0);
	tree.insert(key++, value++);
	tree.insert(key - 10, value++);
	tree.insert(key, value++);
	tree.insert(key++, value++);
	show();
	
	System.out.println("Adding 4 more values to the tree");
	tree.insert(key - 50, value++);
	tree.insert(key - 10, value++);
	tree.insert(key++, value++);
	tree.insert(key++, value++);
	tree.insert(key - 20, value++);
	show();
	
	
	System.out.println("Deleting node");
	tree.remove(key - 20);
	show();
	
	System.out.println("Deleting not existing node");
	tree.remove(key - 100);
	show();
	
	System.out.println("Deleting  root");
	tree.remove(0);
	show();
	
	
  }
  
  private void show() {
	System.out.println("infix");
	tree.show(Tree.INFIX);
	System.out.println("prefix");
	tree.show(Tree.PREFIX);
	System.out.println("postfix");
	tree.show(Tree.POSTFIX);
  }
}
