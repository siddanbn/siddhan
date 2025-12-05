package Raj;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {3,4,5,7,8};
 for(int i=0; i <= arr.length - 1; i++) {
	 if(isPrime(arr[i])) {
		 System.out.println(i+" is a Prime Number");
	 }
	 else {
		 System.out.println(i+" Not a Prime Number");
	 }
	 
 }
	}
    public static boolean isPrime(int n) {
    	if(n <= 1) {
    		return false;
    	}
    	for(int i = 2; i<=Math.sqrt(n);i++) {
    		if(n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
