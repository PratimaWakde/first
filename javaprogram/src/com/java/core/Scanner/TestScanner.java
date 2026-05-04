package com.java.core.Scanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your year of birth:");
		int yob=sc.nextInt();
		
		System.out.println("input given is:"+yob);
	}

}
