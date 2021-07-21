package Part3_Recursion.Task3;

public interface BinarySearchTree {
  public Object find(int key);
  public void insert(int key, Comparable value);
  public void remove(int key);
  public void infixTraverse();
  public void prefixTraverse();
  public void postfixTraverse();
}
