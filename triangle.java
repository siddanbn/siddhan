package practice;
import java.util.Scanner;
public class triangle {
public static void main(String[]args) {
	int n=0;
	int sum=0;{
    System.out.println("Enter n Number");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
	 System.out.println("\nFirst "+n+"natural number");
	 for(int i=1;i<=n;i++) {
		 sum+=i;
		 System.out.println(""+sum);
	 }
	
}
}}
