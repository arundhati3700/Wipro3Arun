package corejava_30Jul;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your grade : ");
		float grade = sc.nextFloat();
		
		System.out.println("Name : " + name);
		
		if(grade>=0 & grade<50) {
			System.out.println("Fail");
		}else if(grade>=50 & grade<60) {
			System.out.println("D");
		}else if(grade>=60 & grade<70) {
			System.out.println("C");
		}else if(grade>=70 & grade<80) {
			System.out.println("B");
		}else if(grade>=80 & grade<90) {
			System.out.println("A");
		}else if(grade>=90 & grade<100) {
			System.out.println("A+");
		}else {
			System.out.println("Please provide a valid grade.");
		}
		
		sc.close();

	}

}
