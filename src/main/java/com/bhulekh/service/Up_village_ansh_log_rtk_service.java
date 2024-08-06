package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.repository.Up_gata_detailRepo;
import com.bhulekh.repository.Up_gata_detailRepo.ListOfAreaKhasraUniqueCode;
import com.bhulekh.repository.Up_village_ansh_log_rtk_repo;
import com.bhulekh.repository.Up_village_ansh_log_rtk_repo.ListOfAnshRTKWithCounter;

@Service
public class Up_village_ansh_log_rtk_service {
	@Autowired
	Up_village_ansh_log_rtk_repo up_village_ansh_log_rtk_repo;
	@Autowired
	Up_gata_detailRepo up_gata_detailRepo;

	boolean flgChkRTKAnsh = false;

	public List<ListOfAreaKhasraUniqueCode> findCounterRTK(String villageCodeCensus) {
		List<ListOfAnshRTKWithCounter> listOfAnshRTKWithCounter = up_village_ansh_log_rtk_repo
				.findCounterRTKAnsh(villageCodeCensus);
		for (ListOfAnshRTKWithCounter ll : listOfAnshRTKWithCounter) {
			if (ll.getCounter() == 1 && ll.getFlgansh().equalsIgnoreCase("0")) {
				flgChkRTKAnsh = false;
			} else if (ll.getCounter() == 1 && ll.getFlgansh().equalsIgnoreCase("1")) {
				flgChkRTKAnsh = false;
			} else if (ll.getCounter() == 1 && ll.getFlgansh().equalsIgnoreCase("2")) {
				flgChkRTKAnsh = true;
				break;
			} else if (ll.getCounter() > 1) {
				flgChkRTKAnsh = true;
				break;
			}
		}

		if (flgChkRTKAnsh) {
			return up_gata_detailRepo.findGataWithAreaUnique1(villageCodeCensus);
		} else {
			return up_gata_detailRepo.findGataWithAreaUnique2(villageCodeCensus);
		}

	}
}
