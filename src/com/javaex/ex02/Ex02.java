package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   //스캐너이름 새로운스캐너에 올리겟다.(시스템안에)
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt(); //사용자가 숫자를 입력해야함..
		System.out.println("입력하신 숫자는 " + num + " 입니다.");
		
		
		sc.close();
		
	}
	
}
