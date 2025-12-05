package practice;
import java.util.Scanner;

public class array5 {
public static void main (String[] args) {
	int arr[]=new int[5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=4;
	arr[3]=5;
	arr[4]=6;
	System.out.println(arr[2]);
	
	//Declare an array initialize with user input and print array elements.

	Scanner scn =new Scanner(System.in);
	int no;
	System.out.println("Enter your required array elements");
	no=scn.nextInt();
	int arra[]=new int[no];
	System.out.println("Enter array elements one by one");
	for(int i=0;i<no;i++) {
		arr[i]=scn.nextInt();
	}
		System.out.println("Array elementsare:");
		for(int i=0;i<no;i++) {
			System.out.println(arr[i]);
			
		}
		scn.close();

	
}
}
  
