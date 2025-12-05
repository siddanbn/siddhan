package Raj;
import java.util.Scanner;
public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int number = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number");
  number = sc.nextInt();
  if (number < 0) {
	  int positive = -number;
	  System.out.println("Conversion number  "+positive);
  } else {
		  System.out.println("No Conversion  "+number);
  }
	}

}
