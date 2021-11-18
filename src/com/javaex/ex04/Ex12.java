package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//do while문
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		int sum = 0;
		int num;
		
		do {
			num = sc. nextInt();
			sum = sum+num;
			System.out.println("합계 : "+sum);
		}
		while(num!=0);
		
		System.out.println("종료");
		
		
		/*
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		int sum=0;
		
		while(true){
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("종료");
				break;
			}
			else if(num!=0) {
				sum=sum+num;
				System.out.println("합계 : "+sum);	
			}
			}
		*/
		sc.close();
		
	}

}
