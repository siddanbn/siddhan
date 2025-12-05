package practice;
import java.util.Scanner;
public class Arraywhile {
public static void main(String[] args) {
	int x=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	 x=sc.nextInt();
	
	while(x<200) {
		System.out.println("x ="+x);
		x=x+5;
	}
}
}
