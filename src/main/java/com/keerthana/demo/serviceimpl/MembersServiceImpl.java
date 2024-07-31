package com.keerthana.demo.serviceimpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.model.Masters;
import com.keerthana.demo.model.Members;
import com.keerthana.demo.repoisatory.MembersRepo;
import com.keerthana.demo.service.MembersService;

import jakarta.persistence.EntityManager;

@Service
public class MembersServiceImpl implements MembersService{

	@Autowired
	MembersRepo emprepo;
	
	@Autowired
	EntityManager eman;



	public Members getApplication(int id){
		return emprepo.findById(id);
	}

	public List<Members> getAllApplication() {
		return emprepo.findAll();
	}

	

	public String deleteApplication(int id) {
		Members em = eman.find(Members.class, id);
		if(em!=null) {
			emprepo.deleteById(id);
			return "deleted";
		}
		
		else {
			return "failed";
		}
	}
	
	
	
	



	
	@Override
	public String addEmp(Members emp, int pId) {
		Masters py=eman.find(Masters.class, pId);
		if(py!=null) {
			emp.setMasters(py);
		emprepo.save(emp);
			return "success";
			
		}else {
			return "not saved";
		}

}

	


	public String updateApplication(Members emp, int eid) {
		Members em=eman.find(Members.class, eid);
		
		
		if(em!=null) {
			em.setUsername(emp.getUsername());
			em.setCity(emp.getCity());
			em.setEmail(emp.getEmail());
			em.setAge(emp.getAge());
			emprepo.update(em);
			return "updated";
		}else {
			return "failed to update";
		}
		
	}
	
	
}
