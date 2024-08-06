package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_land_type_detailModel;

import com.bhulekh.repository.Up_land_type_detailRepo;

@Service
public class Up_land_type_detailService {
@Autowired
Up_land_type_detailRepo up_land_type_detailRepo;
	
	public List<Up_land_type_detailModel> getLandTypeDesc(String uniqueCode) {
		return up_land_type_detailRepo.getLandTypeDesc(uniqueCode);
	}

}
