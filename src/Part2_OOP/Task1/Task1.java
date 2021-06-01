package Part2_OOP.Task1;

/*
Создайте класс, который описывает вектор (в трёхмерном пространстве).

У него должны быть:

1) конструктор с параметрами в виде списка координат x, y, z

2)метод, вычисляющий длину вектора sqrt (x^2+y^2+z^2). Корень можно посчитать с помощью Math.sqrt():

3)метод, вычисляющий скалярное произведение: x1*x2+y1*y2+z1*z2

4)метод, вычисляющий векторное произведение с другим вектором: (y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2)

5)метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен
 скалярному произведению векторов, деленному на произведение модулей (длин) векторов: (a,b) / (|a||b|)
 
6)методы для суммы и разности: (x1+x2,y1+y2,z1+z2) (x1-x2,y1-y2,z1-z2)

7)статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый.
То есть, нужно реализовать шаблон "Неизменяемый объект"

* */
public class Task1 {
  public Task1() {
	System.out.println("Don't forget to check out Vector Test!");
	System.out.println("\nCreating array of 2 random vectors");
	Vector[] vectors = Vector.generateRandomVectors(2);
	for (Vector v :
			vectors) {
	  System.out.println("Vector " + v.toString());
	}
	System.out.println();
	System.out.println("sum vector = " + vectors[0].sum(vectors[1]).toString());
	System.out.println("dif vector = " + vectors[0].dif(vectors[1]).toString());
	System.out.println("len vector1 = " + vectors[0].length());
	System.out.println("len vector2 = " + vectors[1].length());
	System.out.println("scalar product = " + vectors[0].scalarProduct(vectors[1]));
	System.out.println("vector product = " + vectors[0].vectorProduct(vectors[1]).toString());
	System.out.println("cos = " + vectors[0].vectorAngleCos(vectors[1]));
  }
}
