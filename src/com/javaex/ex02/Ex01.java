package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		//스캐너 연습
		
		System.out.print("안녕");//줄바꿈안함
		System.out.println("하세요");//줄바꿈됨
		System.out.println("안녕하세요");//줄바꿈됨
		System.out.println("===================");
		
		//println()사용법
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "이영림";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println(i);
		System.out.println(d);
		
		System.out.println(str+str);
		System.out.println(str+i);
		System.out.println(str+d);
		
		System.out.println(str+"이랑"+i);
		System.out.println(i+i);
		System.out.println(i+d);
		System.out.println("===================");
		System.out.println(c+c);
		System.out.println(c+s);
		
		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.println("안녕\"하\"세요"); //안녕"하"세요
		System.out.println("안녕\\하\\세요"); //안녕\하\세요
		System.out.println("안녕\t하세요"); //안녕	하세요
		System.out.println("안녕\n하세요"); //안녕(줄바꿈)하세요
		
	}
	
}
