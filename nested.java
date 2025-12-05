package practice;

import java.util.Scanner;

public class nested {
	public static void main(String[] args) {
		int unit=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Used units:");
		unit=sc.nextInt();

		if (unit<30){
			double amount=(unit * 3.50);
			System.out.println("units amount ="+amount);
		}
			if(unit>=30 && unit<50) {
				double amou=(unit * 4.25);
				System.out.println("Units amount = "+amou);
			}
			else if(unit>=50 && unit < 100) {
				double amo=(unit * 5.25);
				System.out.println("Amount of units ="+amo);
			}
			else if(unit >= 100)  {
				double amut=(unit * 5.85);
				System.out.println("units amount"+amut);
			}
			else {
				System.out.println("No units entered");
				
				
			}
		}
			
		}

