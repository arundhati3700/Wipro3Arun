package com.arun.problem.employees;

public class Employees {
	private int empid;
	private String empFirstName, empLastname, desig, phone;
	private float salary;
	public Employees(int empid, String empFirstName, String empLastname, 
			String desig, String phone, float salary) {
		this.empid = empid;
		this.empFirstName = empFirstName;
		this.empLastname = empLastname;
		this.desig = desig;
		this.phone = phone;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public String getEmpLastname() {
		return empLastname;
	}

	public String getDesig() {
		return desig;
	}

	public String getPhone() {
		return phone;
	}

	public float getSalary() {
		return salary;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee: \nID = " + empid 
				+ ", First Name = " + empFirstName 
				+ ", Last Name = " + empLastname
				+ ", Designation = " + desig 
				+ ", Phone Number = " + phone + 
				", Salary = $" + salary;
	}
	

}
