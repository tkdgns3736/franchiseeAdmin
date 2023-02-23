package com.pinple.store.controller.page;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	//로그인 페이지
	@RequestMapping("/")
    public String loginPage() {
        
        return "index";
    }
	
}
