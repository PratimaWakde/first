package com.java.core.twoclass;

public class Testing {
	public static void main(String[] args) {
		UsernameGenerator generator=new UsernameGenerator();
		String username=generator.getUsername("john","wick",1999);
		System.out.println("Username is:"+username);
	}

}
