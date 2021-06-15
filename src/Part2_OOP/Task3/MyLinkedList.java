package Part2_OOP.Task3;

import java.lang.reflect.Array;
import java.util.*;

public class MyLinkedList<E> implements List {
  private Entry header;
  private int size;
  
  public MyLinkedList() {
	header = new Entry(null, header, header);
	header.element = null;
	header.next = header;
	header.previous = header;
	size = 0;
  }
  
  @Override
  public int size() {
	return this.size;
  }
  
  @Override
  public boolean isEmpty() {
	return (size <= 0);
  }
  
  @Override
  public boolean contains(Object object) {
	Entry entry = header;
	for (int i = 0; i < size; i++) {
	  if (object.equals(entry.element)) {
		return true;
	  }
	  entry = entry.next;
	}
	return false;
  }
  
  @Override
  public Iterator iterator() {
	return null;
  }
  
  @Override
  public Object[] toArray() {
	Object[] objects = new Object[size];
	Entry entry = header;
	for (int i = 0; i < size; i++) {
	  entry = entry.next;
	  objects[i] = (entry.element);
	}
	
	return objects;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Object[] toArray(Object[] type) {
	Object result = Array.newInstance(type.getClass(), size());
	Entry cursor = header;
	int index = 0;
	while (cursor != null) {
	  Array.set(result, index, cursor.element);
	  cursor = cursor.next;
	  index++;
	}
	return (E[]) result;
  }
  
  public <E> E[] toArray(E[] type, int size) {
	Object result = Array.newInstance(type.getClass(),size);
	Entry cursor = header;
	for (int i = 0; i < size; i++) {
	  cursor = cursor.next;
	  Array.set(result,i,(E)cursor.element);
	}
	
	return (E[]) result;
  }
//  @Override
//  @SuppressWarnings("unchecked")
//  public <E> E[] toArray(E[]a) {
//	E[] result = (E[])(new Comparable[size()]);
//
//	int counter = 0;
//
//	Entry cursor = header;
//	int index = 0;
//	while (cursor != null ){
//	  result[index] = (E) cursor.element;
//	  cursor = cursor.next;
//	  index++;
//	}
//	return result;
//  }

//  @Override
//  public <E> E[] toArray(E[] a) {
//    E objects = new a.getClass()[size];
//	Entry entry = header;
//	for (int i = 0; i < size; i++) {
//	  entry = entry.next;
//	  objects[i] = (E) (entry.element);
//	}
//
//	return objects;
//  }
//
//  public  E[] toArray(E[]a){
//
//  }
  
  @Override
  public boolean add(Object o) {
	Entry newEntry = new Entry(o, header, header.previous);
	newEntry.previous.next = newEntry;
	newEntry.next.previous = newEntry;
	
	size++;
	return false;
  }
  
  @Override
  public boolean remove(Object object) {
	Entry entry = header;
	for (int i = 0; i < size; i++) {
	  if (object.equals(entry.element)) {
		delete(entry);
		return true;
	  }
	  entry = entry.next;
	}
	return false;
  }
  
  private void delete(Entry entry) {
	entry.previous.next = entry.next;
	entry.next.previous = entry.previous;
	entry.next = entry.previous = null;
	entry.element = null;
	size--;
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
  public E get(int index) {
	return (entry(index).element);
  }
  
  public E getFirst() {
	return (entry(0).element);
  }
  
  public E getLast() {
	return (entry(size).element);
  }
  
  
  @Override
  public Object set(int index, Object element) {
	Entry entry = entry(index);
	entry.element = element;
	return entry.element;
  }
  
  @Override
  public void add(int index, Object element) {
	Entry oldEntry = entry(index);
	Entry newEntry = new Entry(element, oldEntry.next, oldEntry);
	oldEntry.next.previous = newEntry;
	oldEntry.next = newEntry;
  }
  
  @Override
  public Object remove(int index) {
	Entry entryToDelete = entry(index);
	E result = (E) entryToDelete.element;
	delete(entryToDelete);
	return result;
  }
  
  @Override
  public int indexOf(Object object) {
	Entry entry = header;
	for (int i = 0; i < size; i++) {
	  if (object.equals(entry.element)) {
		return i;
	  }
	  entry = entry.next;
	}
	return -1;
  }
  
  @Override
  public int lastIndexOf(Object object) {
	Entry entry = header;
	for (int i = size + 1; i > 0; i--) {
	  if (object.equals(entry.element)) {
		return i;
	  }
	  entry = entry.previous;
	}
	return -1;
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
  
  
  //  пробегает по всему списку в поисках элемента с указанным индексом
  private Entry<E> entry(int index) {
	if (index < 0 || index >= size)
	  throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	
	Entry<E> entry = header;

//	Направление обхода определяется условием
	if (index < (size >> 1)) {
	  for (int i = 0; i <= index; i++)
		entry = entry.next;
	} else {
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
