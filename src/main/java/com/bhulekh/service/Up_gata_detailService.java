package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_gata_detailModel;
import com.bhulekh.models.Up_gata_detail_1Model;
import com.bhulekh.models.Up_gata_sequence_partModel;
import com.bhulekh.repository.Up_gata_detailRepo;

@Service
public class Up_gata_detailService {

	@Autowired
	private Up_gata_detailRepo up_gata_detailRepo;

	public List<Up_gata_detailModel> getUniqueCode(String villageCodeCensus, String khasra_no) {
		return up_gata_detailRepo.getUniqueCode(villageCodeCensus, khasra_no);
	}

	public List<Up_gata_detailModel> getUniqueCodek(String villageCodeCensus, String khata_number) {
		return up_gata_detailRepo.getUniqueCodek(villageCodeCensus, khata_number);
	}

	public List<Up_gata_detailModel> getUniqueCoden(String villageCodeCensus, String name) {
		return up_gata_detailRepo.getUniqueCoden(villageCodeCensus, name);
	}

	public List<Up_gata_detailModel> getShreni(String villageCodeCensus, String It) {
		return up_gata_detailRepo.getShreni(villageCodeCensus, It);
	}

	// to get gata_seq_no, khata_number, part

	public List<Up_gata_sequence_partModel> getGataSeq(String villageCodeCensus, String unicode) {
		return up_gata_detailRepo.getGataSeq(villageCodeCensus, unicode);
	}

	public List<Up_gata_detail_1Model> getKayr(String villageCodeCensus, String uniqueCode, String part) {
		return up_gata_detailRepo.getKayr(villageCodeCensus, uniqueCode, part);
	}

}
