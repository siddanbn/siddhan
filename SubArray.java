package Raj;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3,4,5,6,};
   System.out.println("Starting Index");
   System.out.println("End Index");
   SubArray.subArray(arr,2,5);
	}
   
    public static void subArray(int myarr[],int sindex,int eindex) {
     for (int i= sindex;i<eindex;i++) {
    	 System.out.println(myarr[i]);
     }
     
    }
    }
    	
    