package Raj;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int number = sc.nextInt();
		  while(number > 0) {
			  sum+= number % 10;
			  number =number / 10;
		  }
		  System.out.println("Sum of digits = "+sum);
			}

	}


