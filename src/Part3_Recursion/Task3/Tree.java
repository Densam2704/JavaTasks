package Part3_Recursion.Task3;

import java.util.HashSet;

public class Tree implements BinarySearchTree{
  private Node root = null;
  private Node current = null;
  
  public Tree(Comparable DataType){
   root = new Node(DataType);
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
//
	current = insert(current, value);
  }
  
  private Node insert (Node current, Comparable value){
	if (current==null){
	  return new Node(value);
	}
	else {
//	  value>current
	  if (current.data.compareTo(value)<0){
	    insert(current.right,value);
	  }
//	  value<current
	  else
	  if (current.data.compareTo(value)>0){
		insert(current.left,value);
	  }
	  else
	   return current;
	}
	return current;
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
