package corejava;

public class Nestedifcondition {
	public static void main(String[] args) {
		int a=10;
		if(a%2==0) {
			System.out.println("number is divisible by2");
			if(a%3==0) {
				System.out.println("it is a good number");
			}
		}
	}

}
