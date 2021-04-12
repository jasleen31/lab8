package com.r094.q2;
public class Divideby0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b = 42, div =0;
		a = args.length;
		try {
			div = b/a;
		}catch(ArithmeticException e) {
			System.out.println("Divide by 0: "+ e);
			e.getStackTrace();
			System.out.println("Value of a changed to 1");
			a=1;
			div =b/a;
		}catch(Exception e) {
			System.out.println("e");
		}
		System.out.println("Division: "+ div);
	}
}
