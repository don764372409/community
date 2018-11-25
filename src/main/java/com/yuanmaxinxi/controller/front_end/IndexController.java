package com.yuanmaxinxi.controller.front_end;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/frontEnd/index")
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "front_end/index";
	}
}
