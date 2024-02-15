package com.bs.controller;

public class VariableTest {
	
	public static void main(String[] args) {
		//논리형
		boolean flag;
		flag = true;
		flag = false;
		System.out.println(flag);
		
		// 문자
		char gender;
		gender = '남';
		gender = '여';
		System.out.println(gender);
		
		String name;
		name = "김지연";
		System.out.println(name);
		
		// 숫자형
		int age;
		age = 28;
		System.out.println(age);
		
		long stock;
		stock = 10000000000L;
		System.out.println(stock);
		
		float weight;
		weight = 65.5f;
		System.out.println(weight);
		
		double height;
		height = 164.4;
		System.out.println(height);
			
		
		long salary = 1000000L; //자동형변환
		System.out.println(salary);
		
		String test = ""; // 초기값 설정
		String test2 = null;
		
		char chtest = ' '; // char 기본값은 공백임
		
		// 변수명은 중복되면 안됨 * 같은 영역에 있을 때
		// single quotation mark '' _ double quotation mark ""
		// main method 안에 있는 변수들은 local variable
		// 지역 변수는 반드시 초기화 후 사용해야 한다.
		
		// 상수 활용하기
		// 상수는 고정된 값을 사용하며, 대문자로 표기하고 낙타형 표기법을 쓰지 않는다. 메모리절약가능
		final int AGE = 19;
		System.out.println(AGE);
		
		// 변수에 저장된 값을 다른 변수에 저장하기
		String hobby = "게임";
		String hobby2 = hobby;
		System.out.println(hobby + hobby2);
		
		/* byte byteValue = 10;
		byte result = byteValue + byteValue;
		System.out.println(result); */
		
		int x = 5;
		int y = 2;
		double result = (double)x / y;
		System.out.println(result);
		
		/* double var1 = 3.5;
		double var2 = 2.7;
		int resultVar = (int)var1 + (int)var2;
		System.out.println(resultVar); */
		
		// 110p 9번 문제
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result3 = (int)Double.parseDouble(var4) + (int)(var3 + var2) + (int)var1 ;
		System.out.println(result3);
			
	}

}
