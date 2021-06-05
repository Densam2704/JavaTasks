package Part2_OOP.Task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
  private MyLinkedList<String> singleElementList = new MyLinkedList<>();
  private MyLinkedList<String> multipleElementsList = new MyLinkedList<>();
  private MyLinkedList<String> emptyList = new MyLinkedList<>();
  
  //  @BeforeAll
//  void initialize() {
//  }
//
  @BeforeEach
  void initialise() {
	singleElementList = new MyLinkedList<>();
	multipleElementsList = new MyLinkedList<>();
	emptyList = new MyLinkedList<>();
	singleElementList.add("Hello");
	multipleElementsList.add("hello");
	multipleElementsList.add("world");
	multipleElementsList.add("hello");
	multipleElementsList.add("hello");
  }
  
  
  @Test
  void addToEnd() {
	emptyList.add("Hello");
	assertEquals(1, emptyList.size(), "Add test. Add to empty test failed. ");
	singleElementList.add("Hello");
	assertEquals(2, singleElementList.size(), "Add test. Add to singleElement list test failed.");
	multipleElementsList.add("hello");
	assertEquals(5, multipleElementsList.size(), "Add test. Add to multipleElementList test failed.");
  }
  
  @Test
  void size() {
	assertEquals(0, emptyList.size(), "Size Test. Empty list test failed");
	assertEquals(1, singleElementList.size(), "Size Test. Single element test failed");
	assertEquals(4, multipleElementsList.size(), "Size Test. Single element test failed");
  }
  
  @Test
  void isEmpty() {
	assertTrue(emptyList.isEmpty(), "isEmpty Test. Empty list test failed");
	assertFalse(singleElementList.isEmpty(), "isEmpty Test. Single list test failed");
	assertFalse(multipleElementsList.isEmpty(), "isEmpty Test. Multiple element list test failed");
  }
  
  @Test
  void contains() {
	assertTrue(multipleElementsList.contains("hello"), "Contains Test failed. MultipleElementList " +
			"should contain element .");
	assertFalse(multipleElementsList.contains("AAA"), "Contains Test failed. MultipleElementList " +
			"should not contain element");
  }
  
  @Test
  void iterator() {
  }
  
  @Test
  void toArray() {
  }
  
  
  @Test
  void removeAtIndex() {
	int index = 2;
	int sizeBefore = multipleElementsList.size();
	multipleElementsList.remove(index);
	assertNotEquals(sizeBefore, multipleElementsList.size(), "RemoveAtIndex failed." +
			" MultipleList size is wrong");
	
	index = 0;
	sizeBefore = singleElementList.size();
	singleElementList.remove(index);
	assertNotEquals(sizeBefore, singleElementList.size(), "RemoveAtIndex failed." +
			" SingleList size is wrong");
	
  }
  
  @Test
  void removeByObject() {
	String strToRemove = "world";
	multipleElementsList.remove(strToRemove);
	assertFalse(multipleElementsList.contains(strToRemove),
			"removeByObject failed. multipleList should have not contained removed string");
	
	strToRemove = "hello";
	multipleElementsList.remove(strToRemove);
	assertTrue(multipleElementsList.contains(strToRemove),
			"removeByObject failed. multipleList should have contained copies of removed string");
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
    assertEquals("Hello",singleElementList.get(0),
			"get failed. It should have returned different value");
	assertEquals("world",multipleElementsList.get(1),
			"get failed. It should have returned different value");
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