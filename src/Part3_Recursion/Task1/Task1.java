package Part3_Recursion.Task1;

//Задача:
//
//Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
//Используйте перебор и двоичный поиск для решения этой задачи.
//Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
public class Task1 {
  private int[] ints = {0, 1, 2, 2, 1, 3, 4, 9, 10, 11, -1, 3, 2, 15};
  private double[] doubles = {0.0, 0.1, -0.3, 0.2};
  
  public Task1() {
	int arrayLength = 1000000000;
	int range = 1000;
	int offset = -500;
	System.out.println("Creating array of " + arrayLength + " doubles for comparing binary search and brute force search");
	doubles=generateRandomDoubleArray(arrayLength,range,offset);
	ints=generateRandomIntArray(arrayLength,range,offset);
  }
  
  //  Returns random integer array with given length.
//  Random numbers are calculated according to following formula:
//  randomValue = randomFrom (0,range) + offset.
  private static int[] generateRandomIntArray(int length, int range, int offset) {
	if (length <= 0) return null;
	int[] array = new int[length];
	for (int i = 0; i < length; i++) {
	  array[i] = (int) (Math.random() * range) + offset;
	}
	return array;
  }
  
  //  Converts array of integers to one string.
  private static String intArrayToString(int[] array) {
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
  private static double[] generateRandomDoubleArray(int length, double range, double offset) {
	if (length <= 0) return null;
	double[] array = new double[length];
	for (int i = 0; i < length; i++) {
	  array[i] = (double) (Math.random() * range) + offset;
	}
	return array;
  }
  
  //  Converts array of doubles to one string.
  private static String doubleArrayToString(double[] array) {
	String result = "";
	for (int i = 0; i < array.length; i++) {
	  result += array[i] + " ";
	}
	result += "\n";
	return result;
  }
}
