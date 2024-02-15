package com.test.variable;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String studentName = sc.next();
		System.out.println(studentName);
		
		System.out.print("나이를 입력 하새요 @! : ");
		int studentAge = sc.nextInt();
		System.out.println(studentAge);
		
		System.out.print("성별 입력하새요 (남/여) : ");
		char gender = sc.next().charAt(0);
		System.out.println(gender);
		
		System.out.print("학년을 입력하새용 ! : ");
		int grade = sc.nextInt();
		System.out.println(grade);
		
		System.out.print("반을 입력하새용 ! : ");
		int classNumber = sc.nextInt();
		System.out.println(classNumber);
		
		System.out.print("번호를 입력하새용 ! : ");
		int number = sc.nextInt();
		System.out.println(number);
		
		System.out.print("키는 몇 샌치 ? ? :");
		double height = sc.nextDouble();
		System.out.println(height);
		
		// sc.nextLine(); 쌤은여기애서버퍼초기화하신다고함.
		System.out.print("주 소는 ? : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println(address);
		
		System.out.print("이매일입력하새요: ");
		String mail = sc.next();
		System.out.println(mail);
		
		System.out.println(studentName + " " + studentAge + " " + gender + " " + grade + " " + classNumber + " " + number + " " + height + " " + address + " " + mail);
		System.out.printf("%10s\t%2d\t%2c\t%2d\t%2d\t%2d\t%5.1f\t%10s\t%10s",studentName, studentAge, gender, grade, classNumber, number, height, address, mail);
	}

}
