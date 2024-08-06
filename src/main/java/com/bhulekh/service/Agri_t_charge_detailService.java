package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Agri_t_charge_detailMode;
import com.bhulekh.repository.Agri_t_charge_detailRepo;


@Service
public class Agri_t_charge_detailService {

	@Autowired
	private Agri_t_charge_detailRepo agri_t_charge_detailRepo;

	public List<Agri_t_charge_detailMode> getCharge(String villageCodeCensus,String uniqueCode) {
		return agri_t_charge_detailRepo.getCharge(villageCodeCensus,uniqueCode);
	}
}
