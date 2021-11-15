package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		int age = sc.nextInt();//숫자+엔터
		
		sc.nextLine();//이경우 엔터문제가 생기므로 엔터소비용을 만들어줌
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		sc.close(); 
		
	}
	
}
