package Part3_Recursion.Task1;


import java.util.Arrays;

//Задача:
//
//Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
//Используйте перебор и двоичный поиск для решения этой задачи.
//Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
public class Task1 {
  private int[] ints = {0, 1, 2, 2, 1, 3, 4, 9, 10, 11, -1, 3, 2, 15};
  private double[] doubles = {0.0, 0.1, -0.3, 0.2};
  
  private int arrayLength = 100000000;
  private int range = 1000;
  private int offset = -500;
  private double key;
  
  public Task1() {
	doubles = generateRandomDoubleArray(arrayLength, range, offset);
	System.out.println("Creating array of " + doubles.length + " doubles for comparing binary search and brute force search");
 
	for (int i = 0; i < 50; i++) {
	  
	  key=doubles[(int)(Math.random()*arrayLength)];
	  System.out.println("Searching for key = " + key);
	  doBruteForceSearch();
	  doBinarySearch();
	}

	
  }
  
  private int doBinarySearch() {
	
	System.out.println("\nBinary search");
	System.out.println("Binary search requires array to be sorted.\nSorting array.");
	long sortTime = System.nanoTime();
	Arrays.sort(doubles);
	
	System.out.println("Array was sorted");
	long startTime = System.nanoTime();
	int indexOfKey = Checker.binarySearch(doubles, key);
	long endTime = System.nanoTime();
	System.out.println("Binary search took " + (double)(endTime -startTime)/1000000000 +
			" seconds to look for key value without considering sort time");
	System.out.println("Binary search took " + (double)(endTime - sortTime)/1000000000 +
			" seconds to look for key value with considering sort time");
	if (indexOfKey == -1) {
	  System.out.println("Key was not found");
	} else {
	  System.out.println("Key was found");
	}
	return indexOfKey;
  }
  
  private int doBruteForceSearch() {
  
	System.out.println("\nBrute force");
	long startTime = System.nanoTime();
	int indexOfKey = Checker.bruteForce(doubles, key);
	long endTime = System.nanoTime();
	System.out.println("Brute force took " + (double)(endTime - startTime)/1000000000 + " seconds to look for key value");
	if (indexOfKey == -1) {
	  System.out.println("Key was not found");
	} else {
	  System.out.println("Key was found");
	}
	return indexOfKey;
  }
  private void generateKey(){
	System.out.println("Searching for key = " + key);
	  key = Math.random() * range + offset;
  }
  //  Returns random integer array with given length.
//  Random numbers are calculated according to following formula:
//  randomValue = randomFrom (0,range) + offset.
  public static int[] generateRandomIntArray(int length, int range, int offset) {
	if (length <= 0) return null;
	int[] array = new int[length];
	for (int i = 0; i < length; i++) {
	  array[i] = (int) (Math.random() * range) + offset;
	}
	return array;
  }
  
  //  Converts array of integers to one string.
  public static String intArrayToString(int[] array) {
	String result = "";
	for (int i = 0; i < array.length; i++) {
	  result += array[i] + " ";
	}
	result += "\n";
	return result;
  }
  
  //  Returns random double array with given length.
//  Random numbers are calculated according to following formula:
//  randomValue = randomFrom (0,range) + offset.
  public static double[] generateRandomDoubleArray(int length, double range, double offset) {
	if (length <= 0) return null;
	double[] array = new double[length];
	for (int i = 0; i < length; i++) {
	  array[i] = (double) (Math.random() * range) + offset;
	}
	return array;
  }
  
  //  Converts array of doubles to one string.
  public static String doubleArrayToString(double[] array) {
	String result = "";
	for (int i = 0; i < array.length; i++) {
	  result += array[i] + " ";
	}
	result += "\n";
	return result;
  }
}
