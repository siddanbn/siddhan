package practice;
import java.util.Scanner;
public class Naturalno {
public static void main(String[] args) {
	int n=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length:");
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		System.out.println(i+"");
		if(i==10)
			break;
	}
	System.out.println("This is after for loop");
	
	for(int i=1; i<=n;i++)
	{
		if(i==10)
			continue;
		System.out.println(i+" ");
	}
		
	}    

}
