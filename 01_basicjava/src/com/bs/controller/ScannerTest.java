package com.bs.controller;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// 키보드에 입력한 데이터 가져오기
		// java.util.Scanner 클래스를 이용
		// 1. Scanner 클래스를 import 해주기
		//    import java.util.Scanner
		// 2. Scanner 클래스를 생성하기 (클래스는 항상 만들어서 써야 함) Scanner 참조형 자료형
		// 	  Scanner sc = new Scanner(System.in);
		// 3. Scanner 클래스가 제공하는 기능을 이용해서 사용자가 입력한 값을 가져옴
		/* nextInt() 정수형(int) 
		   nextDouble() 실수형(double)
		   next() 문자열(String) : 띄어쓰기 없는 값
		   nextLine() 문자열(String) : 띄어쓰기, 줄 구분 가능 
		   한 글자 가져오기는 charAt 사용 ! ! ! */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 살 ? : ");
		int age = sc.nextInt();
		System.out.println("내 나이는 " + age + "살\n");
		
		System.out.print("키를 입력사해숑 : ");
		double height = sc.nextDouble();
		System.out.println("내 키는 " + height + "cm\n");
		
		// nextLine()으로 문자열을 입력받을 때는 윗쪽 라인에 next,nextInt,nextDouble가 실행됐는지 확인
		// 실행했다면, nextLine()을 실행해서 버퍼를 비워줘야 한다.
		
		sc.nextLine(); // 버퍼 비워 ~ 주 ~  기 ~ ! 
		System.out.print("이름을 입력 하새용 : ");
		String name = sc.nextLine();
		System.out.println("내 이름은 " + name + "\n" );
		
		// char 데이터 받아오기
		System.out.print("성별은 무엇십닏가? : ");
		char gender = sc.next().charAt(0);
		System.out.println(gender);
		
		// 학생정보를 입력받고 출력하는 기능 구현하기
		// 이름, 나이, 성별(남/여), 학년, 반, 번호, 키, 주소, 이메일 입력받고 입력한 내용을 출력하기 ! 
		//com.test.variable.StudentInfo
		// 1. 입력한 값을 바로 출력
		// 2. 한 번에 출력
		// 예) 유병승 19 1 3 180.5 경기도 시흥시 teacherdev09@gmail.com
		
	}
}
