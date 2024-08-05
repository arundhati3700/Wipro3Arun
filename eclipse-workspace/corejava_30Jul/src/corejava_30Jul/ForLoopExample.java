package corejava_30Jul;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int i =10;
		for(;i>5;i--)
			System.out.println("i =" + i);
		System.out.println("Outside i = " + i); */
		String[] cities = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 cities : ");
		cities[0] = sc.nextLine();
		cities[1] = sc.nextLine();
		cities[2] = sc.nextLine();
		cities[3] = sc.nextLine();
		cities[4] = sc.nextLine();
		
		System.out.println("City names : ");
		for(int i=0;i<5;i++)
			System.out.println((i+1) + " " + cities[i]);
		System.out.println("Using for each : ");
		for(String city : cities)
			System.out.println(city);
		
		sc.close();

	}

}
