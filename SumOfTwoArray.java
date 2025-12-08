package Raj;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the no of Rows");
    int row = sc.nextInt();
    System.out.println("Enter the no of Columns");
    int colmns = sc.nextInt();
    int arr[][] = new int [row][colmns];
    for (int i = 0; i < arr.length; i++ ) {
    	   for(int j = 0; j< arr[i].length; j++) {
    		   System.out.println("Enter the Value for row "+(i+1)+" and columns "+(j+1));
    		   arr[i][j] = sc.nextInt();
    	   }
    }
    int sum = 0 ;
    
    for (int i = 0; i < arr.length; i++ ) {
 	   for(int j = 0; j< arr[i].length; j++) {
 		   sum = sum + arr[i][j];
 	   }
   System.out.println();
	}
   System.out.println("The sum of the array elements is "+sum);
}
}

