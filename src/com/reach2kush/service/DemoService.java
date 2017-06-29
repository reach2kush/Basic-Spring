package com.reach2kush.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reach2kush.dao.DemoDAO;
//@Service - is use to tell spring that this class is my business class ,where i will write my business logic for the project
@Service
public class DemoService {
//@Autowired creating Object for DemoDAO class
	@Autowired
	DemoDAO dao;
	
	// are the service method where we should write our business logic
	public void getServiceMethod(String firstName, String lastName) {

		//Do manipulation with input parameter
		
		String concatValue= firstName +" "+ lastName;
		
		dao.insertValueInDB(concatValue);
		
		
	}

}
