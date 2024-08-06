package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_gata_detailModel;


import com.bhulekh.repository.Up_gata_detailRepoBackup;

@Service
public class Up_gata_detail_backupService {

	@Autowired
	private Up_gata_detailRepoBackup up_gata_detailRepoBackup;
	
	public List<Up_gata_detailModel> getUniqueCodeB(String villageCodeCensus, String khasra_no,String fasli_year) {
		return up_gata_detailRepoBackup.getUniqueCodeB(villageCodeCensus, khasra_no,fasli_year);
	}
	
	public List<Up_gata_detailModel> getUniqueCodekB(String villageCodeCensus, String khata_number,String fasli_year) {
		return up_gata_detailRepoBackup.getUniqueCodekB(villageCodeCensus, khata_number,fasli_year);
	}
	public List<Up_gata_detailModel> getUniqueCodenB(String villageCodeCensus, String name,String fasli_year) {
		return up_gata_detailRepoBackup.getUniqueCodenB(villageCodeCensus,name,fasli_year);
	}
	public List<Up_gata_detailModel> getShreniB(String villageCodeCensus, String It,String fasli_year) {
		return up_gata_detailRepoBackup.getShreniB(villageCodeCensus,It,fasli_year);
	}
	
	
}
