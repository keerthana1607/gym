package com.keerthana.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keerthana.demo.model.Masters;




@Service
public interface MastersService {
	
	
	public String addPay(Masters pay);
	public Masters getJob(int id);
	public List<Masters> getAllPayroll();
	public String updatePayroll(Masters pay);
	public void deletePayroll(int id);
}
