package my.first.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("/sample")
	public String test(Model model) {
		
		model.addAttribute("abc", "123123113");
		model.addAttribute("abcd", "sdfasdfasdf123123113");
		return "/front/sample/test";
	}
	
}
