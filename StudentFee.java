package Raj;

public class StudentFee {
	int id;
	String firstName;
	String lastName;
	double fees;

	StudentFee(int id, String firstName, String lastName, double fees) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fees = fees;
	}

	String getName() {
		return firstName + " " + lastName;
	}

	double getFees() {
		return fees;
	}

	public static void main(String args[]) {
		StudentFee s1 = new StudentFee(1, "Ram", "Acharya", 150000.0);
		StudentFee s2 = new StudentFee(1, "Raj", "Acharya", 153000.0);
		StudentFee s3 = new StudentFee(1, "Sai Ram", "Acharya", 151000.0);

		System.out.println("Student 1   " + s1.getName() + "  Fees  " + s1.getFees());
		System.out.println("Student 2   " + s2.getName() + "  Fees  " + s2.getFees());
		System.out.println("Student 3   " + s3.getName() + "   Fees  " + s3.getFees());

	}
}


