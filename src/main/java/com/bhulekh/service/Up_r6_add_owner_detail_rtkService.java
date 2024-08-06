package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_r6_add_owner_detail_rtkModel;

import com.bhulekh.repository.Up_r6_add_owner_detail_rtkRepo;


@Service
public class Up_r6_add_owner_detail_rtkService {
	

	@Autowired
	private Up_r6_add_owner_detail_rtkRepo up_r6_add_owner_detail_rtkRepo;

	public List<Up_r6_add_owner_detail_rtkModel> getAname(String villageCodeCensus,String khata_number,String unique_code,String order_no) {
		return up_r6_add_owner_detail_rtkRepo.getAname(villageCodeCensus,khata_number,unique_code,order_no);
	}
	
	
	
}
