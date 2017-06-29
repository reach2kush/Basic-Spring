package com.reach2kush.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reach2kush.service.DemoService;
 
//@Controller - is use to tell spring that this class is your controller class which interact with UI & your service classes
@Controller
public class DemoController {
//@Autowired - is use to create Object eg: in below line ,we are creating object of DemoService class (replacement of DemoService service =new DemoService())
	@Autowired
	DemoService service;
	
//@RequestMapping(URL) - is use to map your UI call with particular function method.
	@RequestMapping("demo.htm")
	public void demoMethod(HttpServletRequest req,HttpServletResponse res){
		
		System.out.println("Controller class is use for getting raw data from UI & then give it to service class ");
		String firstname = req.getParameter("firstname");
		String lastname= req.getParameter("lastname");
		System.out.println("First Name : " +firstname);
		System.out.println("Last Name : " +lastname);
		service.getServiceMethod(firstname,lastname);
		System.out.println("Exiting Setup Spring Tutorial");
		
	}

}
