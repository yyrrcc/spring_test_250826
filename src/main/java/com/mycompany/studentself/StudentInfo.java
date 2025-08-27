package com.mycompany.studentself;

public class StudentInfo {
	// 다른 빈을 참조(주입) 받는 자리
	private StudentDto student;

	// (1) 기본 생성자 + setter 조합 (setter 주입용)
	public StudentInfo() {
	}
	
	// (2) 생성자 주입용
	public StudentInfo(StudentDto student) {
        this.student = student;
    }

	// setter (setter 주입에 필요)
	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public void printInfo() {
        if (student == null) {
            System.out.println("학생 정보가 없습니다.");
            return;
        }
        System.out.println("[학생 정보]");
        System.out.println("이름 : " + student.getName());
        System.out.println("나이 : " + student.getAge());
        System.out.println("전공 : " + student.getMajor());
    }
}
