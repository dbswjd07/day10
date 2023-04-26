package day10;

import java.util.Scanner;

public class MainClassQ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TestClassQ3 t = new TestClassQ3();
		TestClassQ4 t2 = new TestClassQ4();
		
		int num;
		
		while(true) {
			System.out.println("1.일반관 예매");
			System.out.println("2.특별관 예매");
			System.out.println("3.종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				t.movie_input();
				t.moneyclac();
				t.print();
			case 2:
			case 3:
				
			}
		}
		
		
		
		
		
		
	}
}
