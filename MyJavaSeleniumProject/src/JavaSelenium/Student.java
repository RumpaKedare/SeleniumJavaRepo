package JavaSelenium;

public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
		
		this(10,11,12);
		System.out.println("This is a Default Constructor");
		
	}
	public Student(int a) {
		// TODO Auto-generated constructor stub
		
		System.out.println("This is a 1-parameterized Constructor");
	
		System.out.println("This is a 1-parameterized Constructor value of a"+" = "+a);
		
	}
	public Student(int a, int b) {
		// TODO Auto-generated constructor stub
		int c= a-b;
		System.out.println("This is a 2-parameterized Constructor showing difference of 2-Parameters  "+a +" - " +b +" = " +c);
		
	}
	public Student(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		int d= a+b+c;
		System.out.println("This is a 3-parameterized Constructor showing addition of 3-parameters"+" " +d);
		
	}
	public Student(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
		this(11,9);
		System.out.println("This is a 4-parameterized Constructor");
	
		System.out.println("This is a 4-parameterized Constructor value of a"+" = "+a);
		System.out.println("This is a 4-parameterized Constructor value of b"+" = "+b);
		System.out.println("This is a 4-parameterized Constructor value of a"+" = "+c);
		System.out.println("This is a 4-parameterized Constructor value of a"+" = "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj= new Student();
		Student obj1= new Student(10,11,12,13);
		Student ob2 = new Student (100);
	}

}
