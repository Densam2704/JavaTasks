package Part1_Basics;

//Задача:
//
//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
public class Task3 {
  private static int lowerBorder = 2;
  private static int upperBorder = 100;
  
  public Task3() {
	System.out.println("String of primes from " + lowerBorder + " to " + upperBorder);
	System.out.println(getStringOfPrimes());
  }
  
  private String getStringOfPrimes() {
	String result = "";
	for (int i = lowerBorder; i <= upperBorder; i++) {
	  boolean isPrime = true;
	  for (int j = lowerBorder; j < i; j++) {
		if (i % j == 0)
		  isPrime = false;
	  }
	  if (isPrime)
		result += String.format("%d ", i);
	}
	return result + "\n";
  }
}
