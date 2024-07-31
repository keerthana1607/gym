package com.keerthana.demo.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keerthana.demo.model.Members;
import com.keerthana.demo.repoisatory.MembersRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MembersRepoImpl implements MembersRepo {

	@Autowired
	EntityManager eman;

	public void save(Members emp) {
		
		eman.persist(emp);

	}

	public String deleteById(int id) {
		Members emp = eman.find(Members.class, id);
		if (emp != null) {
			eman.remove(emp);
			return "deleted";
		} else {
			return "not deleted";
		}
	}

	@SuppressWarnings("unchecked")
	public List<Members> findAll() {
		String hql = "from Members";
		Query query = eman.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Members findById(int id) {
		return eman.find(Members.class, id);

	}

	@Override
	public String update(Members em) {

		if (em != null) {
			eman.merge(em);
			return "updated";
		} else {
			return "failed to update";
		}

	}

}
