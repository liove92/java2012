package com.swcodingschool.hello;

import java.util.Scanner;

public class QuizConditionalStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				System.out.println("성적을 입력하시오");
		int S = sc.nextInt();
		
		{
		if (S >= 90) {
			System.out.printf("당신의 성적은 A입니다.\n");
		}else if (S >= 80) {
			System.out.printf("당신의 성적은 B입니다.\n");
		}else if (S >= 70) {
			System.out.printf("당신의 성적은 C입니다.\n");
		}else {
			System.out.printf("당신의 성적은 F입니다.\n");
		}
		} // if end
		
		
		switch(S) {
		case 1:
		if(S >= 90) System.out.printf("당신의 성적은 A입니다.\n");
		else if (S >= 80) System.out.printf("당신의 성적은 B입니다.\n");
		else if (S >= 70) System.out.printf("당신의 성적은 C입니다.\n");
		else System.out.printf("당신의 성적은 F입니다.\n");
		break;
		}

	}

}
