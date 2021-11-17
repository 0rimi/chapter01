package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		String g="*";
			for(int i=0; i<6; i++) {
				System.out.println(g);
				g=g+"*";
			}
			
		for(int y=0; y<6; y++) {
			for(int x=0; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
