package com.keerthana.demo.repoisatory;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.keerthana.demo.model.Members;


@Repository
public interface MembersRepo{
//public interface AppRepo extends JpaRepository<Application, Integer>{

	public void save(Members emp);

	public String deleteById(int id);

	public List<Members> findAll();

	public Members findById(int id);

	public String update(Members emp);
	
}
