// Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class Task2 {
  private static int LENGTH = 50;
  private double[] aDouble = new double[LENGTH];
  
  {
	System.out.println("Array:");
	for (int i = 0; i < LENGTH; i++) {
	  aDouble[i] = Math.random();
	  
	}
	System.out.println();
  }
  
  
  public Task2() {
	System.out.println("Array\n" + arrayToString());
	bubbleSortAsc();
	System.out.println("Ascending order\n" + arrayToString());
	bubbleSortDes();
	System.out.println("Descending order\n" + arrayToString());
  }
  
  
  public String arrayToString() {
	String result = "";
	for (Double f :
			aDouble) {
	  result += String.format("%f ", f);
	}
	return result + "\n";
  }
  
  //1,2,3,...
  private void bubbleSortAsc() {
	double buffer = 0;
	for (int i = 0; i < LENGTH - 1; i++) {
	  for (int j = 0; j < LENGTH - i - 1; j++) {
		if (aDouble[j] > aDouble[j + 1]) {
		  buffer = aDouble[j];
		  aDouble[j] = aDouble[j + 1];
		  aDouble[j + 1] = buffer;
		}
	  }
	}
  }
  
  //3,2,1,...
  private void bubbleSortDes() {
	double buffer = 0;
	for (int i = 0; i < LENGTH - 1; i++) {
	  for (int j = 0; j < LENGTH - i - 1; j++) {
		if (aDouble[j] < aDouble[j + 1]) {
		  buffer = aDouble[j];
		  aDouble[j] = aDouble[j + 1];
		  aDouble[j + 1] = buffer;
		}
	  }
	}
  }
}
