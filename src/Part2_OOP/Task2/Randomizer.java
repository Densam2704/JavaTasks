package Part2_OOP.Task2;

import java.util.ArrayList;

public class Randomizer {
  int[] values;
  int[] weights;
  
  public Randomizer(int[] values, int[] weights) {
	this.values = values;
	this.weights = weights;
  }
  
  //Creates arrayList of values which has duplicates. Number of duplicates equals to weight.
  //Gets random value from arrayList.
  public int getRandomValue() {
	ArrayList<Integer> weightedValues = new ArrayList<>();
	for (int i = 0; i < this.values.length; i++) {
	  for (int j = 0; j < weights[i]; j++) {
		weightedValues.add(values[i]);
	  }
	}
	int randomIndex = (int) (Math.random() * weightedValues.size());
//	System.out.println("generation of random index: " + randomIndex);
	int randomValue = weightedValues.get(randomIndex);
	return randomValue;
  }
}
