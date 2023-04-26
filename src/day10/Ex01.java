package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
//	public ArrayList<String> test() {
//		ArrayList<String> arr = new ArrayList<>();
//		arr.add("hello");
//		return arr;
//	}
	public int[] TestInput() {
		Scanner input = new Scanner(System.in);
		int[] num = new int[2];
		
		System.out.print("수 입력: ");
		num[0] = input.nextInt();
		System.out.print("수 입력: ");
		num[1] = input.nextInt();
		
		return num;
	}
	
	public int TestClass(int n1,int n2){
		
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}
		
		
	}
	public static void main(String[] args) {
//		int num = 10;
//		
//		if(num%2==0) {
//			System.out.println(num + " 짝수");
//		}else {
//			System.out.println(num + " 홀수");
//		}
		
//		int sum=0;
//	
//		for(int num=1;num<=10;num++) {
//			sum+=num;
//		}
//		
//		System.out.println(sum);
		
		Ex01 e = new Ex01();
		int[] i = e.TestInput();
		int n= e.TestClass(i[0], i[1]);
		System.out.println("큰 수 : "+n);
		
		
	}
}
