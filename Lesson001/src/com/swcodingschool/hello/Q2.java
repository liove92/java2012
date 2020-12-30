package com.swcodingschool.hello;

import java.util.Scanner;

/*
 * 반지름을 입력받아 원의 면적을 구하시오
 * 원의면적 = 반지름x반지름x 원주율
 */
public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				System.out.println("원의 반지름을 입력하시오");
		double radius = sc.nextDouble();
		double area = (radius*radius) * 3.14;
		        System.out.printf("원의 넓이는 %f입니다",area);
		sc.close();

	}// end main

}//end class
