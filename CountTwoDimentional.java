package Raj;

import java.util.Scanner;

public class CountTwoDimentional {
   public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int array [][] = new int[3][3];
	int count1to50 = 0; int count51to100 = 0; int countabove100 = 0;
	System.out.println("Enter 9 integer numbers");
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			array[i][j] = sc.nextInt();
			if(array[i][j] >= 1 && array[i][j] <= 50) {
				count1to50++;
			} else if(array[i][j] >= 51 && array[i][j] <= 100){
				count51to100++;
			}else if (array[i][j] > 100) {
				countabove100++;
			}
		}
	}
	System.out.println("Count of number above 1 and below  50  "+count1to50+"  in numbers");
	System.out.println("Count of number above 51 and below  100  "+count51to100+"  in numbers");
	System.out.println("Count of number above 100  "+countabove100+"  in numbers");
}
	
	
}
