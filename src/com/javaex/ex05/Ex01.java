package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		
		int[] ball = new int[6]; //0~5 6개짜리 int묶음을 만들ㅇㅓ라.
		
		ball[0]=(int)((Math.random()*10*5)+1);
		ball[1]=(int)((Math.random()*10*5)+1);
		ball[2]=(int)((Math.random()*10*5)+1);
		ball[3]=(int)((Math.random()*10*5)+1);
		ball[4]=(int)((Math.random()*10*5)+1);
		ball[5]=(int)((Math.random()*10*5)+1);
		
		
		for(int i=0; i<6; i++) {
			System.out.println(ball[i]);
		}	
		
		System.out.println("==================");
		
		int [] apt = new int[6];
		
		for(int i=0; i<6; i++) {
			apt[i] = (int)((Math.random()*10*5)+1);
			System.out.println(apt[i]);
		}
		
		
	}

}
