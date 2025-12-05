package practice;
import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size");
	String size=sc.nextLine();
	int price;
	switch (size) {
	case"small":
		price=125;
		System.out.println("Price of small ="+price);
		break;
	case "medium":
		price=250;
		System.out.println("Price of Medium ="+price);
		break;
	case "large":
		price=300;
		System.out.println("Price of Large ="+price);
		break;
	case "very large":
		price=350;
		System.out.println("Price of Very ="+price);
		break;
	default:
		System.out.println("Invalid size");
		break;
}
}}

