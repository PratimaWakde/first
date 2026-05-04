package com.java.core;

import java.util.Scanner;

public class Testscanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter your year of birth: ");
		int yob = sc.nextInt();

		System.out.println("input given is:" + yob);
	}

}
