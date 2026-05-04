package com.java.core.LoopsClasswork;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter anumber to get table");
		int input=sc.nextInt();
		sc.close();
		System.out.println("table of"+input+"is as follow ");
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+input+"="+i*input);
			
		}
	}

}
