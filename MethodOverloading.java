package Raj;

public class MethodOverloading {
	 void display() {
	        System.out.println("Display method with no parameters");
	    }

	    void display(int integer) {
	        System.out.println("Display method with one integer: " + integer);
	    }

	    void display(int a, int b) {
	        System.out.println("Display method with two integers: " + a + " and " + b);
	    }

	    void display(String msg) {
	        System.out.println("Display method with string: " + msg);
	    }

	    public static void main(String[] args) {
	        MethodOverloading object = new MethodOverloading();

	        object.display();
	        object.display(10);
	        object.display(10, 20);
	        object.display("Method Overloading in Java");
	    }
	}


