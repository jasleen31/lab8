package com.r094.q3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			float a = Integer.parseInt(args[0]);
			System.out.println("Number: "+ a);
		}catch(NumberFormatException e) {
			System.out.println("Exception: Operand non-numeric!");
		}
	}

}
