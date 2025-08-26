package com.mycompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value = "/index.do")
	public String index() {
		
		return "index"; 
	}
	
	@RequestMapping(value = "/boardList")
	public String boardList() {
		
		return "boardList"; 
	}
	
	@RequestMapping(value = "/mjoin")
	public String join() {
		// 폴더 안에 jsp 만든 경우에는 폴더이름도 작성해줘야 함
		return "member/joinMember"; 
	}
	
	@RequestMapping(value = "/member/join")
	public String join2() {
		// 폴더 안에 jsp 만든 경우에는 폴더이름도 작성해줘야 함
		return "member/joinMember"; 
	}
}
