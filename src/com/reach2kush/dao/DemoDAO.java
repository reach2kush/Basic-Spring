package com.reach2kush.dao;

import org.springframework.stereotype.Repository;
//@Repository - is use to tell spring that this class is my database class which will just interact with my DB (includes CRUD operation )
@Repository
public class DemoDAO {

	public void insertValueInDB(String concatValue) {


		System.out.println("In DAO Layer-->"+concatValue);
		
	}

}
