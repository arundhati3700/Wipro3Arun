package corejava_30Jul;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Use of Scanner Class : ");
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your marks : ");
		float marks = sc.nextFloat();
		
		System.out.println("Name : " + name + "\nAge" + age + "\nMarks : " + marks);
		
		sc.close();

	}

}
