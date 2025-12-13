package Raj;

import java.util.Scanner;

public class MainClasse {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			int No = sc.nextInt();
			StudentExpenses students[] = new StudentExpenses[No];
			for(int i = 0; i < students.length; i++) {
				System.out.println("Enter the details of "+(i+1)+"student");
				System.out.println("Enter student "+(i+1)+" id");
				int stdId = sc.nextInt();
				System.out.println("Enter student "+(i+1)+" Name");
				String stdName = sc.nextLine();
				System.out.println("Enter student "+(i+1)+" Expenses papaa");
				double stdExpense = sc.nextDouble();
				
				students[i] = new StudentExpenses(stdId, stdName, stdExpense) ;
			}
			for(int i = 0; i < students.length; i++)	{
				System.out.println("The Student Id is "+students[i].Id);
				System.out.println("The Student Name is "+students[i].Name);
				System.out.println("The Student Expenses is "+students[i].Expenses);
				
			}

				
			}
		
	}
