package practice;
import java.util.Scanner;
public class digitssum {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=sc.nextInt();
  while(n>0) {
	  sum+=n%10;
	  n=n/10;
  }
  System.out.println("Sum of digits = "+sum);
	}

}
