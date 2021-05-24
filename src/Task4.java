//Задача:
//
//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
public class Task4 {
  private int array[] = {0,2,0,1,2,3,2,2,1,0};
  private int numToDelete = 0;
  
  public Task4(){
  	printArray();
  	deleteNumFromArray(0);
	printArray();
	deleteNumFromArray(1);
	printArray();
	deleteNumFromArray(2);
	printArray();
	deleteNumFromArray(3);
  	printArray();
  }
  
  private void deleteNumFromArray(int numToDelete){
  
	System.out.println("Deleting "+numToDelete);
    int arrayCopy[] = new int[getLengthWithoutDeletedNum(numToDelete)];
    int arrayCopyIndex = 0;
	for (int i = 0; i < array.length; i++) {
	  if(array[i]!=numToDelete){
		arrayCopy[arrayCopyIndex]=array[i];
		arrayCopyIndex++;
	  }
	}
	array=arrayCopy;
  }
  
  private int getLengthWithoutDeletedNum(int numToDelete){
    int newLength=0;
	for (int i = 0; i < array.length; i++) {
	  if(array[i]!=numToDelete)
	    newLength++;
	}
	return newLength;
  }
  
  private void printArray(){
    String res="";
	if (array.length==0){
	  res="empty array";
	}
	for (int i :
			array) {
	  res+=String.format("%d ",i);
	}
	System.out.println(res);
  }
  
}
