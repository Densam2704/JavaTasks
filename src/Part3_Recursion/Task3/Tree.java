package Part3_Recursion.Task3;

import java.util.HashSet;

public class Tree implements BinarySearchTree {
  public static final int INFIX = 0;
  public static final int PREFIX = 1;
  public static final int POSTFIX = 2;
  private Node root = null;
  private Node current = null;
  
  public Tree(Comparable root) {
	this.root = new Node(root, 0);
  }
  
  @Override
  public Object find(int key) {
	return null;
  }
  
  //  Дано: дерево Т и пара (K, V).
//
//Задача: вставить пару (K, V) в дерево Т (при совпадении K, заменить V).
//
//Алгоритм:
//
//Если дерево пусто, заменить его на дерево с одним корневым узлом ((K, V), null, null) и остановиться.
//Иначе сравнить K с ключом корневого узла X.
//Если K>X, рекурсивно добавить (K, V) в правое поддерево Т.
//Если K<X, рекурсивно добавить (K, V) в левое поддерево Т.
//Если K=X, заменить V текущего узла новым значением.
  @Override
  public void insert(int key, Comparable value) {
	current = root;
	insert(current, value, key);
  }
  
  private Node insert(Node current, Comparable value, int key) {
	if (current == null) {
	  Node newNode = new Node(value, key);
	  newNode.key = key;
//	  newNode.parent=current.parent;
	  return newNode;
	} else {
//	  value>current
	  if (current.data.compareTo(value) < 0) {
		current.right = insert(current.right, value, key);
		current.right.parent = current;
	  }
//	  value<current
	  else if (current.data.compareTo(value) > 0) {
		current.left = insert(current.left, value, key);
		current.left.parent = current;
	  } else
		return current;
	}
	return current;
  }
  
  @Override
  public void remove(int key) {
	
  }
  
  public void show(int wayToTraverse) {
	switch (wayToTraverse) {
	  case INFIX:
		infixTraverse();
		break;
	  case PREFIX:
		prefixTraverse();
		break;
	  case POSTFIX:
		postfixTraverse();
		break;
	}
	System.out.println();
  }
  
  @Override
  public void infixTraverse() {
	infix(root);
	
  }
  
  private void infix(Node current) {
	if (current != null) {
	  System.out.print(" " + current.data);
	  System.out.println();
	  infix(current.left);
	  infix(current.right);
	}
	System.out.print(" ");
  }
  
  @Override
  public void prefixTraverse() {
	prefix(root);
  }
  
  private void prefix(Node current) {
	if (current != null) {
	  prefix(current.left);
	  System.out.println(current.data);
	  prefix(current.right);
	}
  }
  
  @Override
  public void postfixTraverse() {
	postfix(root);
  }
  
  private void postfix(Node current) {
	if (current != null) {
	  postfix(current.left);
	  postfix(current.right);
	  System.out.println(current.data);
	}
  }
  
  private static class Node<V extends Comparable<V>> {
	
	private Node parent;
	private Node left;
	private Node right;
	private int key = 0;
	private final V data;
	
	public Node(V data, int key) {
	  System.out.println("Created node with data " + data + "  and key " + key);
	  this.key = key;
	  this.data = data;
	  this.parent = null;
	  this.left = null;
	  this.right = null;
	}
	
  }
}
