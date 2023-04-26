package day10;
// 할인 기능 추가
import java.util.Scanner;

public class TestClassQ2 {
	private String day, week, inputDis, morning;
	private int time, money;
	
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getTime() {
		return time;
	} 
	public void setMoney(int money) {
		
		this.money = money;
	}
	public int getMoney() {
		
		return money;
	}
	public String getWeek() {
		return week;
	}
	
	
	
	public void movie_input() {
		Scanner input = new Scanner(System.in);
		System.out.print("요일 입력: ");
		setDay(input.next());
		System.out.print("시작 시간 입력(24시 단위): ");
		setTime(input.nextInt());
		System.out.print("할인(청소년,경로,우대(장애/국가유공자),없음: ");
		inputDis = input.next();
		
	}
	
	
	public void moneyclac() {
		switch(getDay()) {
		case "금" : this.week= "주말";break;
		case "토" : this.week = "주말";break;
		case "일" : this.week = "주말";break;
		default : this.week = "평일"; break;
		}
		
		if(getWeek()=="평일") {
			if(getTime()>=6&&getTime()<10) {
				this.morning = "평일 조조";
				setMoney(10000); 
			}else if(getTime()>=10&&getTime()<13) {
				setMoney(13000); 
			}else {
				setMoney(14000); 
			}
			
		}else if(getWeek() == "주말"){
			if(getTime()>=6&&getTime()<10) {
				setMoney(11000); 
			}else {
				setMoney(15000); 
			}
		}
		
	}
	
	public void dis() {
		
		
		if(inputDis.contains("청소년")) {
			setMoney(getMoney()-3000);
			if(morning=="평일 조조") {
				setMoney(getMoney()+1000);
			}
			
			
		}else if(inputDis.contains("경로")){
			setMoney(7000);
		}else if(inputDis.contains("우대")) {
			setMoney(5000); 
		}else {
			getMoney();
		}
	}
	
	public void print() {
		System.out.println(getDay()+"요일 "+getTime()+"시 시작 영화는 "+getMoney()+"원입니다");
		if(inputDis.contains("없음")) {
			System.out.println("할인 없음");
		}else {
			System.out.println(this.inputDis+"할인");
		}
	}
}
