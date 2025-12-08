package Raj;

import java.util.Scanner;

public class SumOfMatrixs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the no of Rows");
	    int row = sc.nextInt();
	    System.out.println("Enter the no of Columns");
	    int colmns = sc.nextInt();
	    int Matrix1[][] = new int [row][colmns];
	    int Matrix2[][] = new int [row][colmns];
	    int Matrixsum[][] = new int [row][colmns];   
	    for (int i = 0; i < Matrix1.length; i++ ) {
	    	   for(int j = 0; j< Matrix1[i].length; j++) {
	    		   System.out.println("Enter the Matrix1 Value for row "+(i+1)+" and columns "+(j+1));
	    		   Matrix1[i][j] = sc.nextInt();
	    	   }
	    }
	    System.out.println("+++++++++++++++++++++++++++");
	    for (int i = 0; i < Matrix2.length; i++ ) {
	    	   for(int j = 0; j< Matrix2[i].length; j++) {
	    		   System.out.println("Enter the Matrix2 Value for row "+(i+1)+" and columns "+(j+1));
	    		   Matrix2[i][j] = sc.nextInt(); 
	}
	    }
	    
	    for (int i = 0; i < Matrixsum.length; i++ ) {
	    	   for(int j = 0; j< Matrixsum[i].length; j++) {
	    		   Matrixsum[i][j] = Matrix1[i][j] + Matrix2[i][j];
	    		   
	    		   }
	    }
	    for (int i = 0; i < Matrixsum.length; i++ ) {
	    	   for(int j = 0; j< Matrixsum[i].length; j++) {
	    		  System.out.println("Sum of the Matrixs"); 
	    		  System.out.println(Matrixsum[i][j]+" ");
	    		   
	}
	    	   System.out.println();
	    }
	  
	}

}
