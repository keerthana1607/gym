package com.keerthana.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keerthana.demo.model.Members;



@Service
public interface MembersService {

	
	String addEmp(Members emp, int pId);
	public Members getApplication(int id);
	public List<Members> getAllApplication();
	public String deleteApplication(int id);
	public String updateApplication(Members emp, int eid);
}
