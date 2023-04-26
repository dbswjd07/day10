package day10;

import java.util.Scanner;

public class TestClassQ1 {
	private String major;
	private int scNumber;
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setScNumber(int scNumber) {
		this.scNumber = scNumber;
	}
	
	public int getScNumber() {
		return scNumber;
	}
	
	
	public void studentInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("학과: ");
		major = input.next();
		setMajor(major);
		System.out.print("학번: ");
		scNumber = input.nextInt();
		setScNumber(scNumber);
		
	}
	
	public void print() {
		System.out.println("학과: "+getMajor());
		System.out.println("학번: "+getScNumber());
	}
	
	
}
