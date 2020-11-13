package com.javaex.practice02;
import java.util.Scanner;
public class Ex05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 :");
		int height = sc.nextInt();
		System.out.print("몸무게:");
		int weight = sc.nextInt();
		float standardweight = (float)((height - 100)*0.9);
		
		if(standardweight<weight) {
			System.out.println("과체중입니다.");
		}else if(standardweight>weight) {
			System.out.println("저체중입니다.");
		}else {
			System.out.println("표준 입니다.");
		}
		System.out.println("표준 체중: "+standardweight);
		sc.close();
		
		
	}

}
