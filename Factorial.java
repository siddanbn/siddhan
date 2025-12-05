package practice;
import java.util.Scanner;
public class Factorial {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n= sc.nextInt();
long fact = 1;
for (int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("Factorial ="+fact);
}
}

//for(int i=n;i>0;i--) can also be used