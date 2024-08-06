package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_ss_detailModel;
import com.bhulekh.models.Up_tehsil_masterModel;
import com.bhulekh.repository.Up_ss_detailRepo;
@Service
public class Up_ss_detailService {
	@Autowired
	private Up_ss_detailRepo up_ss_detailRepo;

	public List<Up_ss_detailModel> getAllDistrict(String all) {
		return up_ss_detailRepo.getAllDistrict(all);
	}
	
	
	public List<Up_ss_detailModel> getAllTehsil(String districtCodeCensus) {
		return up_ss_detailRepo.getAllTehsil(districtCodeCensus);
	}
	
	public List<Up_ss_detailModel> getAllDetails(String tehsilCodeCensus) {
		return up_ss_detailRepo.getAllDetails(tehsilCodeCensus);
	}

	
}
