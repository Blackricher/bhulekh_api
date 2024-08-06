package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_ns_detailModel;

import com.bhulekh.repository.Up_ns_detailRepo;
@Service
public class Up_ns_detailService {
	@Autowired
	private Up_ns_detailRepo up_ns_detailRepo;

	public List<Up_ns_detailModel> getAllNsDistrict(String all) {
		return up_ns_detailRepo.getAllNsDistrict(all);
	}
	
	
	public List<Up_ns_detailModel> getAllNsTehsil(String districtCodeCensus) {
		return up_ns_detailRepo.getAllNsTehsil(districtCodeCensus);
	}
	
	public List<Up_ns_detailModel> getAllNsDetails(String tehsilCodeCensus) {
		return up_ns_detailRepo.getAllNsDetails(tehsilCodeCensus);
	}

	
}
