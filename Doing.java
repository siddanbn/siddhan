package practice;

import java.util.Scanner;

public class Doing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		 int pwd=0;
		 
		 do {
			 if(pwd==0)
           System.out.println("Enter your password");
			 else 
				 System.out.println("Incoreect password:"+"Enter your password again");
				 pwd=sc.nextInt();
				 i++;
				 if (i==10)
					 break;
			 }while(pwd!=1234); 
				 System.out.println("Your password is correct");
			 
		 }}
