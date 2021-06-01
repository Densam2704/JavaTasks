package Part2_OOP.Task1;

public class Vector {
  
  private double x;
  private double y;
  private double z;
  
  
  //  1) конструктор с параметрами в виде списка координат x, y, z
  public Vector(double x, double y, double z) {
	this.x = x;
	this.y = y;
	this.z = z;
  }
  
  //  2)метод, вычисляющий длину вектора sqrt (x^2+y^2+z^2). Корень можно посчитать с помощью Math.sqrt():
  public double length() {
	return Math.sqrt(x * x + y * y + z * z);
  }
  
  //  3)метод, вычисляющий скалярное произведение: x1*x2+y1*y2+z1*z2
  public double scalarProduct(Vector v) {
	return this.x * v.x + this.y * v.y + this.z * v.z;
  }
  
  //4)метод, вычисляющий векторное произведение с другим вектором: (y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2)
  public Vector vectorProduct(Vector v) {
	double x = this.y * v.z - this.z * v.y;
	double y = this.z * v.x - this.x * v.z;
	double z = this.x * v.y - this.y * v.x;
	
	return new Vector(x, y, z);
  }
  
  //5)метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен
// скалярному произведению векторов, деленному на произведение модулей (длин) векторов: (a,b) / (|a||b|)
  public double vectorAngleCos(Vector v) {
	if (this.length() != 0 && v.length() != 0)
	  return scalarProduct(v) / this.length() / v.length();
	else return 0;
  }
  
  //6)методы для суммы и разности: (x1+x2,y1+y2,z1+z2) (x1-x2,y1-y2,z1-z2)
  public Vector sum(Vector v) {
	return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
  }
  
  public Vector dif(Vector v) {
	return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
  }
  
  //7)статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
  public static Vector[] generateRandomVectors(int size) {
	if (size <= 0) return null;
	Vector[] vectors = new Vector[size];
	for (int i = 0; i < size; i++) {
	  vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
	}
	return vectors;
  }
  
  @Override
  public String toString() {
	return "{" + x +
			", " + y +
			", " + z +
			"}";
  }
  
  public double getX() {
	return x;
  }
  
  public void setX(double x) {
	this.x = x;
  }
  
  public double getY() {
	return y;
  }
  
  public void setY(double y) {
	this.y = y;
  }
  
  public double getZ() {
	return z;
  }
  
  public void setZ(double z) {
	this.z = z;
  }
}
