//Задача:
//
//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
public class Task1 {
  private static int LENGTH = 50;
  private double[] aDouble = new double[LENGTH];
  
  {
	System.out.println("Array:");
	for (int i = 0; i < LENGTH; i++) {
	  aDouble[i] = Math.random();
	  System.out.print(String.format("%f ", aDouble[i]));
	}
	System.out.println();
  }
  
  
  public Task1() {
	
	System.out.println("Max = " + max());
	System.out.println("Min = " + min());
	System.out.println("Avg = " + average());
  }
  
  private double max() {
	double max = aDouble[0];
	for (int i = 0; i < LENGTH; i++) {
	  if (aDouble[i] > max)
		max = aDouble[i];
	}
	return max;
  }
  
  private double min() {
	double min = aDouble[0];
	for (int i = 0; i < LENGTH; i++) {
	  if (aDouble[i] < min)
		min = aDouble[i];
	}
	return min;
  }
  
  private double average() {
	double sum = 0;
	for (int i = 0; i < LENGTH; i++) {
	  sum += aDouble[i];
	}
	return sum / aDouble.length;
  }
  
  
}
