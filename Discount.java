package practice;

import java.util.Scanner;

public class Discount {
		public static void main(String[] args) {
			int n=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Amount:");
			n=sc.nextInt();
			if (n < 1000) {
				System.out.println("no discount");
			}
				else if(n>1000) {
					int discount=(n*8)/100;
					System.out.println("Amount after discount ="+(n-discount));
				
			}
				else if (n>2000){
					int disc =(n*15)/100;
					System.out.println("Amount after discount:"+(n-disc));
					
				}

	}

}
