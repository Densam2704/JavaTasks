package Part3_Recursion.Task1;

public class Checker {
  public static final int NOT_FOUND = -1;
  
  /*
  Source: https://ru.wikipedia.org/wiki/Двоичный_поиск
  
  Определение значения элемента в середине структуры данных. Полученное значение сравнивается с ключом.
Если ключ меньше значения середины, то поиск осуществляется в первой половине элементов, иначе — во второй.
Поиск сводится к тому, что вновь определяется значение серединного элемента в выбранной половине и сравнивается с ключом.
Процесс продолжается до тех пор, пока не будет найден элемент со значением ключа или не станет пустым интервал для поиска.
   */
  
  public static int binarySearch(double[] array, double key) {
	return binarySearch(array, key, 0, array.length);
  }
  
  private static int binarySearch(double[] array, double key, int startIndex, int endIndex) {
	int middleIndex = (startIndex + endIndex) / 2;
	if (endIndex < startIndex) {
	  return NOT_FOUND;
	}
	//Found
	if (key == array[middleIndex]) {
	  return middleIndex;
	} //Searching Left
	else if (key < array[middleIndex]) {
	  return binarySearch(array, key, startIndex, middleIndex - 1);
	  //Seatching Right
	} else {
	  return binarySearch(array, key, middleIndex + 1, endIndex);
	}
	
  }
  
  public static int bruteForce(double[] array, double key) {
	for (int i = 0; i < array.length; i++) {
	  if (array[i] == key) {
		return i;
	  }
	}
	return NOT_FOUND;
  }
}
