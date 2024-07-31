package com.keerthana.demo.repoisatory;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keerthana.demo.model.Masters;


@Repository
public interface MastersRepo  {

	String save(Masters pay);

	Masters findById(int id);

	List<Masters> findAll();

	String update(Masters pay);

	void deleteById(int id);

}
