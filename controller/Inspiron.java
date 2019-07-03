package com.jspiders.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/volume")
public class Inspiron {
	@RequestMapping("/welcome/{userName}/{score}")
	public ModelAndView helloworld(@PathVariable Map<String,String> data) {
		
		
		ModelAndView mav=new ModelAndView("HelloPage");
		mav.addObject("msg","final : ind vs aus "+data.get("userName")+" will be man of the match by scoring "+data.get("score")
		);
		return mav;
	}
	@RequestMapping("/welcome1")
	public ModelAndView helloworld1() {
		ModelAndView mav=new ModelAndView("HelloPage");
		mav.addObject("msg", "Hello man, we are too lazy people and we don't care for our future");
		return mav;
	}
	
	

}
