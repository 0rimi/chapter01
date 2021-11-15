package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		System.out.println(2+3.4);//숫자로 취급
		System.out.println("2+3.4");//글자로 취급
		
		double var01 = 2+3.4;
		
		System.out.println(var01);
		
		//자동형변환(정수+실수)
		int n1=1;
		float n2=1.0F;
		
		float result=n1+n2;
		System.out.println(result);
		
		//자동형변환2(정수+실수)
		long n3=12515L;
		float n4=1.1F;
		
		System.out.println(n3+n4);
		
		//강제형변환
		int n5 = (int)11112.125151; //인티저로 변해라
		System.out.println(n5); //그러면 소수점 버림 ㅎㅎ
		
		float n6 = 12.5f;
		int n7 = (int)n6;
		System.out.println(n6);
		System.out.println(n7);
		
		//강제 형변환 > 확대형변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v02);
		
		//강제 형변환 > 축소형변환(정상)
		int v03=127;
		byte v04=(byte)v03;
		System.out.println(v03);
		System.out.println(v04);
		
		//강제 형변환 > 축소형변환(비정상)
		int v05=34324324;
		byte v06=(byte)v05;
		System.out.println(v05);
		System.out.println(v06);
		
		//실수 > 정수 : 소수를 사라지게 해볼게
		double v07 = 9.13;
		int v08 = (int)v07;
		System.out.println(v07);
		System.out.println(v08);
		
		//정수 > 실수 : .0 붙이기
		int v09 = 1205;
		double v10 = (double)v09;
		System.out.println(v09);
		System.out.println(v10);
		
		
		
	}

}
