package Raj;
import java.util.Scanner;
public class GreatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int FirstNo = 0;
      int SecondNo = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number for FirstNo");
      FirstNo = sc.nextInt();
      System.out.println("Enter number for SecondNo");
      SecondNo = sc.nextInt();
      if(FirstNo == 6 ) {
    	  System.out.println("True");}
      else if(SecondNo == 6 ) {
    	  System.out.println("True");}
    	  else if( FirstNo + SecondNo == 6) {
    		  System.out.println("True");  
    	  }
    	  else if (FirstNo - SecondNo == 6) {
    		  System.out.println("True");  
      }
    	  else if (SecondNo - FirstNo == 6) {
    		  System.out.println("True");  
      }
    	  else {
    		  System.out.println("False");
    	  }
      
	}

}
