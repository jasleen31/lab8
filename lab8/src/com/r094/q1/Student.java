package com.r094.q1;

import java.util.Scanner;

class StudentDetails{
	int roll[] = {1,2,3,4,5,6,7,8,9,10};
	String name[]= {"A","B","C","D","E","F","G","H","I","J"};
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		StudentDetails student = new StudentDetails();
		
		System.out.println("Enter student roll no.");
		int n = sc.nextInt();
		try {
			System.out.println("Roll no : "+ n);
			System.out.println("Name : "+ student.name[n-1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception: Roll number which is accessed"
					+ " is not present in the list !");
		}
	}
}
