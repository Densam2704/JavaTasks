package Part3_Recursion.Task1;

public class Checker {
  public static final int NOT_FOUND = -1;
  
  public static int binarySearch(double[] array, double key) {
	return binarySearch(array,key,0,array.length);
  }
  
  private static int binarySearch(double[]array,double key,int startIndex,int endIndex){
	return NOT_FOUND;
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
