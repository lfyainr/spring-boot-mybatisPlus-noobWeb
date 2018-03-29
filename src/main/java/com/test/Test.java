package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author lfy.xys
 * 此类可以 理解为 servlet ，做HTTP的接口
 */
@Controller
@RequestMapping(value = "/test")
public class Test {
	@RequestMapping("/test")
	@ResponseBody
	String home() {

		return "Hello World!";
	}
}
