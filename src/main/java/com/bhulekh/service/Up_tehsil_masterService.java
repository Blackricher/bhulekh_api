package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_tehsil_masterModel;
import com.bhulekh.repository.Up_tehsil_masterRepo;

@Service
public class Up_tehsil_masterService {

	@Autowired
	private Up_tehsil_masterRepo up_tehsil_masterRepo;

	public List<Up_tehsil_masterModel> getTehsilMaster(String districtCodeCensus) {
		return up_tehsil_masterRepo.getTehsil(districtCodeCensus);
	}

}
