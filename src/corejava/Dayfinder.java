package corejava;

import java.util.Scanner;

public class Dayfinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter a number between 1 to 7");
		int input=sc.nextInt();
		
		if (input==1) {
			System.out.println("MONDAY");
		}
		else if(input==2) {
			System.out.println("TUESDAY");
		}
		else if(input==3) {
			System.out.println("WEDNESDAY");
		}
		else if(input==4) {
			System.out.println("THIRSDAY");
		}
		else if(input==5) {
			System.out.println("FRIDAY");
		}
		else if(input==6) {
			System.out.println("SATURDAY");
		}
		else if(input==7) {
			System.out.println("SUNDAY");
		}
		else{
			System.out.println("please enter a proper number");
		}
    }

}
