package Part2_OOP.Task3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList <E> implements List {
  private Entry header;
  private int size;
  
  public MyLinkedList() {
	header = new Entry(null,header,header);
	size = 0;
  }
  
  @Override
  public int size() {
	return size;
  }
  
  @Override
  public boolean isEmpty() {
	return (size<=0);
  }
  
  @Override
  public boolean contains(Object o) {
	return false;
  }
  
  @Override
  public Iterator iterator() {
	return null;
  }
  
  @Override
  public Object[] toArray() {
	return new Object[0];
  }
  
  @Override
  public boolean add(Object o) {
	Entry newEntry = new Entry(o, header, header.previous);
	newEntry.previous.next=newEntry;
	newEntry.next.previous=newEntry;
	size++;
	return false;
  }
  
  @Override
  public boolean remove(Object o) {
	return false;
  }
  
  @Override
  public boolean addAll(Collection c) {
	return false;
  }
  
  @Override
  public boolean addAll(int index, Collection c) {
	return false;
  }
  
  @Override
  public void clear() {
	
  }
  
  @Override
  public Object get(int index) {
    return entry(index).element;
  }
  
  @Override
  public Object set(int index, Object element) {
    Entry entry = entry(index);
    entry.element=element;
	return entry.element;
  }
  
  @Override
  public void add(int index, Object element) {
	Entry oldEntry = entry(index);
	Entry newEntry = new Entry(element,oldEntry.next,oldEntry);
	oldEntry.next.previous=newEntry;
	oldEntry.next=newEntry;
  }
  
  @Override
  public Object remove(int index) {
    Entry entryToDelete = entry(index);
	E result = (E) entryToDelete.element;
	entryToDelete.previous.next = entryToDelete.next;
	entryToDelete.next.previous = entryToDelete.previous;
	entryToDelete.next = entryToDelete.previous = null;
	entryToDelete.element = null;
	size--;
	
	return result;
  }
  
  @Override
  public int indexOf(Object o) {
	return 0;
  }
  
  @Override
  public int lastIndexOf(Object o) {
	return 0;
  }
  
  @Override
  public ListIterator listIterator() {
	return null;
  }
  
  @Override
  public ListIterator listIterator(int index) {
	return null;
  }
  
  @Override
  public List subList(int fromIndex, int toIndex) {
	return null;
  }
  
  @Override
  public boolean retainAll(Collection c) {
	return false;
  }
  
  @Override
  public boolean removeAll(Collection c) {
	return false;
  }
  
  @Override
  public boolean containsAll(Collection c) {
	return false;
  }
  
  @Override
  public Object[] toArray(Object[] a) {
	return new Object[0];
  }
  
  
//  пробегает по всему списку в поисках элемента с указанным индексом
  private Entry<E> entry(int index)
  {
	if (index < 0 || index >= size)
	  throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
	
	Entry<E> entry = header;
	
//	Направление обхода определяется условием
	if (index < (size >> 1))
	{
	  for (int i = 0; i <= index; i++)
		entry = entry.next;
	}
	else
	{
	  for (int i = size; i > index; i--)
		entry = entry.previous;
	}
	
	return entry;
  }
  
  public static class Entry<E> {
	
	E element;
	Entry<E> next;
	Entry<E> previous;
	
	public Entry(E element, Entry<E> next, Entry<E> previous) {
	  this.element = element;
	  this.next = next;
	  this.previous = previous;
	}
  }
}
