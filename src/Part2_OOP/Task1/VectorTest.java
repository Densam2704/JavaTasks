package Part2_OOP.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
  Vector vector1, vector2;
  double x1, y1, z1, x2, y2, z2;
  
  @BeforeEach
  void setUp() {
	vector1 = new Vector(1, 2, 3);
	vector2 = new Vector(-1, 0, 1);
	x1 = vector1.getX();
	x2 = vector2.getX();
	y1 = vector1.getY();
	y2 = vector2.getY();
	z1 = vector1.getZ();
	z2 = vector2.getZ();
	
  }
  
  @Test
  void testSum() {
	Vector sum = vector1.sum(vector2);
	assertEquals(sum.getX(), x1+x2, "testSum x failed");
	assertEquals(sum.getY(), y1+y2, "testSum y failed");
	assertEquals(sum.getZ(), z1+z2, "testSum z failed");
  }
  
  @Test
  void testDif() {
	Vector dif = vector1.dif(vector2);
	assertEquals(dif.getX(), x1-x2, "testDif x failed");
	assertEquals(dif.getY(), y1-y2, "testDif y failed");
	assertEquals(dif.getZ(), z1-z2, "testDif z failed");
  }
  
  @Test
  void testLength() {
	double length = vector1.length();
	assertEquals(length, Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1), "testLength failed");
  }
  
  @Test
  void testScalarProduct() {
	double scalarProduct = vector1.scalarProduct(vector2);
	assertEquals(scalarProduct, x1 * x2 + y1 * y2 + z1 * z2, "testScalarProduct failed");
  }
  
  @Test
  void testVectorProduct() {
	Vector vectorProduct = vector1.vectorProduct(vector2);
//    (y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2)
	assertEquals(vectorProduct.getX(), y1 * z2 - z1 * y2, "testScalarProduct failed");
	assertEquals(vectorProduct.getY(), z1 * x2 - x1 * z2, "testScalarProduct failed");
	assertEquals(vectorProduct.getZ(), x1 * y2 - y1 * x2, "testScalarProduct failed");
  }
  
  @Test
  void testAngle(){
    double angle = ( x1 * x2 + y1 * y2 + z1 * z2) / ( Math.sqrt(x1*x1+y1*y1+z1*z1)*Math.sqrt(x2*x2+y2*y2+z2*z2));
    assertEquals(vector1.vectorAngleCos(vector2),angle,"testAngle failed");
  }
  
  @Test
  void testRandomVectorArraySize(){
    int size = 5;
    Vector[]vectors=Vector.generateRandomVectors(size);
    //Checking array size and given size
    assertEquals(vectors.length,size, "testRandomVectorArraySize failed");
    
  }
}