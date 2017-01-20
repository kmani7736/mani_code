package com.manish.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.manish.command.Command;

@Controller
@SessionAttributes(types=Command.class,names="cmdObj")
public class MyController {
	
	@RequestMapping(value="/form.htm")
	public String formLaunch(Map<String,Command> map){
		System.out.println("formLaunch");
		map.put("cmdObj", new Command());
		return "form0";
	}
	
	@RequestMapping(value="/form.htm",params="target0")
	public String formLaunch(Map<String,Command> map,@ModelAttribute("cmdObj")Command cmd){
		System.out.println("formLaunch1");
		return "form0";
	}
		
	@RequestMapping(value="/form.htm",params="target1")
	public String form1(Map<String,String> map,@ModelAttribute("cmdObj")Command cmd){
		System.out.println("target1");
		return "form1";
	}
	@RequestMapping(value="/form.htm",params="target2")
	public String form2(Map<String,String> map,@ModelAttribute("cmdObj")Command cmd){
		System.out.println("target2");
		return "form2";
	}
	
	@RequestMapping(value="/form.htm",params="target3")
	public String form3(Map<String,String> map,@ModelAttribute("cmdObj")Command cmd){
		System.out.println("target3");
		return "form3";
	}
	
	@RequestMapping(value="/form.htm",params="cancel")
	public String cancel(Map<String,String> map){
		map.put("cancelMsg", "Registration Cancelled");
		return "result";
	}
	@RequestMapping(value="/form.htm",params="finish")
	public String finish(Map<String,String> map){
		map.put("finishMsg", "Registration Finished");
		return "result";
	}
	

}
