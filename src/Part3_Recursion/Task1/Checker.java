package Part3_Recursion.Task1;

public class Checker {
  public static final int NOT_FOUND = -1;
  //  public Checker(){}
//  private int[] array;
//
//  public Checker(int[] array) {
//	this.array = array;
//  }
//
//  public int[] getArray() {
//	return array;
//  }
//
//  public void setArray(int[] array) {
//	this.array = array;
//  }
  
  public static int binarySearch(int[] array, int key) {
	return NOT_FOUND;
  }
  
  public static int bruteForce(int[] array, int key) {
	for (int i = 0; i < array.length; i++) {
	  if (array[i] == key) {
		return i;
	  }
	}
	return NOT_FOUND;
  }
}
