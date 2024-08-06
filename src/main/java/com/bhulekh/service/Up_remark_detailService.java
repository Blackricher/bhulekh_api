package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_remark_detailModel;

import com.bhulekh.repository.Up_remark_detailRepo;
@Service
public class Up_remark_detailService {

	@Autowired
	private Up_remark_detailRepo up_remark_detailRepo;

	public List<Up_remark_detailModel> getRemarks(String villageCodeCensus,String khataNumber,String uniqueCode) {
		return up_remark_detailRepo.getRemarks(villageCodeCensus,khataNumber,uniqueCode);
	}
	
}
