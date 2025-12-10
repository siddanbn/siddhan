package Raj;
import java.util.Scanner;
public class StudentsObjects { 
	    String Name;
	    int Age;
	    int Id;

	  
	    StudentsObjects(String Name, int Age, int Id) {
	        this.Name = Name;
	        this.Age = Age;
	        this.Id = Id;
	    }

	    
	    public String toString() {
	        return "Student ID: " + Id + ", Name: " + Name + ", Age: " + Age;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int Students = 0;
	        System.out.println("Enter number of Students");
	        Students = scanner.nextInt();

	        StudentsObjects[] students = new StudentsObjects[Students];

	  
	        for (int i = 0; i < Students; i++) {
	            System.out.println("Enter details for student " + (i + 1));

	            System.out.print("Enter ID: ");
	            int id = scanner.nextInt();
	            scanner.nextLine(); 

	            System.out.print("Enter name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter age: ");
	            int age = scanner.nextInt();

	            students[i] = new StudentsObjects(name, age, id);
	            System.out.println();
	        }

	    
	        System.out.println("Student details:");
	        for (int i = 0; i < students.length; i++) {
	            System.out.println(students[i]);
	        }

	        scanner.close();
	    }
	}

