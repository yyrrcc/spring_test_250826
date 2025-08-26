package com.mycompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// my객체 초기화, my메서드안에서 cal 초기화
		MyCalculator myCalculator2 = new MyCalculator();
		myCalculator2.setA(15);
		myCalculator2.setB(3);
		myCalculator2.addition();
		
		// 
		Calculator calculator = new Calculator();
		myCalculator2.setCalculator(calculator); // 멤버변수인 calculator 외부에서 객체를 생성하여 초기화 (DI 의존성 주입)
		myCalculator2.substraction();
		
		MyCalculator myCalculator3 = new MyCalculator();
		myCalculator3.multiplication();
		
		
		
		// 스프링 컨테이너를 만들어놨기 때문에 여기서 객체 선언 할 필요 없음
		// 그 파일을 로딩(가져오기)
		String configLocation = "classpath:applicationCTX.xml";
		// ctx라는 이름으로 컨테이너 생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		// 스프링 컨테이너에서 객체를 가져옴 (DI)
		MyCalculator myCalculator = ctx.getBean("myCal", MyCalculator.class);
		myCalculator.addition();
		
		
	}

}
