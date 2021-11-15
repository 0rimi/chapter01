package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7; //3이 a라고 정할게에~~~
		int b = 2; //변수이름은 숫자 안돼...
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println( a+b );
		System.out.println( a-b );
		System.out.println( a*b );
		System.out.println( a/b ); //org: 3.5.. 몫1 나머지 1
		//%나누기를 하고 얻게 되는 나머지를 반환한다
		System.out.println( a%b );
		//sysout 쓰고 Ctrl+Spacebar 하면 출력 바로가능..
		
		//산술연산자/ %자세히
		System.out.println("산술연산자 자세히");
		System.out.println( 7.0/2.0 ); //3.5
		System.out.println( 7.0%2.0 ); //1.0
		
		//부호연산자
		int n1 = -9;
		int pn1 = +n1;
		int mn1 = -n1;
		System.out.println(pn1);
		System.out.println(mn1);
		
		//증가 감소 연산자
		System.out.println("증가 감소 연산자");
		
		/*
		int ppn1 = ++n1;
		System.out.println(ppn1);
		int mmn1 = --n1;
		System.out.println(mmn1);
		//n1을 증가시킨다
		
		int n1pp = n1++;
		System.out.println(n1pp);
		int n1mm = n1--;
		System.out.println(n1mm);
		//val에 n값을 대입시킨다
		*/
		
		//a는 7, b는 2
		System.out.println(a); //7
		System.out.println(++a); //우선 a를 1올린다, a를 출력한다.
		System.out.println(a); //원본값 자체가 변했음 따라서 8ㄴ
		
		System.out.println(b);//2
		System.out.println(--b);//1
		System.out.println(b);//1
		
		System.out.println(a);//8
		System.out.println(a++); //a를 출력한다후, a를 올린다 즉8
		System.out.println(a); //9
		
		System.out.println(b);//1
		System.out.println(b--);//1
		System.out.println(b);//0
		
	}

}
