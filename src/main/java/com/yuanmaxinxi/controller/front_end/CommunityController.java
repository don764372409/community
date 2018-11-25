package com.yuanmaxinxi.controller.front_end;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/frontEnd/community")
@Controller
public class CommunityController {
	@RequestMapping("/showOne")
	public String showOne() {
		return "front_end/community";
	}
}
