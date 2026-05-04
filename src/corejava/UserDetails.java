package corejava;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter firstname:");
		String fname=sc.nextLine();
		
		System.out.println("enter lastname:");
		String lname=sc.nextLine();
		
		System.out.println("enter year of birth:");
		int yob=sc.nextInt();
		
		System.out.println("full name:"+fname+" "+lname);
		System.out.println("year of birth:"+yob);
		
		sc.close();
	}

}
