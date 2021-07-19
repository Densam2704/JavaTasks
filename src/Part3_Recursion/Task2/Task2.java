package Part3_Recursion.Task2;
//Найдите корень уравнения cos(x^5) + x^4 - 345.4 * x - 23 = 0
//на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
//Используйте для этого метод деления отрезка пополам (и рекурсию).

public class Task2 {
  public Task2() {
	Equation equation = new Equation(0, 10, 0.001);
	System.out.println(equation.toString());
	System.out.println("Root " + equation.doBisectionAlgorythm() + " was found after " + equation.iteration + " iterations");
  }
  
  
  public static class Equation {
	int iteration = 0;
	double start;
	double end;
	double accuracy;
	
	public Equation(double start, double end, double accuracy) {
	  this.start = start;
	  this.end = end;
	  this.accuracy = accuracy;
	}
	
	public static double getY(double x) {
	  return Math.cos(x * x * x * x * x) + x * x * x * x - 345.4 * x - 23;
	}
	
	public boolean isYPositive(double x) {
	  return getY(x) > 0;
	}
	
	public double doBisectionAlgorythm() {
	  return bisection();
	}
	
	private double bisection() {
	  iteration++;
	  if (getY(start) == 0) {
		return start;
	  }
	  if (getY(end) == 0) {
		return end;
	  }
	  double middle = (start + end) / 2;
	  if (Math.abs(end - start) > accuracy) {
		
		if (isYPositive(start) != isYPositive(middle)) {
		  end = middle;
		} else
		  start = middle;
		return bisection();
	  } else
		return middle;
	}
	
	@Override
	public String toString() {
	  return "cos(x^5) + x^4 - 345.4 * x - 23 = 0" + "\n"
			  + "[" + start + " ," + end + "]" + "\n" +
			  "accuracy = " + accuracy;
	  
	}
  }
}
