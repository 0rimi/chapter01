package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			int num = 0;
			for(int i=1; i<=10; i++) {
			 num = num+i;
			 System.out.println(i+" 까지의 합은 "+num);
			}
			
			
			
		sc.close();
		
	}

}