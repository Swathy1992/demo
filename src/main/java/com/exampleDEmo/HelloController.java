package com.exampleDEmo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	  @RequestMapping(value="/hello",method = RequestMethod.GET)
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	
	        model.addAttribute("name", name);
	        return "hello";
	    }
	  
	  
	  
	  @RequestMapping(value="/hello",method = RequestMethod.POST)
	  public String get(@RequestParam(value="name", required=false) String name){
		  System.out.println("name");
		  System.out.println(name);
		return "hello";
		  
	  }
}
