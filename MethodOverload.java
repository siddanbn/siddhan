package Raj;

public class MethodOverload {
	void display(int number) {
		System.out.println("Integer value: " + number);
	}

	void display(char character) {
		System.out.println("Character value: " + character);
	}

	void display(String string) {
		System.out.println("String value: " + string);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();

		obj.display(25);
		obj.display('A');
		obj.display("Java Method Overloading");
	}

}
