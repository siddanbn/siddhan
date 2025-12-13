package Raj;
import java.util.Scanner;
public class StudentExpenses {
	int Id;
	double Expenses;
	String Name;

	public StudentExpenses(int Id, String Name, Double Expenses) {
		super();
		this.Id = Id;
		this.Expenses = Expenses;
		this.Name = Name;
	}

	public void getId() {
		System.out.println("The id of the Student is " + Id);
	}

	public void getName() {
		System.out.println("The name of the student is " + Name);
	}

	public void getExpenses() {
        System.out.println("The total expenses of the student "+Name+" is " +Expenses);   
	}
}

