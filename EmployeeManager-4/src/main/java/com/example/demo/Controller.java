package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository
public class Controller {
	@Autowired
Manager manager;
	
	@RequestMapping(path="/find/{id}",produces="application/json")
	@ResponseBody
	public Employee find(@PathVariable int id) {
		return manager.findById(id).get();
		//get here retutn the value id found,otherwise give nosuchelement Exception.It is a replacement for Optional
		
	}
}
