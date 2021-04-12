package com.r094.q4;
import java.util.Scanner;
class OppositeDirection extends Exception{
	public OppositeDirection(String s) {
		super(s);
	}	
}
public class Vehicle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the direction of vehicles (l/r): ");
		System.out.println("Vehicle 1: ");
		String v1 = sc.next();
		System.out.println("Vehicle 2: ");
		String v2 = sc.next();
		sc.close();
		
		try {
			if(v1.equalsIgnoreCase(v2)==false) {
				throw new OppositeDirection("Exception: "
						+ "Vehicles travelling in Opposite Direction, May COLLIDE!" );
			}System.out.println("Vehicles are SAFE to go!");
		}catch(OppositeDirection e) {
			System.out.println(e.getMessage());
		}
	}
}
