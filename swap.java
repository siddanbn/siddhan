package practice;

public class swap {
	public static void main(String[] args) {
		int a,b,temp;
		a=1;
		b=2;
		System.out.println("Number 1 before swap ="+a);
		System.out.println("Number 2 before swap ="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number 1 after swap ="+a);
		System.out.println("Number 2 after swap ="+b);
		
		
		
		//swap without using temp variable
		int x=10;
		int y=20;
		System.out. println("Before swap ="+x);
		System.out.println("Before swap ="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Number after swap ="+x);
		System.out.println("Number after swap ="+y);
		
		
		
	}

}
