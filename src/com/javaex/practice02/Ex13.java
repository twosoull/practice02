package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자:");
		int x = sc.nextInt();
		double score;
		
		if(x<=0) {
			score = (x*x*x)-(9*x)+2;
			
		}else {
			score = (7*x)+2;
		}
		System.out.println("계산 숫자 결과는" + score +"입니다." );
	}

}
