package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//논리연산자;
		int a = 5;
		int b = 7;
		
		//&&는 엄격:하나라도 거짓말이면 거짓!
		System.out.println(true&&true); //true
		System.out.println(true&&false); //false
//		System.out.println(false&&true); //false
//		System.out.println(false&&false); //false
		
		System.out.println(a<b&&a<=b);//true
		System.out.println(a<b&&a>b);//false
		System.out.println(a>b&&a<=b);//false
		System.out.println(a>b&&a>=b);//false

		//||은 느슨해:하나라도 맞으면 맞음
		
//		System.out.println(true||true); //true
//		System.out.println(true||false); //true
		System.out.println(false||true); //true
		System.out.println(false||false); //false
		
		System.out.println(a<b||a<=b);//true
		System.out.println(a<b||a>b);//true
		System.out.println(a>b||a<=b);//true
		System.out.println(a>b||a>=b);//false
		
		//!는 거짓말쟁이야..:무좍건 반대로
		
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		System.out.println(!(a<b)); //true 니까 false
		System.out.println(! (a!=5)); //false니까 true
		
		
	}

}
