package com.mycompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/gallery")
public class GalleryController {
	
	// 만약 value에 공통단어인 gallery .. 가 들어간다면 상단에 빼버림
	@RequestMapping (value = "/join")
	public String join() {
		return "gallery/join";
	}
	
	@RequestMapping (value = "/list")
	public String list() {
		return "gallery/list";
	}
	
	@RequestMapping (value = "/view")
	public String view() {
		return "gallery/view";
	}

}
