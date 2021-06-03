package Part2_OOP.Task2;

import java.util.ArrayList;

//Задача:
//
//Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
//Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
//Пример:
//Дан массив [1, 2, 3], и массив весов [1, 2, 10].
//В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
public class Task2 {
  private int[] values = {1, 2, 3};
  private int[] weights = {1, 2, 10};
  private Randomizer randomizer = new Randomizer(values, weights);
  private ArrayList<Integer> generatedValues = new ArrayList<>();
  
  public Task2() {
	
	initialise();
	generateValues(100);
	countGeneratedValues();
	
  }
  
  private void initialise() {
	System.out.println(" Array: ");
	for (int value :
			values) {
	  System.out.print(value + " ");
	}
	System.out.println();
	System.out.println(" Weights: ");
	for (int weight :
			weights) {
	  System.out.print(weight + " ");
	}
	System.out.println();
  }
  
  private void generateValues(int number) {
	System.out.println(" Generated " + number +" values: ");
	for (int i = 0; i < number; i++) {
	  generatedValues.add(i, randomizer.getRandomValue());
	  System.out.print(generatedValues.get(i) + " ");
	}
	System.out.println();
  }
  
  private void countGeneratedValues() {
	for (int value :
			values) {
	  int counter = 0;
	  for (int generatedValue :
			  generatedValues) {
		if (generatedValue == value)
		  counter++;
	  }
	  System.out.println(" Number of value '" + value + "' is " + counter);
	}
  }
  
}
