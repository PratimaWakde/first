package corejava;

import java.util.Scanner;

public class Ladderifcondition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter a number between 0 to 6");
		
		int a=sc.nextInt();
		sc.close();
		
		if(a==1){
			System.out.println("one");
		}
		else if(a==2){
			System.out.println("two");
		}
		else if(a==3){
			System.out.println("three");
		}
		else if(a==4){
			System.out.println("four");
		}
		else if(a==5){
			System.out.println("five");
		}
		else{
			System.out.println("entered number should be less than 6 and more than 0");
		}
	}

}
