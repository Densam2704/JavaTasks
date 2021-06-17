package Part3_Recursion.Task1;

//Задача:
//
//Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
//Используйте перебор и двоичный поиск для решения этой задачи.
//Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
public class Task1 {
  private int[] ints = {0, 1, 2, 2, 1, 3, 4, 9, 10, 11, -1, 3, 2, 15};
  
  public Task1() {
	
	System.out.println(intArrayToString(generateRandomIntArray(10, 10, 1)));
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
}
