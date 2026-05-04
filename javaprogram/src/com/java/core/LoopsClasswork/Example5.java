package com.java.core.LoopsClasswork;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
            System.out.println("please enter a->");
            int a=sc.nextInt();
            System.out.println("please enter b->");
            int b=sc.nextInt();
            
		    int sum=a+b;
		    System.out.println("addition is:"+sum);
		    System.out.println("------------");
		    }
		System.err.println("please buy premium package");
	}


}
