package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bhulekh.models.Up_ra_detailModel;

import com.bhulekh.repository.Up_ra_detailRepo;

@Service
public class Up_ra_detailService {

	@Autowired
	private Up_ra_detailRepo up_ra_detailRepo;

	public List<Up_ra_detailModel> getAllRaDistrict(String all) {
		return up_ra_detailRepo.getAllRaDistrict(all);
	}
	
	
	public List<Up_ra_detailModel> getAllRaTehsil(String districtCodeCensus) {
		return up_ra_detailRepo.getAllRaTehsil(districtCodeCensus);
	}
	
	public List<Up_ra_detailModel> getAllRaDetails(String tehsilCodeCensus) {
		return up_ra_detailRepo.getAllRaDetails(tehsilCodeCensus);
	}
	
}
