package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("출력되는 내용을 입력하세요");
			System.out.print("기호: ");
			String sign = sc.nextLine();
			System.out.print("숫자1: ");
			int num1 = sc.nextInt();
			System.out.print("숫자2: ");
			int num2 = sc.nextInt();
			
			if(sign.equals("+")) {
				System.out.println("결과는: "+(num1+num2));
			}else if(sign.equals("-")) {
				System.out.println("결과는: "+(num1-num2));
			}else if(sign.equals("*")) {
				System.out.println("결과는: "+(num1*num2));
			}else if(sign.equals("/")) {
				if(num1 == 0 || num2 == 0) {
					System.out.println("계산할 수 없습니다.");
				}else {
					if(num1>num2) {
						System.out.println("결과는:"+(num1/num2));
					}else if(num2>num1) {
						System.out.println("결과는:"+ (num2/num1));
					}
				}
			}else {
				System.out.println("계산할 수 없는 기호입니다.");
			}
			
		sc.close();
		
			
		}
}
