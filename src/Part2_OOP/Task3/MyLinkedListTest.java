package Part2_OOP.Task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
  private MyLinkedList<String> singleElementList;
  private MyLinkedList<String> multipleElementsList;
  private MyLinkedList<String> emptyList;
  
  @BeforeAll
  void initialize() {
	singleElementList.add("Hello");
	multipleElementsList.add("hello");
	multipleElementsList.add("world");
	multipleElementsList.add("hello");
	multipleElementsList.add("hello");
	
  }
  
  @Test
  void size() {
	assertEquals(emptyList.size(), 0, "Size Test. Empty list test failed");
	assertEquals(singleElementList.size(), 1, "Size Test. Single element test failed");
	assertEquals(multipleElementsList.size(), 4, "Size Test. Single element test failed");
  }
  
  @Test
  void isEmpty() {
    assertEquals(emptyList.isEmpty(),true,"isEmpty Test. Empty list test failed");
    assertEquals(singleElementList.isEmpty(),false,"isEmpty Test. Single list test failed");
    assertEquals(emptyList.isEmpty(),false,"isEmpty Test. Multiple element list test failed");
  }
  
  @Test
  void contains() {
  }
  
  @Test
  void iterator() {
  }
  
  @Test
  void toArray() {
  }
  
  @Test
  void add() {
  }
  
  @Test
  void remove() {
  }
  
  @Test
  void addAll() {
  }
  
  @Test
  void testAddAll() {
  }
  
  @Test
  void clear() {
  }
  
  @Test
  void get() {
  }
  
  @Test
  void set() {
  }
  
  @Test
  void testAdd() {
  }
  
  @Test
  void testRemove() {
  }
  
  @Test
  void indexOf() {
  }
  
  @Test
  void lastIndexOf() {
  }
  
  @Test
  void listIterator() {
  }
  
  @Test
  void testListIterator() {
  }
  
  @Test
  void subList() {
  }
  
  @Test
  void retainAll() {
  }
  
  @Test
  void removeAll() {
  }
  
  @Test
  void containsAll() {
  }
  
  @Test
  void testToArray() {
  }
}