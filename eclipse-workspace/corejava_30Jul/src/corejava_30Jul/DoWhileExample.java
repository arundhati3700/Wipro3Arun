package corejava_30Jul;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your name : ");
			System.out.println("Welcome " + sc.nextLine());
			count++;
			
			System.out.println("To enter more names, press [1], [0] to quit.");
			choice = sc.nextInt();
			sc.nextLine();
		}while(choice!=0);
		System.out.println("You entered " + count + " names ");
		sc.close();

	}

}
