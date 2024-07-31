package com.keerthana.demo.repoimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keerthana.demo.model.Masters;
import com.keerthana.demo.repoisatory.MastersRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MastersRepoImpl implements MastersRepo  {

	
	@Autowired
	EntityManager eman;
	
	@Override
	public String save(Masters pay) {
		if(pay!=null) {
		eman.persist(pay);
		return "success";
		}else {
			return "failed to add";
		}
		
	}

	@Override
	public Masters findById(int id) {
		
		return eman.find(Masters.class, id);
	}

	@Override
	public List<Masters> findAll() {
		String hql="from Masters";
		Query query=eman.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public String update(Masters pay) {
		if(pay!=null) {
		eman.merge(pay);
		return "updated";
		}else {
			return "failed to update";
		}
	}

	@Override
	public void deleteById(int id) {
		Masters job = eman.find(Masters.class , id);
		eman.remove(job);
		
	}

}
