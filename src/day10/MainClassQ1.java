package day10;

import java.util.Scanner;

public class MainClassQ1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	TestClassQ1 t = new TestClassQ1();
	
	t.studentInput();
	t.print();
	
	System.out.print("학과 입력: ");
	String major = input.next();
	t.setMajor(major);
	
	System.out.print("학번 입력: ");
	int number = input.nextInt();
	t.setScNumber(number);
	
	System.out.println("학생1의 학과: "+t.getMajor()+", 학번: "+t.getScNumber());
	
}
}
