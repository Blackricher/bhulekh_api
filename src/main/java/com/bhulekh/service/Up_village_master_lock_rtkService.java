package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_village_master_lock_rtkModel;
import com.bhulekh.repository.Up_village_master_lock_rtkRepo;

@Service
public class Up_village_master_lock_rtkService {

	@Autowired
	private Up_village_master_lock_rtkRepo up_village_master_lock_rtkRepo;
	
	public List<Up_village_master_lock_rtkModel> getStatus(String villageCodeCensus) {
		return up_village_master_lock_rtkRepo.getStatus(villageCodeCensus);
	}
}
