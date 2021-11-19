package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[4];
		
		intArray[0] = 3;
		intArray[2] = 13;
		intArray[1] = 7;
		intArray[3] = 55;
		
		
//		for(int i=0; i<4; i++) { //i<4대신 length라는것을 쓸수가 있어!
//			System.out.println(intArray[i]);
//		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("============================");
		
		
		//int a = 3, b = 5, c = 7;
		
		//정석 int[] intArray = new int[3];
		int[] arr1 = new int[/*안에는 넣지말기*/] {9,1,3};
		//더 줄이면 int[] arr1 = {1,2,3};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		
		
		System.out.println("============================");
		
		char[] charArray = new char[3];
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
		
		for(int i=0; i<3; i++) {
			System.out.println(charArray[i]);
		}
		
		
		

	}

}
