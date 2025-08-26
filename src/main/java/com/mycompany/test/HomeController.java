package com.mycompany.test;

// 0. 스프링프레임워크에서 제공하는 기능들
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 1. 애노테이션 controller 라고 명시해줘야 함
@Controller
public class HomeController {
	// 10. 루트 요청 즉, 대문 페이지
	// 2. 애노테이션 RequestMapping 
	// 3. method get, post 바꿀 수 있음
	// 4. value 값으로 원하는 uri를 넣어주면 됨 (else if .. 안해도 됨)
	@RequestMapping(value = "/")
	public String home() {
		
		return "home";
		
	}
	
	
	// 5. 프로젝트에서 run 실행을 하게 되면 주소 + 패키지 이름이 뜸
	// 6. 주소창에 우리가 작성한 /test 를 넣어주면 페이지가 뜸
	
	// 7. 메서드와 value 모두 유니크 해야함
	
	// 8. requestMapping (value 값 + 메서드 + return값) 결과가 어디로 가냐면
	// servlet-context.xml의 beans:property로 감
	// prefix 접두사 + return으로 넘어온 값 + suffix 접미사
	// 조합된 문자를 웹서버한테 넘김 webapp - 접두사 - 넘어온 값 - 접미사 jsp 파일을 찾아서 실행시켜줌
	
	
	// 9. 새로운 jsp 만들고 새로운 requestmapping 만들어봄
	// value값은 주소창에 적힐 이름, hello() 메서드 이름, return이 jsp 파일의 이름으로 넣어줘야 함
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		
		return "hello";
	}
	
}
