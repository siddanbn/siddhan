package Raj;

public class Employee {
	int id = 79;
	String name = "Archarya";
	double salary = 56454.6756;
	
	public void getSalary() {
		System.out.println("The salary is :  "+salary );
	}
	public void getName() {
		System.out.println("The Name is :  "+name );
	}
	public void getId() {
		System.out.println("The EId is :  "+id );
}

	public static void main(String args[]) {
		Employee emp = new Employee(); 
		emp.getSalary();
	   emp.getName();
       emp.getId();
		
	}
}
