package Raj;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo polydemo = new PolymorphismDemo();
		System.out.println("Circle area " + polydemo.area(12.00));
		System.out.println("Rectangle area " + polydemo.area(10.20));
		System.out.println("Square area " + polydemo.area(6));
	}
        public int area(int side) {
        	int area = side * side;
        	return area;
        }
        public double area(int length, int breadth) {
        	double area = length * breadth;
        	return area;
        }
        public double area(double radius) {
        	double area = 3.14 * radius * radius;
        	return area;
        }
}
