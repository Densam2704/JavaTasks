package Part2_OOP.Task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
  private MyLinkedList<String> singleElementList = new MyLinkedList<>();
  private MyLinkedList<String> multipleElementsList = new MyLinkedList<>();
  private MyLinkedList<String> emptyList = new MyLinkedList<>();
  
  private LinkedList<String> expectedSingleElementList = new LinkedList<>();
  private LinkedList<String> expectedMultipleElementsList = new LinkedList<>();
  private LinkedList<String> expectedEmptyList = new LinkedList<>();
  
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
	
	expectedSingleElementList = new LinkedList<>();
	expectedMultipleElementsList = new LinkedList<>();
	expectedEmptyList = new LinkedList<>();
	
	expectedSingleElementList.add("Hello");
	expectedMultipleElementsList.add("hello");
	expectedMultipleElementsList.add("world");
	expectedMultipleElementsList.add("hello");
	expectedMultipleElementsList.add("hello");
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
    Object[] multipleStringsObjects = multipleElementsList.toArray();
    assertEquals("[hello, world, hello, hello]",Arrays.toString(multipleStringsObjects),"toArray() failed");
	System.out.println(Arrays.toString(multipleStringsObjects));
	
  }
  
  @Test
  void toArrayWithParam(){
	String[] strings = new String[multipleElementsList.size()];
	strings=multipleElementsList.toArray(strings);
	for (int i = 0; i < multipleElementsList.size(); i++) {
	  assertEquals(multipleElementsList.get(i),strings[i],"toArrayWithParam failed");
	}
//	System.out.println(strings[0]);
  }
  
  
  @Test
  void removeAtIndex() {
	
	MyLinkedList<String> copy = multipleElementsList;
	int sizeBefore = copy.size();
	int index = 2;
	multipleElementsList.remove(index);
	assertEquals(sizeBefore - 1, multipleElementsList.size(), "RemoveAtIndex failed." +
			" MultipleList size is wrong");
	
	expectedMultipleElementsList.remove(index);
	for (int i = 0; i < multipleElementsList.size(); i++) {
	  assertEquals(expectedMultipleElementsList.get(i), multipleElementsList.get(i), "RemoveAtIndex failed "
			  + " expected and actual MultipleElementLists do not match");
	}
	
	
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
	assertEquals(expectedSingleElementList.get(0), singleElementList.get(0),
			"get failed. Expected and actual SingleElementLists do not match");
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
	assertEquals(2, multipleElementsList.indexOf("world"), "indexOf 1 rep failed. ");
	assertEquals(1, multipleElementsList.indexOf("hello"), "indexOf multiple reps failed");
  }
  
  @Test
  void lastIndexOf() {
	assertEquals(2, multipleElementsList.lastIndexOf("world"), "lastIndexOf 1 rep failed");
	assertEquals(4, multipleElementsList.lastIndexOf("hello"), "lastIndexOf multiple reps failed");
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