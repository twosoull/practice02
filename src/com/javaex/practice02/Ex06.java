package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print("큰수:"+num1+"\t      ");
			System.out.println("작은수:"+num2);
		}else if(num1>num2) {
			System.out.print("큰수:"+num2+"\t      ");
			System.out.println("작은수:"+num1);
		}else {
			System.out.print("큰수:"+num1+"\t      ");
			System.out.println("작은수:"+num2);
		}
		sc.close();
	}
}
