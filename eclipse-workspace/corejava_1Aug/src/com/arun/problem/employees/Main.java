package com.arun.problem.employees;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeInterface emp = new EmployeeInterfaceImpl();
		
		int choice = 0;
		
		do {
			System.out.println("Menu : ");
			System.out.println("1. Add an employee");
			System.out.println("2. List all employees");
			System.out.println("3. List managers");
			System.out.println("4. Delete an employee");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			
			if(sc.hasNextInt()) {
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
				case 1:
					emp.addEmployee(sc);
					break;
				case 2:
					emp.listAllEmployees();
					break;
				case 3:
					emp.listManagers();
					break;
				case 4:
					emp.deleteEmployee(sc);
					break;
				case 5:
					System.out.println("Exit complete!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}else {
				System.out.println("Invalid input. Please enter a valid integer.");
				sc.next();
			}
		}while(choice!=5);
	}
}
