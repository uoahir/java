package com.bs.controller;

public class PrintTest {
	
	public static void main(String[] args) {
		//console창에 원하는 데이터를 출력하는 것
		// 1. System.out.print(); 개행없이 출력
		// 2. System.out.println(); 개행하면서 출력
		System.out.print("안녕");
		System.out.print("하세요");
		System.out.print("ㅎㅎ");
		System.out.print("ㅎㅎ");
		int age = 19;
		System.out.print(age);
		System.out.println("안녕");
		System.out.println("하세요");
		System.out.println("호호호호");
		
		// 문자열에 escape 문자 처리하기
		String msg = "안녕하세요 저는 유병승입니다\n"
				+ "저는 자바선생님입니다. \"하하하하\"";
		System.out.println(msg);
		
		String filePath = "c:\\Users\\GDJ";
		System.out.println(filePath);
		
		//System.out.printf() -> 형식맞춰서 출력할 때 사용
		//System.out.printf("출력패턴(%d,%c,%s,%f)",값,값,값,값);
		//System.out.printf("%d,%d,%d",1,2,3);
		System.out.printf("나의 이름은 %s이고 나이는 %d, 성별은 %c, 키는 %.1f\n","김지연",28,'여',164.1);
		System.out.printf("%-5s\t%2d\t%1c\t%.2f\n","김지연",28,'여',164.15);
		System.out.printf("%-5s\t%2d\t%1c\t%.2f\n","이이",28,'남',180.01);
		System.out.printf("%5s\t%2d\t%1c\t%.2f\n","김지연",28,'여',164.15);
		System.out.printf("%5s\t%2d\t%1c\t%.2f\n","이이",28,'남',180.01);
		
		
		String name = new String("김지연");
		String name2 = "김지연";
		String name3 = new String("김지연");
		
		System.out.println(name.equals(name3));
		
				
	}

}
