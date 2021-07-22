package Part3_Recursion.Task3;

public class Task3 {
  public Task3(){
    int index=1;
    Tree tree = new Tree(0);
    tree.insert(index++,index);
	tree.insert(index++,index);
	tree.insert(index++,index);
	tree.insert(index++,index);
	tree.insert(index++,index);
	
	System.out.println("infix");
  	tree.show(Tree.INFIX);
	System.out.println("prefix");
	tree.show(Tree.PREFIX);
	System.out.println("postfix");
	tree.show(Tree.POSTFIX);
  }
}
