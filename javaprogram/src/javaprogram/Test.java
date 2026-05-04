package javaprogram;

public class Test {
	public static void main(String[] args) {
		Student s=new Student();
		s.id=101;
		s.name="ram";
		s.city="pune";
		
		Student s1=new Student();
		s1.id=102;
		s1.name="SHAM";
		s1.city="delhi";
		
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.city);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);
	}

}

	


