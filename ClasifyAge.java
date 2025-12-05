package Raj;
import java.util.Scanner;
public class ClasifyAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();

	        int i = age;   

	        while(i == age)  
	        {
	            if(age >= 0 && age <= 12)
	                System.out.println("Kid");

	            else if(age >= 13 && age <= 19)
	                System.out.println("Teenager");

	            else if(age >= 20 && age <= 40)
	                System.out.println("Youngster");

	            else if(age >= 41 && age <= 55)
	                System.out.println("Aged Man");

	            else if(age >= 56 && age <= 70)
	                System.out.println("Old Man");

	            else
	                System.out.println("Invalid Age");

	            i++; 
	        }
	    }
	
	}


