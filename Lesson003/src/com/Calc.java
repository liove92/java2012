package com;
/*
 *  인터페이스 : 추상메소드와 상수로만 구성
 *  			 직접 인스턴스를 생성할 수 없다.
 */
public interface Calc {
	// Member Property : 상수로만 구성된다. 
	// 컴파일 과정에서 final 상수로 변환 처리
	double PI = 3.14;
	int ERROR = -999999;
	
	// Methods : abstract methods로만 구성

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
