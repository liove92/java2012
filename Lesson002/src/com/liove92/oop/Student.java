package com.liove92.oop;
/*
 * 클래스 선언하는 방법을 설명.
 * 접근제어자 class 클래스이름 {멤버변수; 메서드;}
 */

public class Student {
      private int studentID;      //학번
      private String studentName; //이름
      private int grade;          //학년
      private String address;     //주소
      
      Student() {
    	  System.out.println("기본 생성자가 동작하였습니다");
      }
      
      Student(int studentID, String studentName, int grade, String address){
         System.out.println("풀 패러미터 생성자가 동작하였습니다");
         this.studentID = studentID;
         this.studentName = studentName;
         this.grade = grade;
         this.address = address;
      }
      //세터 setter, private 선언된 맴버 변수의 값을 변경 할 수 있도록 하는 
      //외부에 오픈된 메서드
      
      
   
      
//	public void setStudentID(int id) {
//    	  studentID = id;
//      }
//      public void setStudentName(String name) {
//    	  studentName = name;
//      }
//      public int getStudentID() {
//    	  return studentID;
//      }
//      public String getStudentName() {
//    	  return studentName;
//      }
//      

      public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 메서드
      //접근제어자 리턴타입 메서드이름(패러미터리스트) {} 
      public void study( ) {
    	  System.out.println(studentName + "이(가) 공부를 합니다.");
      }//end study
      public void showInfo( ) {
    	  System.out.println(studentID + studentName + grade + address);
      }
}//end of class
