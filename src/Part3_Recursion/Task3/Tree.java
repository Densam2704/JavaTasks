package Part3_Recursion.Task3;

import java.util.HashSet;

public class Tree implements BinarySearchTree{
  private Node root = null;
  
  public Tree(){
    root.parent=root;
    root.left=root;
    root.right=root;
  }
  @Override
  public Object find(int key) {
	return null;
  }
  
  @Override
  public void insert(int key, Object value) {
	
  }
  
  @Override
  public void remove(int key) {
	
  }
  
  @Override
  public void infixTraverse() {
	
  }
  
  @Override
  public void prefixTraverse() {
	
  }
  
  @Override
  public void postfixTraverse() {
	
  }
  
  private static class Node<V extends Comparable<V>> {
	
	private Node parent;
	private Node left;
	private Node right;
	private int k = 0;
	private final V data;
	
	public Node(V data) {
	  this.data = data;
	  this.parent = null;
	  this.left = null;
	  this.right = null;
	}
	
  }
}
