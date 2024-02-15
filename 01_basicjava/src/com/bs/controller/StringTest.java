package com.bs.controller;

public class StringTest {
	
	public static void main(String[] args) {
		// 문자열 자료형 이용하기 (문자열은 클래스임, 클래스를 자료형으로 사용할 수 있게 만든 것임)
		String name = "지연"; // 자료형으로 선언하는 방법
		System.out.println(name);
		
		String name2 = new String("지연"); // 원래 클래스를 선언하는 방법임
		System.out.println(name2);
		
		// + 연산자를 이용한 문자열 결합
		String msg;
		msg = "자바 선생님 " + "유병슨";
		System.out.println(msg);
		msg = "학생 " + name2;
		System.out.println(msg);
		
		int age = 19, age2 = 20;
		int result = age + age2;
		System.out.println(result);
		
		// 문자열 타입 + 다른 타입 결합 !
		msg = "나 애 나이는 , , " + 19;
		System.out.println(msg);
		
		msg = "이름 " + name + " 나이 " + age;
		System.out.println(msg);
		msg = "" + 20 + 24 + "년도 화이팅 ~ ! ~ ! ";
		System.out.println(msg);
		
		// 본인 이름, 나이, 성별(M/F), 주소, 전화번호
		// 각 변수를 생성해서 저장하고 한 개 문자열로 합쳐서 한번에 출력하기 !!
		// 출력문 : 나의 이름은 000이고 나이는 00살이고 키는 000.0 주소는 ~ 성별은 0, 전화번호는 이다.
	
		String myName, home, phone;
		char gender;
		int myAge;
		double height;
		
		myName = "김지연";
		home = "서울시 영등포구";
		phone = "010-5497-1645";
		myAge = 28;
		gender = 'F';
		height = 164.5;
		
		
		String sentense = "나의 이름은 " + myName +"이고 나이는 " + myAge 
				+ "살이고 키는 " + height + " 주소는 " + home + ", 성별은 " + gender 
				+ ", 전화번호는 " + phone + "이다.";	
		System.out.println(sentense);
		
		// String 클래스로 유용한 기능(메소드)을 제공 ! ! !
		// 1. String 변수에 저장된 문자열의 길이를 알려주는 기능(메소드)
		// length()
		System.out.println("길이알려줘".length());
		System.out.println(myName.length());
		int length = "길이알려줘".length();
		System.out.println(length);
		
		// 2. 문자열 변수에 저장된 특정문자 한 개만 가져오는 기능(메소드)
		// charAt()
		System.out.println("ABC".charAt(0));
		System.out.println("ABC".charAt(1));
		
		char a = sentense.charAt(10);
		
		
	}

}
