package com.bs.controller;

public class CastingTest {
	
	public static void main(String[] args) {
		// 형 변 환 에 대 해 알 아 보 자 ! 
		// 특정연산을 실행할 때는 피연산자의 타입이 동일해야 한다. - 자동형변환
		int num = 10;
		double num2 = 10.5;
		System.out.println(num + num2);
		
		num2 = num;
		System.out.println(num2);
		
		// 강제형 변환
		// (자료형) 리터럴값 또는 변수명
		long salary = 1000;
		num = (int)salary;
		System.out.println(salary + " " + num);
		
		double weight = 65.5;
		num = (int)weight;
		System.out.println(weight + " " + num);
		
		// 계산 결과를 출력할 때 
		// 국어, 영어, 수학, 코딩 점수 평균값 구하기
		int kor = 80, math = 70, eng = 70, coding = 30;
		System.out.println((kor + math + eng + coding)/4.0);
		
		// 문자형 형변환
		// char
		char alpha = 'A';
		int numAl = alpha;
		System.out.println(numAl + " " + alpha);
		System.out.println((char)numAl);
		
		numAl = 98;
		System.out.println(numAl);
		System.out.println((char)numAl);
		
		numAl = '가';
		System.out.println(numAl);
		System.out.println((char)numAl);
		
		System.out.println('A' > 'B');
	}

}
