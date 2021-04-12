package com.r094.q5;

import java.util.Scanner;

class EmployeeDetails{
	String name;
	int age;
	public EmployeeDetails(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name of the employee: "+ name);
		System.out.println("Age of the employee: "+age);
	}
}
class EmployeeName extends Exception{
	EmployeeName(String s){
		super(s);
	}
}
class Age extends Exception{
	Age(String s){
		super(s);
	}
}
public class Q5 {
	static boolean isNumeric(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter name of the employee: ");
			String name = sc.next();
			if(isNumeric(name)) {
				throw new EmployeeName("Employee name cannot be number");
			}else {
				System.out.println("Enter age of employee: ");
				int age = sc.nextInt();
				if(age>50)
					throw new Age("Employee age cannot be greater than 50");
				EmployeeDetails e = new EmployeeDetails(name,age);
				System.out.println("Employee added successfully!");
				e.display();
			}
		}catch(EmployeeName e) {
			System.out.println("Exception: "+ e);
		}catch(Age a) {
			System.out.println("Exception: "+ a);
		}
}
	}
