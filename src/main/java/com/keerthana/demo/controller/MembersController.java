package com.keerthana.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.model.Members;
import com.keerthana.demo.serviceimpl.MembersServiceImpl;

@RestController
@RequestMapping("/mem")
@CrossOrigin("*")

public class MembersController {

	@Autowired
	MembersServiceImpl memberservice;
	
	@PostMapping
	public String insertEmpl(@RequestBody Members emp, @RequestParam int pId) {
		return memberservice.addEmp(emp, pId);

		
	}
	@GetMapping("{id}")
	public Members getEmployeeById(@PathVariable("id") int id) {
		return memberservice.getApplication(id);
	}
	@GetMapping("/all")
	public List<Members> getEmployees() {
		return memberservice.getAllApplication();
	}
	@PutMapping("{eid}")
		public String updationEmployee(@RequestBody Members emp,@PathVariable int eid) {
			return memberservice.updateApplication(emp, eid);

	}
	@DeleteMapping("{id}")
	public String deleteEmployeetById(@PathVariable("id") int id) {
		String msg="";
		try {
			memberservice.deleteApplication(id);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
}
