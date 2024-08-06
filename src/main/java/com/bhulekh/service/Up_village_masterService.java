package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_village_masterModel;
import com.bhulekh.models.Up_villagelistModel;
import com.bhulekh.repository.Up_village_masterRepo;

@Service
public class Up_village_masterService {

	@Autowired
	private Up_village_masterRepo up_village_masterRepo;

	public List<Up_village_masterModel> getVillageMaster(String districtCodeCensus, String tehsilCodeCensus) {
		return up_village_masterRepo.getVillages(districtCodeCensus, tehsilCodeCensus);
	}

	// RTK Village
	public List<Up_village_masterModel> getVillageMasterRtk(String districtCodeCensus, String tehsilCodeCensus) {
		return up_village_masterRepo.getVillagesRtk(districtCodeCensus, tehsilCodeCensus);
	}

	public List<Up_villagelistModel> getVillageMasterlist(String tehsilCodeCensus, String chakbandi, String survey) {
		return up_village_masterRepo.getVillagelist(tehsilCodeCensus, chakbandi, survey);
	}

	public List<Up_villagelistModel> getVillageMasterlist(String tehsilCodeCensus) {
		return up_village_masterRepo.getVillagelist(tehsilCodeCensus);
	}

}
