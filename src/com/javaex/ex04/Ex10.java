package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		//아직...강사님이...안해주셨습니다아...
		for (int i=1; i<=20; i++) {
			if(i%2!=0||i%3!=0) {
				System.out.println(i);
				continue;
			}
			else if(i%2==0&&i%3==0) {
				continue;
			}
		}

	}

}
