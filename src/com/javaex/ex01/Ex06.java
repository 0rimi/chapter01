package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01);
		//정수를 정수로 나누었으므로 정수가 나와야함 따라서 1
		//더블이므로 1.0으로 출력된다.

		double v02 = (double)5/4; //5.0/4 이므로 1.25
		System.out.println(v02);
		//1.25 나옴
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		//5/4.0 이므로 1.25 나옴
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		//5.0/4.0 이므로 1.25나옴
		
		int v05 = (int)1.3 + (int) 1.8;
		System.out.println(v05);
		//1+1이므로 2나옴
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		//3.1에서 소수점 버리므로 3나옴
		
	}
	
}
