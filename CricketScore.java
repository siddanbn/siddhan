package Raj;
import java.util.Scanner;
public class CricketScore {
	public static void main(String [] args) {
	int FirstScore=0;
	int SecondScore=0;
		Scanner	sc= new Scanner(System.in);
		System.out.println("Enter First team score");
		FirstScore=sc.nextInt();
		System.out.println("Enter Second team score");
		SecondScore=sc.nextInt();
		 if(SecondScore != (FirstScore + 7)) {
			System.out.println("Invalid ");
		}
		 else if(FirstScore > SecondScore) {
			System.out.println("First Team is the Winner");
		}
			else if(SecondScore > FirstScore) {
				System.out.println("Second Team is the Winner");
				}
			else if(FirstScore == SecondScore) {
				System.out.println("Match is Draw");
				
			}
			}

}
