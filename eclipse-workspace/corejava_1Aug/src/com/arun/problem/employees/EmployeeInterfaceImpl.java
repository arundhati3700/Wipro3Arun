package com.arun.problem.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeInterfaceImpl implements EmployeeInterface {
	
	List<Employees> employeeList = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addEmployee(Scanner sc) {
		// TODO Auto-generated method stub
		int id=0;
		while(true) {
			System.out.println("Enter employee ID : ");
			String input = sc.nextLine();
			if(input.matches("\\d+")) {
				id = Integer.parseInt(input);
				break;
			}else {
				System.out.println("Invalid input. Please enter a valid integer for employee ID.");
			}
		}
		System.out.println("Enter employee first name : ");
		String fname = sc.nextLine();
		System.out.println("Enter employee last name : ");
		String lname = sc.nextLine();
		System.out.println("Enter employee designation : ");
		String des = sc.nextLine();
		System.out.println("Enter employee phone number : ");
		String number = sc.nextLine();
		float salary;
		while(true) {
			System.out.println("Enter employee salary : ");
			String input = sc.nextLine();
			if(input.matches("\\d+(\\.\\d+)?")) {
				salary = Float.parseFloat(input);
				break;
			}else {
				System.out.println("Invalid input. Please enter a valid number for employee salary.");
			}
		}
		
		Employees emp = new Employees(id,fname,lname,des,number,salary);
		employeeList.add(emp);
		System.out.println("Employee details added successfully!");
	}

	@Override
	public void listAllEmployees() {
		// TODO Auto-generated method stub
		if(employeeList.isEmpty()) {
			System.out.println("No employees found!");
		} else {
			for (Employees e : employeeList) {
				System.out.println(e);
			}
		}
	}

	@Override
	public void listManagers() {
		// TODO Auto-generated method stub
		boolean manager = false;
		for(Employees e : employeeList) {
			if(e.getDesig().equalsIgnoreCase("Manager")) {
				System.out.println(e);
				manager = true;
			}
		}
		if(!manager)
			System.out.println("No managers found!");
	}

	@Override
	public void deleteEmployee(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID to be deleted : ");
		int id = sc.nextInt();
		Employees del = null;
		for (Employees e : employeeList) {
			if(e.getEmpid() == id) {
				del = e;
				break;
			}
		}
		if(del!=null) {
			employeeList.remove(del);
			System.out.println("Employee deleted successfully!");
		} else {
			System.out.println("Employee not found!");
		}
	}

}
