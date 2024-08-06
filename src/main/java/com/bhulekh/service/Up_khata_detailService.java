package com.bhulekh.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.entity.Up_khata_detail;
import com.bhulekh.models.Lr_payblex2Model;
import com.bhulekh.models.Lr_payblexModel;
import com.bhulekh.models.Up_khata_detailModel;
import com.bhulekh.repository.Up_gata_land_revenueRepo;
import com.bhulekh.repository.Up_khata_detailRepo;
import com.bhulekh.repository.Up_khata_detailRepoBackup;
@Service
public class Up_khata_detailService {
	
	@Autowired
	private Up_khata_detailRepo up_khata_detailRepo;
	
	 
	
	@Autowired
	private Up_khata_detailRepoBackup up_khata_detailRepoBackup;
	
	@Autowired
	private Up_gata_land_revenueRepo up_gata_land_revenueRepo;
	
	public List<Up_khata_detailModel> getfasliYear(String villageCodeCensus) {
		return up_khata_detailRepo.getfasliYear(villageCodeCensus);
	}
	public List<Up_khata_detailModel> getkhataone(String villageCodeCensus,String uniqueCode) {
		return up_khata_detailRepo.getkhataone(villageCodeCensus,uniqueCode);
	}
	
	public List<Up_khata_detailModel> getkhatatwo(String villageCodeCensus,String fasli_year,String khata_number) {
		return up_khata_detailRepoBackup.getkhatatwo(villageCodeCensus,fasli_year,khata_number);
	}
	



}
