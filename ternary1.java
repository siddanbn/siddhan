package practice;

public class ternary1 {
public static void main(String[] args) {
	int a=700;
	int b=600;
	int c=550;
	int d=450;
	int largest=(a > b && a > c && a > d) ? a :
        (b > c && b > d) ? b :
        (c > d ) ? c : d;
	System.out.println("Largest number is ="+largest);
		
}
}
