package com.mycompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class StudentMain {

	public static void main(String[] args) {
		// setter 이용해서 만들어줌
		StudentInfo studentInfo = new StudentInfo();
		StudentDto studentDto1 = new StudentDto();
		studentDto1.setName("김민지");
		studentDto1.setAge(17);
		studentDto1.setClassNum("1");
		studentDto1.setGradeNum("5");
		
		studentInfo.setStudentDto(studentDto1);
		studentInfo.printStudentInfo();
		
		// constructor 생성자를 이용해서 만들어줌
		StudentDto studentDto2 = new StudentDto();
		studentDto2.setName("박소윤");
		studentDto2.setAge(18);
		studentDto2.setClassNum("2");
		studentDto2.setGradeNum("3");
		StudentInfo studentInfo2 = new StudentInfo(studentDto2);
		studentInfo2.printStudentInfo();
		
		
		
		// 스프링 컨테이너에서 객체 주입 받기(IoC)
		String configLocation2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx2 = new GenericXmlApplicationContext(configLocation2);
		StudentInfo studentInfo3 = ctx2.getBean("studentInfo3", StudentInfo.class);
		StudentInfo studentInfo4 = ctx2.getBean("studentInfo4", StudentInfo.class);
		studentInfo3.printStudentInfo();
		studentInfo4.printStudentInfo();
	}

}
