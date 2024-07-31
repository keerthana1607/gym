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
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.model.Masters;
import com.keerthana.demo.serviceimpl.MastersServiceImpl;

@RestController
@RequestMapping("/mast")
@CrossOrigin("*")
public class MastersController {

	@Autowired
	MastersServiceImpl masterservice;
	
	@PostMapping
	public String insertEmpl(@RequestBody Masters pay) {
		String msg="";
		try {
			masterservice.addPay(pay);
			msg="Success to add";
		}catch(Exception e) {
			e.printStackTrace();
			msg="Failure to add";
		}
		return msg;
		
	}
	@GetMapping("{id}")
	public Masters getJoblById(@PathVariable("id") int id) {
		return masterservice.getJob(id);
	}
	@GetMapping("/all")
	public List<Masters> getPayrolls() {
		return masterservice.getAllPayroll();
	}
	@PutMapping
	public String updationPayroll(@RequestBody Masters pay) {
		String msg="";
		try {
			masterservice.updatePayroll(pay);
			msg="Success to update";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure to update";
		}
		return msg;
	}
	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id) {
		String msg="";
		try {
			masterservice.deletePayroll(id);
			msg="Success to delete";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure to delete";
		}
		return msg;
	}
	
}
