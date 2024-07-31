
package com.keerthana.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.model.Masters;
import com.keerthana.demo.repoisatory.MastersRepo;

@Service
public class MastersServiceImpl {
	
	@Autowired
	MastersRepo masterrepo;

	public String addPay(Masters pay) {
		if(pay!=null) {
		masterrepo.save(pay);
		return "success";
		}else {
			return "failed to add";
		}
		
	}

	public Masters getJob(int id) {
		return masterrepo.findById(id);
	}

	public List<Masters> getAllPayroll() {
		return masterrepo.findAll();
	}

	public String updatePayroll(Masters pay) {
		if(pay!=null) {
		masterrepo.update(pay);
		return "updated";
		}else {
			return "failed to update";
		}
		
	}

	public void deletePayroll(int id) {
		masterrepo.deleteById(id);
		
	}

}
